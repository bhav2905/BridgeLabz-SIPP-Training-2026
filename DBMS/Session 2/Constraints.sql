ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country)
REFERENCES countries(Country);