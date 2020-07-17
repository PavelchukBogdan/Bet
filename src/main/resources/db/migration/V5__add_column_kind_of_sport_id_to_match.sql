ALTER TABLE public.match ADD kind_of_sport_id varchar NULL;
ALTER TABLE public.match
  ADD CONSTRAINT match_kind_of_sport_id_fk
FOREIGN KEY (kind_of_sport_id) REFERENCES public.kind_of_sport (id);