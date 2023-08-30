package com.example.zadanie.controller;

import com.example.zadanie.model.ErrorModel;
import com.example.zadanie.model.RepoModel;
import com.example.zadanie.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private RepoService repoService;

    @Autowired
    public Controller(RepoService repoService) {
        this.repoService = repoService;
    }

    @GetMapping(value = "/{username}",produces = "application/json")
    public ResponseEntity<List<RepoModel>> getRepoList(@PathVariable String username) {
        try {
            return new ResponseEntity(repoService.getRepoModels(username), HttpStatus.OK);
        }
        catch (HttpClientErrorException e) {
            ErrorModel errorModel = new ErrorModel(e.getStatusCode().value(), "user does not exist");
            return new ResponseEntity(errorModel, HttpStatus.NOT_FOUND);
        }


    }

}
