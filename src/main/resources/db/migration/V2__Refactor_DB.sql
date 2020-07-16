drop table bet_event_type_match;
alter table event_type add column kind_of_sport_id varchar;
ALTER TABLE public.event_type
  ADD CONSTRAINT event_type_kind_of_sport_id_fk
FOREIGN KEY (kind_of_sport_id) REFERENCES public.kind_of_sport (id);

CREATE TABLE public.events_bet_match
(
  id varchar PRIMARY KEY NOT NULL,
  bet_id varchar,
  event_type_id varchar,
  match_id varchar,
  bet bigint,
  result bigint,
  CONSTRAINT events_bet_match_bet_id_fk FOREIGN KEY (bet_id) REFERENCES public.bet (id),
  CONSTRAINT events_bet_match_event_type_id_fk FOREIGN KEY (event_type_id) REFERENCES public.event_type (id),
  CONSTRAINT events_bet_match_match_id_fk FOREIGN KEY (match_id) REFERENCES public.match (id)
);
CREATE UNIQUE INDEX events_bet_match_id_uindex ON public.events_bet_match (id);

ALTER TABLE public.match RENAME COLUMN date_event TO match_date;
ALTER TABLE public.match RENAME COLUMN name_event TO match_name;
ALTER TABLE public.match ADD home_team_score int NULL;
ALTER TABLE public.match ADD guest_team_score int NULL;
