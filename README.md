#EN
# GitHub Repository Information Retrieval App

## Description

This application is written in Java using the Spring Boot framework. Its purpose is to retrieve information about GitHub repositories of a specific user, including their branches. The results are returned in JSON format.

## Requirements

- Java 17 (or compatible version)
- Maven
- Internet access (for communicating with the GitHub API)

## Usage Instructions

1. Clone the repository to your local machine.
2. Open the project in your preferred code editor.
3. In the `application.properties` file, set the value of `server.port` to the desired port number where you want to run the application.

## Configuration

No special configuration is required; the application works with default settings.

## Running

1. Open a terminal or command prompt.
2. Navigate to the main project directory.
3. Enter the command `mvn spring-boot:run` to start the application.
4. The application will be accessible at `http://localhost:port`, where `port` is the port number defined in `application.properties`.

## Endpoints

### Retrieving information about repositories of a specific user

- Endpoint: `/username`
- Method: GET
- Parameter: `username` (GitHub username)
- Example request: `http://localhost:port/username`
- Example response:
  ```json
  [
    {
      "name": "repository_name",
      "login": "user_name",
      "branches": [
        {
          "name": "branch_name",
          "sha": "commit_sha"
        },
        // additional branches
      ]
    },
    // additional repositories
  ]
## Notes
Aplikacja wykorzystuje REST API GitHuba do pobierania informacji o repozytoriach i gałęziach. Może istnieć limit zapytań API, więc zaleca się ostrożność przy wykonywaniu wielu zapytań w krótkim czasie.

## Author
Autor: Piotr Michalak
Konta

#PL
# Aplikacja do Pobierania Informacji o Repozytoriach GitHub

## Opis

Aplikacja jest napisana w języku Java przy użyciu frameworku Spring Boot. Jej celem jest pobieranie informacji o repozytoriach danego użytkownika GitHub oraz ich gałęziach. Wyniki są zwracane w formacie JSON.

## Wymagania

- Java 17 (lub kompatybilna wersja)
- Maven
- Dostęp do internetu (do komunikacji z API GitHub)

## Instrukcje Użycia

1. Sklonuj repozytorium na swoje urządzenie.
2. Otwórz projekt w swoim ulubionym edytorze kodu.
3. W pliku `application.properties` ustaw wartość `server.port` na numer portu, na którym chcesz uruchomić aplikację.

## Konfiguracja

Nie wymagana żadna specjalna konfiguracja, aplikacja działa na domyślnych ustawieniach.

## Uruchamianie

1. Uruchom terminal lub konsolę.
2. Przejdź do głównego katalogu projektu.
3. Wprowadź polecenie `mvn spring-boot:run` aby uruchomić aplikację.
4. Aplikacja będzie dostępna pod adresem `http://localhost:port`, gdzie `port` to numer portu zdefiniowany w `application.properties`.

## Endpoints

### Pobieranie informacji o repozytoriach danego użytkownika

- Endpoint: `/username`
- Metoda: GET
- Parametr: `username` (nazwa użytkownika GitHub)
- Przykładowe zapytanie: `http://localhost:port/username`
- Przykładowa odpowiedź:
  ```json
  [
    {
      "name": "nazwa_repozytorium",
      "login": "nazwa_uzytkownika",
      "branches": [
        {
          "name": "nazwa_galezi",
          "sha": "sha_commita"
        },
        // kolejne gałęzie
      ]
    },
    // kolejne repozytoria
  ]

## Uwagi
Aplikacja wykorzystuje REST API GitHuba do pobierania informacji o repozytoriach i gałęziach. Może istnieć limit zapytań API, więc zaleca się ostrożność przy wykonywaniu wielu zapytań w krótkim czasie.

## Autor
Autor: Piotr Michalak
Kontakt: piotr.michalak312@gmail.com