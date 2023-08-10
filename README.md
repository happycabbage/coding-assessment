# HCA Coding Assessment

This repository represents a simple API that stores and retrieves "Transactions".

Your task will be to add a new API end point that accepts a csv of transactions from one of three different sources,
transforms then inserts the data into our transaction repository. See the `TODO` section below for more details!

## API Overview

To start the API, run:

```shell
./mvnw spring-boot:run 
```

Now you can create a transaction with a  `POST` to `localhost:8080/transactions`

```json
{
  "id": "46c0917b-e62f-41fd-b111-f09b575ef2c3",
  "basketSize": 29.39,
  "budtenderId": "6908f98f-da5b-4566-8f8f-49f83b3806ed",
  "locationId": "3e3d99b2-d2e9-4142-b6ba-da9592e92b51",
  "timestamp": "2023-08-09T22:44:00.000+00:00"
}
```

You can then retrieve transaction with a `GET` to that same resource:

```json
[
  {
    "id": "46c0917b-e62f-41fd-b111-f09b575ef2c3",
    "basketSize": 29.39,
    "budtenderId": "6908f98f-da5b-4566-8f8f-49f83b3806ed",
    "locationId": "3e3d99b2-d2e9-4142-b6ba-da9592e92b51",
    "timestamp": "2023-08-09T22:44:00.000+00:00"
  }
]
```

Note that this project uses an in-memory embedded database for persistence, so if you restart the running service
anything you create will be gone!

## TODO

1. Add an API that accepts a CSV of transactions in one of the three formats defined in `src/main/fixtures`.
2. Take that csv and transform it into a `Transaction`, depending on the format, the CSVs we will use for testing can be found in `src/main/fixtures`.
   
Note there are three CSVs, each with data stored slightly differently.

`good_pos.csv` is the most similar to our transaction model.

`wonky_pos.csv` has a couple of curve balls in the data...

## Additional Questions

1. Imagine one of these data sources started providing us individual transactions in JSON via a webhook. How would you refactor your code to handle this with minimal duplication?
2. How easy would it be for us to add a fourth or fifth data source? How would you refactor your code to make it easier to handle new data sources?
