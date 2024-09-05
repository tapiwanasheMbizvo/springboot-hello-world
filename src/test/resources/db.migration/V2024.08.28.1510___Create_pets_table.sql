
CREATE TABLE pets_tb (
  id SERIAL PRIMARY KEY,
  pet_name VARCHAR(100) NOT NULL,
  pet_description VARCHAR(10000)  NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO pets_tb (pet_name, pet_description) values ('Spot', 'Naughty Brown Chihuaha'), ('Jack', 'Green African Mongose'), ('Rango', 'A bright coloured Gecko ');

