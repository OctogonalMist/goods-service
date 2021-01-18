USE `goods`;
CREATE TABLE `goods`
(
    `id`        int(11) NOT NULL AUTO_INCREMENT,
    `item_name` varchar(255) DEFAULT NULL,
    `price`     double NOT NULL,
    `quantity`  int(11) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `goods`
VALUES (1, 'Blender', 400, 3),
       (2, 'refrigerator', 350, 1),
       (3, 'iMac', 1000, 2),
       (4, 'CPU', 200, 1),
       (5, 'Car', 12450, 1);
