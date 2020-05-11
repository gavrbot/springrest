CREATE TABLE public.dishes_table
(
    id integer NOT NULL DEFAULT nextval('dishes_table_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default" NOT NULL,
    price double precision NOT NULL,
    category character varying COLLATE pg_catalog."default",
    CONSTRAINT dishes_table_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE public.dishes_table
    OWNER to postgres;
INSERT INTO public.dishes_table(
    name, price, category)
VALUES ('Borsch', 50, 'Russian'), ('Spagetti', 70, 'Italian'), ('Margarita', 150, 'Pizza');