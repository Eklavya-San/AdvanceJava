drop database if exists book;
create database book;
use book;
create table books(
    id integer  ,
    name varchar(20),
    author varchar(20)
);

insert into books values(1,"Harry Potter", "Jermy");

insert into books values (2,"Vinland Saga","Rita Ora");