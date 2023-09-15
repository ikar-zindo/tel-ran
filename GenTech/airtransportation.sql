CREATE TABLE `Clients` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`first_name` TEXT NOT NULL,
	`last_name` TEXT NOT NULL,
	`email` TEXT NOT NULL,
	`phone_number` TEXT NOT NULL,
	`birth_day` DATE NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Tickets` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`client_id` INT NOT NULL,
	`flight_id` INT NOT NULL,
	`class` TEXT NOT NULL,
	`price` DECIMAL NOT NULL,
	`airline_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Flights` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`airplane_id` INT NOT NULL,
	`status` TEXT NOT NULL,
	`schedule_arrival` DATETIME NOT NULL,
	`schedule_departure` DATETIME NOT NULL,
	`airport_arrival` VARCHAR(255) NOT NULL,
	`airport_departure` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Airports` (
	`id` TEXT NOT NULL AUTO_INCREMENT,
	`country_id` INT NOT NULL,
	`city` INT NOT NULL,
	`UTC` TIMESTAMP NOT NULL,
	PRIMARY KEY (`id`,`country_id`)
);

CREATE TABLE `Countries` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`country_name` TEXT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`,`country_name`)
);

CREATE TABLE `Airlines` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`airlines_name` TEXT NOT NULL,
	PRIMARY KEY (`id`,`airlines_name`)
);

ALTER TABLE `Tickets` ADD CONSTRAINT `Tickets_fk0` FOREIGN KEY (`client_id`) REFERENCES `Clients`(`id`);

ALTER TABLE `Tickets` ADD CONSTRAINT `Tickets_fk1` FOREIGN KEY (`flight_id`) REFERENCES `Flights`(`id`);

ALTER TABLE `Tickets` ADD CONSTRAINT `Tickets_fk2` FOREIGN KEY (`airline_id`) REFERENCES `Airlines`(`id`);

ALTER TABLE `Flights` ADD CONSTRAINT `Flights_fk0` FOREIGN KEY (`airport_arrival`) REFERENCES `Airports`(`id`);

ALTER TABLE `Flights` ADD CONSTRAINT `Flights_fk1` FOREIGN KEY (`airport_departure`) REFERENCES `Airports`(`id`);

ALTER TABLE `Airports` ADD CONSTRAINT `Airports_fk0` FOREIGN KEY (`country_id`) REFERENCES `Countries`(`id`);







