
CREATE DATABASE `javarush` DEFAULT CHARSET=utf8;

GRANT ALL PRIVILEGES ON javarush.* TO 'service_user'@'localhost' IDENTIFIED BY 'password';

FLUSH PRIVILEGES;

USE javarush;

CREATE TABLE users (
  id INT AUTO INCREMENT ,
  username VARCHAR(64) NOT NULL ,
  password VARCHAR(75) NOT NULL ,
  email VARCHAR(75) NOT NULL ,
  PRIMARY KEY (`id`)
);

CREATE TABLE `categories` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(75) NOT NULL ,
  `weight` INT UNSIGNED NOT NULL DEFAULT 1 ,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;


-- Posts table
--  Stores Posts and the many-to-one relations with other tables/rows.
-- Here is a short rundown of the columns
--   id          Primary key
--   title       Post title
--   body        Post body (the actual post). Feel free to change the type.
--   posted_on   Post date. Shit MySQL DATETIME field, feel free to change
--   owner*      Foreign key, references users.id
--   category*   Foreign key, references categories.id
--   parent*     Foreign key, references this table's primary key column.
--                 The idea is to set this field to NULL to determine if
--                 if the post is the first in a thread.
-- NOTE:
--   There are some constraints on the relations. Updating a referenced field
--   will automatically update the referer as well.
--   By default here ON DELETE does nothing, except for the categories,
--   mostly as an example. ON DELETE CASCADE means in this case, that if you
--   DELETE a Category, any Posts in this Category will also be DELETE'd.
--   Feel free to change/adapt, I mostly did it as an example.
--
CREATE TABLE `posts` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(75) NOT NULL ,
  `body` TEXT NOT NULL ,
  `posted_on` DATETIME NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `owner` (`id` ASC) ,
  INDEX `category` () ,
  CONSTRAINT `owner`
    FOREIGN KEY (`id` )
    REFERENCES `forum`.`users` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `parent_post`
    FOREIGN KEY ()
    REFERENCES `forum`.`posts` ()
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `category`
    FOREIGN KEY ()
    REFERENCES `forum`.`categories` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;