CREATE TABLE event_time
(

  id varchar PRIMARY KEY NOT NULL,
  name varchar NOT NULL,
  kind_of_sport_id varchar NOT NULL,
  CONSTRAINT even_time_kind_of_sport_id_fk FOREIGN KEY (kind_of_sport_id) REFERENCES public.kind_of_sport (id)
);
CREATE UNIQUE INDEX even_time_id_uindex ON event_time(id);

ALTER TABLE public.event_type ADD COLUMN even_time_id varchar;
ALTER TABLE public.event_type
  ADD CONSTRAINT event_type_even_time_id_fk
FOREIGN KEY (even_time_id) REFERENCES event_time(id);