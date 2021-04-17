CREATE TABLE `hastane_otomasyonu`.`admin7` (
  `admin_id` INT NOT NULL AUTO_INCREMENT,
  `adi` VARCHAR(150) NULL DEFAULT 'adinizi girmediniz',
  `soyadi` VARCHAR(150) NULL,
  `email` VARCHAR(150) NULL,
  `sifre` VARCHAR(150) NULL,
  `tarih` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`admin_id`));
