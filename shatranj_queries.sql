drop database shatranj;
create database shatranj;
use shatranj;

create table countries
(
country_id int not null primary key,
country_name varchar(255) not null,
country_status varchar(255) not null default '0'
);

alter table  countries  modify country_status varchar(255) not null default 'active';

alter table countries modify country_id int  auto_increment;

insert into countries(country_name) values('Other countries');



create table chess_pieces
(
piece_id int not null primary key,
piece_name varchar(255) not null
);

CREATE TABLE `users` (
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `country_id` int(11) NOT NULL,
  `user_online` tinyint(1) NOT NULL default '0',
  `user_role` varchar(255) NOT NULL default 'player',
  `registration_date` datetime NOT NULL,
  `total_games` int(11) NOT NULL default '0',
  `total_wins` int(11) NOT NULL default '0',
  `total_draws` int(11) NOT NULL default '0',
  `total_points` int(11) NOT NULL default '0',
  `user_image` varchar(255) default NULL,
  `user_status` varchar(255) NOT NULL default 'active',
  `user_email` varchar(255) NOT NULL,
  `user_busy` tinyint(1) default NULL,
  PRIMARY KEY  (`user_name`),
  KEY `fk_country_id` (`country_id`),
  CONSTRAINT `fk_country_id` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

create table games_history
(
game_id int not null primary key AUTO_INCREMENT,
user1 varchar(255) not null,
user2 varchar(255) not null,
game_status varchar(255) not null,
start_date datetime not null,
end_date datetime,
winner varchar(255),
FOREIGN KEY (user1) REFERENCES users(user_name) ON UPDATE CASCADE,
FOREIGN KEY (user2) REFERENCES users(user_name) ON UPDATE CASCADE
);

ALTER TABLE games_history AUTO_INCREMENT=100;

create table moves
(
move_id int not null primary key,
game_id int not null,
piece_id int not null,
start_position varchar(255) not null,
end_position varchar(255) not null,
start_time datetime not null,
end_time datetime not null,
FOREIGN KEY (game_id) REFERENCES games_history(game_id)
ON UPDATE CASCADE
ON DELETE CASCADE,
FOREIGN KEY (piece_id) REFERENCES chess_pieces(piece_id) ON UPDATE CASCADE
);

alter table moves auto_increment=1;




