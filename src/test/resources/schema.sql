CREATE SEQUENCE IF NOT EXISTS todo_seq;

CREATE TABLE IF NOT EXISTS todo (
id BIGINT NOT NULL DEFAULT NEXTVAL('todo_seq') PRIMARY KEY,
username VARCHAR(100) NOT NULL,
title VARCHAR(100) NOT NULL,
description VARCHAR(250),
target_date DATE NOT NULL,
is_done BOOLEAN NOT NULL
);