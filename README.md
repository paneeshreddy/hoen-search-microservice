# Hoen Search Microservice

## Overview

Hoen Search is a Java-based microservice built using the Dropwizard framework that provides hotel and rental car search functionality for cities in the Hoen Archipelago. It simulates a backend component of a distributed travel platform by exposing a RESTful `/search` endpoint that accepts a `city` query parameter and returns matching results in structured JSON format.

---

## Architecture

- Built using **Java + Dropwizard**
- Exposes a REST endpoint: `/search`
- Accepts query parameter: `city`
- Returns JSON response
- Runs on embedded Jetty server
- Includes Dropwizard admin & healthcheck endpoints

---
## API Endpoint

GET /search

### Query Parameter

- city (String) — Name of the city to search

### Example Request

GET http://localhost:8080/search?city=Slateport

### Example Response

```json
{
  "city": "Slateport",
  "hotels": ["Slateport Grand Hotel"],
  "rentalCars": ["Slateport Car Rentals"]
}
```
## How to Build

Run the following command:

```bash
mvn clean install
```
## How to Run

```bash
java -jar target/hoen-search-1.0-SNAPSHOT.jar server config.yml
```
Application runs at:
http://localhost:8080

## Technologies Used
- Java
- Dropwizard
- Maven
- Jetty
- REST APIs
