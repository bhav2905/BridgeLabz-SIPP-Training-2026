CREATE DATABASE COVID_DB;

USE COVID_DB;

CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Date DATE,
    Confirmed_Cases INT,
    Recoveries INT,
    Population BIGINT
);
CREATE TABLE covid_deaths (
    Country VARCHAR(100),
    Date DATE,
    Deaths INT
);
CREATE TABLE covid_vaccines (
    Country VARCHAR(100),
    Date DATE,
    Vaccine_Name VARCHAR(100),
    Doses_Administered BIGINT,
    Fully_Vaccinated BIGINT
);