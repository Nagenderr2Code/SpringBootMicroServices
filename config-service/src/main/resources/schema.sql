CREATE TABLE `properties` (
  `application` varchar(200) DEFAULT NULL,
  `profile` varchar(200) DEFAULT NULL,
  `label` varchar(200) DEFAULT NULL,
  `key` varchar(200) DEFAULT NULL,
  `value` int(11) DEFAULT NULL
);
INSERT INTO `properties` (`key`, `value`, `application`, `profile`, `label`)
VALUES ('max',1000,'limit-service','default','default');

INSERT INTO `properties` (`key`, `value`, `application`, `profile`, `label`)
VALUES ('min',1,'limit-service','default','default');