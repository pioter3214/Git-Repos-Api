package com.example.zadanie.service;

import com.example.zadanie.model.Branch;
import com.example.zadanie.model.BranchResponse;
import com.example.zadanie.model.RepoModel;
import com.example.zadanie.model.ResponseModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepoService {

    public List<ResponseModel> getRepoModels(String username){
        List<ResponseModel> responseModelList = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();

        RepoModel[] repoModels = restTemplate.getForObject("https://api.github.com/users/" + username + "/repos", RepoModel[].class);
        for (RepoModel repoModel : repoModels) {
            List<BranchResponse> branchResponseList = new ArrayList<>();
            Branch[] branches = restTemplate.getForObject("https://api.github.com/repos/" + username + "/" + repoModel.getName() + "/branches", Branch[].class);
            for (Branch branch:branches){
                branchResponseList.add(new BranchResponse(branch.getName(),branch.getCommit().getSha()));
            }
            ResponseModel responseModel = new ResponseModel();

            responseModel.setName(repoModel.getName());
            responseModel.setLogin(repoModel.getOwner().getLogin());
            responseModelList.add(responseModel);
            responseModel.setBranches(branchResponseList);
        }
            return responseModelList;
    }


}
