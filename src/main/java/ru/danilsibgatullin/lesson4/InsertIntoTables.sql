INSERT INTO `cinema`.`available_price` (`price`) VALUES ('350');
INSERT INTO `cinema`.`available_price` (`price`) VALUES ('450');
INSERT INTO `cinema`.`available_price` (`price`) VALUES ('550');

INSERT INTO `cinema`.`films` (`filmName`, `timecode`) VALUES ('Film1', '60');
INSERT INTO `cinema`.`films` (`filmName`, `timecode`) VALUES ('Film2', '90');
INSERT INTO `cinema`.`films` (`filmName`, `timecode`) VALUES ('Film3', '120');
INSERT INTO `cinema`.`films` (`filmName`, `timecode`) VALUES ('Film4', '120');

INSERT INTO `cinema`.`sessions` (`session_start`, `filmId`, `priceId`) VALUES ('2022-01-27 13:00:00', '1', '1');
INSERT INTO `cinema`.`sessions` (`session_start`, `filmId`, `priceId`) VALUES ('2022-01-27 15:00:00', '1', '2');
INSERT INTO `cinema`.`sessions` (`session_start`, `filmId`, `priceId`) VALUES ('2022-01-27 15:00:00', '2', '3');
INSERT INTO `cinema`.`sessions` (`session_start`, `filmId`, `priceId`) VALUES ('2022-01-27 13:00:00', '3', '1');
INSERT INTO `cinema`.`sessions` (`session_start`, `filmId`, `priceId`) VALUES ('2022-01-27 17:00:00', '1', '3');


INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('1');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('1');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('1');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('1');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('1');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('2');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('2');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('2');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('2');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('3');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('4');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('4');
INSERT INTO `cinema`.`sold_tickets` (`sessionId`) VALUES ('4');
