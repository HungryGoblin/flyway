drop table students if exists cascade;
create table students (id bigserial primary key, name varchar(255), score int);
insert into students (name, score) values
('Bob', 840),
('John', 740),
('Jack', 903),
('Bob1', 802),
('John1', 701),
('Jack1', 910),
('Bob2', 801),
('John2', 720),
('Jack2', 904),
('Bob3', 803),
('John3', 730),
('Jack3', 940),
('Bob4', 830),
('John4', 730),
('Jack4', 920),
('Bob5', 802),
('John5', 701),
('Jack5', 910);