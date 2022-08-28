CREATE TABLE IF NOT EXISTS `user` (
            `id` bigint NOT NULL,
            `email_address` varchar(255) DEFAULT NULL,
            `first_name` varchar(255) DEFAULT NULL,
            `last_name` varchar(255) DEFAULT NULL,
            PRIMARY KEY (`id`)
)