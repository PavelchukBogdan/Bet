CREATE TABLE public." coefficient"
(
  -- only integer type can be autoincremented, got varchar
  id varchar PRIMARY KEY,
  " coefficient" float,
  event_type_id varchar,
  match_id varchar,
  CONSTRAINT " coefficient_match_id_fk" FOREIGN KEY (match_id) REFERENCES public.match (id),
  CONSTRAINT " coefficient_event_type_id_fk" FOREIGN KEY (event_type_id) REFERENCES public.event_type (id)
);
CREATE UNIQUE INDEX " coefficient_id_uindex" ON public." coefficient" (id);