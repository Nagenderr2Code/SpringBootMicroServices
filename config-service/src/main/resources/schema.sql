CREATE TABLE `properties` (
  `application` varchar(200) DEFAULT NULL,
  `profile` varchar(200) DEFAULT NULL,
  `label` varchar(200) DEFAULT NULL,
  `key` varchar(200) DEFAULT NULL,
  `value` varchar(200) DEFAULT NULL
);
INSERT INTO `properties` (`key`, `value`, `application`, `profile`, `label`)
VALUES ('max','1000','limit-service','default','latest');

INSERT INTO `properties` (`key`, `value`, `application`, `profile`, `label`)
VALUES ('min','1','limit-service','default','latest');