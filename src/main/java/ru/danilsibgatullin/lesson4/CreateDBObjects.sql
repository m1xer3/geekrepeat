CREATE SCHEMA `cinema` ;

CREATE TABLE `cinema`.`films` (
  `filmId` INT NOT NULL AUTO_INCREMENT,
  `filmName` VARCHAR(250) NOT NULL,
  `timeCode`  INT NOT NULL,
  PRIMARY KEY (`filmId`),
  UNIQUE INDEX `filmid_UNIQUE` (`filmId` ASC) VISIBLE);

CREATE TABLE `cinema`.`available_price` (
  `priceId` INT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(4,2) NOT NULL,
  PRIMARY KEY (`priceId`),
  UNIQUE INDEX `priceId_UNIQUE` (`priceId` ASC) VISIBLE,
  UNIQUE INDEX `price_UNIQUE` (`price` ASC) VISIBLE);

  CREATE TABLE `cinema`.`sessions` (
    `sessionId` INT NOT NULL AUTO_INCREMENT,
    `session_start` DATETIME NOT NULL,
    `filmId` INT NOT NULL,
    `priceId` INT NOT NULL,
    PRIMARY KEY (`sessionId`),
    UNIQUE INDEX `sessionId_UNIQUE` (`sessionId` ASC) VISIBLE,
    INDEX `filmId_idx` (`filmId` ASC) VISIBLE,
    INDEX `priceId_idx` (`priceId` ASC) VISIBLE,
    CONSTRAINT `filmId`
      FOREIGN KEY (`filmId`)
      REFERENCES `cinema`.`films` (`filmId`)
      ON DELETE CASCADE
      ON UPDATE CASCADE,
    CONSTRAINT `priceId`
      FOREIGN KEY (`priceId`)
      REFERENCES `cinema`.`available_price` (`priceId`)
      ON DELETE CASCADE
      ON UPDATE CASCADE);

CREATE TABLE `cinema`.`sold_tickets` (
  `ticketId` INT NOT NULL AUTO_INCREMENT,
  `sessionId` INT NOT NULL,
  PRIMARY KEY (`ticketId`),
  UNIQUE INDEX `ticketId_UNIQUE` (`ticketId` ASC) VISIBLE,
  INDEX `sessionId_idx` (`sessionId` ASC) VISIBLE,
  CONSTRAINT `sessionId`
    FOREIGN KEY (`sessionId`)
    REFERENCES `cinema`.`sessions` (`sessionId`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


