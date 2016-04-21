-- DROP DATABASE angle;

CREATE DATABASE angle
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_IN'
       LC_CTYPE = 'en_IN'
       CONNECTION LIMIT = -1;

-- DROP TABLE users;

CREATE TABLE users
(
  id serial NOT NULL,
  user_name text NOT NULL,
  email text NOT NULL,
  address character(500),
  CONSTRAINT users_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE users
OWNER TO postgres;
