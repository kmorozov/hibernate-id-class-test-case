CREATE TABLE `eggs` (
  `id`         BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `color`      varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE `ham` (
  `id`         BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `color`      varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE `meal` (
  `eggs_id`         BIGINT(20) UNSIGNED NOT NULL,
  `ham_id`   BIGINT(20) UNSIGNED NOT NULL,
  PRIMARY KEY (eggs_id, ham_id),
  CONSTRAINT `fk_meal_eggs_id` FOREIGN KEY (`eggs_id`) REFERENCES `eggs` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_meal_ham_id` FOREIGN KEY (`ham_id`) REFERENCES `ham` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);