create table categories
(
    id   tinyint  auto_increment    not null
        primary key,
    name varchar(255) not null
);

create table products
    (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name varchar(255) not null,
        price decimal(10, 2) not null,
        category_id tinyint,
        constraint fk_category
            foreign key (category_id) references categories(id)
                on delete restrict

);