create table rules
(
    rule_id int primary key AUTO_INCREMENT,
    rule_desc varchar(255) not null,
    is_active tinyint(1) default 1
);

create table user_rights
(
    right_id int primary key AUTO_INCREMENT,
    right_name varchar(255) not null,
    right_desc varchar(255)
);

create  table user_roles
(
    role_id int primary key AUTO_INCREMENT,
    role_name varchar(255) not null,
    role_desc varchar(255)
);

create table user_role_rights
(
    user_role_right_id int primary key AUTO_INCREMENT,
    right_id int not null,
    role_id int not null,
    foreign key(right_id) references user_rights(right_id) on delete cascade,
    foreign key(role_id) references user_roles(role_id) on delete cascade
);

create table books
(
    book_id int primary key AUTO_INCREMENT,
    isbn int(255) not null unique,
    book_name varchar(255),
    book_author varchar(255),
    is_available tinyint(1) default 0,
    is_ebook_available tinyint(1) default 0
);


create table books_inventory
(
    book_inventory_id int primary key AUTO_INCREMENT,
    book_id int not null,
    quantity int not null,
    foreign key(book_id) references books(book_id) on delete cascade
);


create table lending_books
(
    lending_book_id int primary key AUTO_INCREMENT,
    book_lend_price int not null,
    book_id int not null,
    foreign key(book_id) references books(book_id) on delete cascade
);

create table selling_books
(
    selling_book_id int primary key AUTO_INCREMENT,
    book_id int not null,
    sell_price int not null,
    foreign key(book_id) references books(book_id) on delete cascade
);

create table users
(
    user_id int primary key AUTO_INCREMENT,
    username varchar(255) not null,
    contact varchar(255) not null,
    pwd varchar(255) not null,
    salt varchar(255) not null,
    is_active tinyint(1) default 1,
    role_id int not null,
    foreign key(role_id) references user_roles(role_id) on delete cascade
);

create table charge_types
(
    charge_type_id int primary key AUTO_INCREMENT,
    charge_desc varchar(255) not null,
    is_active tinyint(1) default 1
);


create table members
(
    member_id int primary key AUTO_INCREMENT,
    member_name varchar(255) not null,
    contact varchar(255) not null,
    is_user tinyint(1) default 0,
    is_active tinyint(1) default 1,
    user_id int not null,
    foreign key(user_id) references users(user_id) on delete cascade
);


create table member_charges
(
    member_charge_id int primary key AUTO_INCREMENT,
    charge_type_id int not null,
    member_id int not null,
    member_charge_desc varchar(255),
    foreign key(charge_type_id) references charge_types(charge_type_id),
    foreign key(member_id) references members(member_id) on delete cascade
);


create table member_lending_books
(
    transaction_id int primary key AUTO_INCREMENT,
    member_id int not null,
    lending_book_id int not null,
    date_lended datetime not null,
    date_returned datetime,
    returning_date datetime not null,
    foreign key(member_id) references members(member_id) on delete cascade,
    foreign key(lending_book_id) references lending_books(lending_book_id) on delete cascade
);


create table sold_books
(
    transaction_id int primary key AUTO_INCREMENT,
    selling_book_id int not null,
    member_id int,
    buyer_name varchar(255),
    buyer_contact varchar(255),
    date_sold datetime not null,
    price_paid int not null,
    is_buyer_member tinyint(1) default 0,
    foreign key(member_id) references members(member_id) on delete cascade,
    foreign key(selling_book_id) references selling_books(selling_book_id) on delete cascade
);

