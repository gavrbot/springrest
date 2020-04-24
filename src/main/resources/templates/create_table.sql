CREATE TABLE public.dishes_table
(
    id integer NOT NULL,
    name character varying COLLATE pg_catalog."default",
    price double precision,
    category character varying COLLATE pg_catalog."default",
    CONSTRAINT dishes_table_pkey PRIMARY KEY (id)
);
INSERT INTO public.dishes_table(
    id, name, price, category)
VALUES (1, 'Borsch', 50, 'Russian');
INSERT INTO public.dishes_table(
    id, name, price, category)
VALUES (2, 'Spagetti', 60, 'Italian');
INSERT INTO public.dishes_table(
    id, name, price, category)
VALUES (3, 'Pelmeni', 70, 'Russian');