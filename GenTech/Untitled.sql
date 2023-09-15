CREATE TABLE `Clients` (
  `id` integer PRIMARY KEY,
  `first_name` text,
  `last_name` text,
  `email` text,
  `phone_number` text,
  `birth_day` date
);

CREATE TABLE `Tickets` (
  `id` integer PRIMARY KEY,
  `client_id` integer,
  `flight_id` integer,
  `class` text,
  `price` decimal,
  `airline_id` integer
);

CREATE TABLE `Flights` (
  `id` integer PRIMARY KEY,
  `airplane_id` integer,
  `status` text,
  `schedule_arrival` datetime,
  `schedule_departure` datetime,
  `airport_arrival` string,
  `airport_departure` string
);

CREATE TABLE `Airports` (
  `id` text,
  `country_id` integer,
  `city` integer,
  `UTC` timestamp,
  PRIMARY KEY (`id`, `country_id`)
);

CREATE TABLE `Countries` (
  `id` integer PRIMARY KEY,
  `country_name` text
);

CREATE TABLE `Airlines` (
  `id` integer,
  `airlines_name` text,
  PRIMARY KEY (`id`, `airlines_name`)
);

ALTER TABLE `Tickets` ADD FOREIGN KEY (`client_id`) REFERENCES `Clients` (`id`);

ALTER TABLE `Airports` ADD FOREIGN KEY (`id`) REFERENCES `Flights` (`airport_arrival`);

ALTER TABLE `Airports` ADD FOREIGN KEY (`id`) REFERENCES `Flights` (`airport_departure`);

ALTER TABLE `Airports` ADD FOREIGN KEY (`country_id`) REFERENCES `Countries` (`id`);

ALTER TABLE `Airlines` ADD FOREIGN KEY (`id`) REFERENCES `Flights` (`airplane_id`);

ALTER TABLE `Flights` ADD FOREIGN KEY (`id`) REFERENCES `Tickets` (`flight_id`);
