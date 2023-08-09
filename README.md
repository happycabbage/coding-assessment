# HCA Coding Assessment

This repository represents a simple API that stores and retrieves "Transaction".

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

Note that this project usings an in-memory embedded database for persistence, so if you restart the running service anything you create will be gone!
