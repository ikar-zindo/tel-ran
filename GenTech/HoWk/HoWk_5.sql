drop schema if exists streaming+;

-- 1. Создание БД `streaming`.

-- создание БД 'streaming'
create database streaming+;
use streaming+;

-- создание таблиц 'users'
create table  users (
   user_id int primary key auto_increment,
   created_at timestamp,
   username varchar(32),
   country varchar(32),
   is_blocked bool
);

-- создание таблиц 'streams'
create table  streams (
   stream_id int primary key auto_increment,
   created_at timestamp,
   title varchar(128),
   author_id int,
   is_completed bool
);

-- создание таблиц 'reactions'
create table  reactions (
   reaction_id int primary key auto_increment,
   created_at timestamp,
   author_id int,
   stream_id int,
   value int
);

-- создание таблиц 'donations'
create table donations (
   donation_id int primary key auto_increment,
   created_at timestamp,
   stream_id int,
   donator_id int,
   amount float
);

-- 2. Наполнить каждую из таблиц БД `streaming` несколькими записями.

-- наполнение таблицы 'users'
insert into users (created_at, username, country, is_blocked)
values   ('2021-04-02 12:00', 'Willy Wonka', 'USA', false),
         ('2021-07-02 13:00', 'Siegfried', 'Germany', false),
         ('2021-07-02 13:21', 'Dr. Robert Bruce Banner', 'USA', false),
         ('2021-12-25 00:01', 'Yeshua Ha Notzri', 'Israel ', true),
         ('2022-01-01 13:00', 'Dr John H. Watson', 'UK', false),
         ('2022-01-02 07:21', 'Buddha', 'Nepal', false),
         ('2022-01-02 13:15', 'Don Quixote', 'Spanian', false),
         ('2022-01-02 13:21', 'Ole Lukoje', 'Denmark', true),
         ('2022-06-02 12:18', 'Frederick Krueger', 'USA', false),
         ('2022-07-02 13:17', 'Ganesha', 'India', false);

-- наполнение таблицы 'streams'
insert into streams (created_at, title, author_id, is_completed)
values   ('2023-01-01 12:00', 'Stram 1', 6, true),
         ('2023-01-02 12:00', 'Stram 2', 6, true),
         ('2023-02-02 12:00', 'Stram 3', 4, true),
         ('2023-02-03 12:00', 'Stram 4', 4, true),
         ('2023-02-04 12:00', 'Stram 5', 2, true),
         ('2023-04-01 12:00', 'Stram 6', 1, true),
         ('2023-05-05 12:00', 'Stram 7', 10, true),
         ('2023-05-13 12:00', 'Stram 8', 9, true),
         ('2023-08-22 12:00', 'Stram 9', 3, true),
         ('2023-08-21 12:00', 'Stram 10', 3, true);

-- наполнение таблицы 'donations'
insert into donations (created_at, stream_id, donator_id, amount)
values   ('2023-01-01 14:00', 1, 1, 200),
         ('2023-01-01 14:00', 1, 4, 100),
         ('2023-01-01 14:00', 1, 5, 20),
         ('2023-01-01 14:00', 1, 10, 1000),
         ('2023-01-02 14:00', 2, 10, 1000),
         ('2023-01-02 14:00', 2, 5, 20),
         ('2023-02-02 14:00', 3, 5, 80),
         ('2023-02-02 14:00', 3, 10, 200),
         ('2023-02-03 15:00', 4, 5, 100),
         ('2023-03-03 01:00', 10, 5, 200),
         ('2023-05-05 15:00', 4, 7, 100),
         ('2023-05-05 15:00', 6, 7, 500),
         ('2023-05-15 00:00', 8, 8, 350);

-- наполнение таблицы 'reactions'
insert into reactions (created_at, stream_id, author_id, value)
values   ('2023-01-01 14:00', 1, 1, 1),
         ('2023-01-01 14:00', 1, 2, 1),
         ('2023-01-01 14:00', 1, 3, 1),
         ('2023-01-01 14:00', 1, 4, 1),
         ('2023-01-01 14:00', 1, 5, 1),
         ('2023-01-01 14:00', 1, 6, 1),
         ('2023-01-01 14:00', 1, 7, 1),
         ('2023-01-01 14:00', 1, 8, 1),
         ('2023-01-01 14:00', 1, 9, 1),
         ('2023-01-01 14:00', 1, 10, 1),
         ('2023-01-02 14:00', 2, 10, 1),
         ('2023-02-02 14:00', 3, 5, 1),
         ('2023-02-02 14:00', 3, 10, 1),
         ('2023-02-02 14:00', 3, 5, 1),
         ('2023-02-02 14:00', 3, 5, -1),
         ('2023-02-02 14:00', 3, 6, -1),
         ('2023-02-02 14:00', 3, 8, -1),
         ('2023-02-03 15:00', 4, 5, 1),
         ('2023-03-03 01:00', 10, 5, 1),
         ('2023-05-05 15:00', 4, 7, 1),
         ('2023-05-05 15:00', 6, 7, 1),
         ('2023-05-15 00:00', 8, 8, 1),
         ('2023-08-23 00:00', 9, 4, -1);


-- В рамках БД `streaming` написать след/запросы:

-- 3. Вывести данные о `стримах` (проекция: `название стрима`*,* `имя автора стрима`).

select
	streams.title,
	users.username
from streams 

join users on streams.author_id = users.user_id

-- 4. Вывести `юзеров`, у которых отсутствуют `стримы`.

select *
from users

left join streams 
on users.user_id = streams.author_id

where 
	streams.author_id is null