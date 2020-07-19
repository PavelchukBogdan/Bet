ALTER TABLE public.bet ALTER COLUMN invested TYPE double precision USING invested::double precision;
ALTER TABLE public.bet ALTER COLUMN result TYPE double precision USING result::double precision;
ALTER TABLE public.users ALTER COLUMN cash_account TYPE double precision USING cash_account::double precision;