-- liquibase formatted sql

-- changeset liquibase:1
CREATE TABLE public.transactions
(
    id        uuid primary key ,
    budtender_id        uuid ,
    location_id        uuid ,
    basket_size       double PRECISION,
    timestamp_ timestamp
);
