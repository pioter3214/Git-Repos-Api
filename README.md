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