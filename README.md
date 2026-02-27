# Hoen Search Microservice

## Overview

Hoen Search is a Dropwizard-based Java microservice designed to provide hotel and rental car search results for cities in the Hoen Archipelago.

The service exposes a REST API endpoint that accepts a city as a query parameter and returns matching hotels and rental car services.

---

## Architecture

- Built using **Java + Dropwizard**
- Exposes a REST endpoint: `/search`
- Accepts query parameter: `city`
- Returns JSON response
- Runs on embedded Jetty server
- Includes Dropwizard admin & healthcheck endpoints

---

## How to Build

Run the following command:

```bash
mvn clean install
