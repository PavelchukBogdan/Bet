

create table bet (
  id        varchar(255) not null,
  bet_date  timestamp,
  invested  int8,
  result    int8,
  status_id varchar(255),
  user_id   varchar(255) not null,
  primary key (id)
);
   create table bet_event_type_match (
  bet_id        varchar(255) not null,
  event_type_id varchar(255) not null,
  match_id      varchar(255) not null,
  primary key (bet_id, event_type_id, match_id)
);
   create table event_match (
  event_type_id varchar(255) not null,
  match_id      varchar(255) not null,
  primary key (event_type_id, match_id)
);
  create table event_type (
  id         varchar(255) not null,
  event_type varchar(255),
  primary key (id)
);
   create table kind_of_sport (
  id            varchar(255) not null,
  kind_of_sport varchar(255),
  primary key (id)
);
  create table match (
  id            varchar(255) not null,
  date_event    timestamp,
  name_event    varchar(255),
  home_team_id  varchar(255) not null,
  guest_team_id varchar(255) not null,
  primary key (id)
);
   create table role (
  id   varchar(255) not null,
  role varchar(255),
  primary key (id)
);
   create table status (
  id     varchar(255) not null,
  status varchar(255),
  primary key (id)
);
  create table team (
  id               varchar(255) not null,
  name             varchar(255),
  kind_of_sport_id varchar(255) not null,
  primary key (id)
);
  create table users (
  id            varchar(255) not null,
  cash_account  int8,
  date_of_birth timestamp,
  email         varchar(255),
  fatherland    varchar(255),
  name          varchar(255),
  password      varchar(255),
  surname       varchar(255),
  role_id       varchar(255) not null,
  primary key (id)
);
   alter table if exists bet
  add constraint FK2oh7l1ijomd6g6253ed22lyi0 foreign key (status_id) references status;
 alter table if exists bet
  add constraint FKq5rv2e6soot2iosewr8r4i235 foreign key (user_id) references users;
 alter table if exists bet_event_type_match
  add constraint FKnmysvipf6ljvt7la2m1l2fvhc foreign key (event_type_id, match_id) references event_match;
 alter table if exists bet_event_type_match
  add constraint FKhx7kdlfskd7xu0g4ygu77g1ch foreign key (bet_id) references bet;
 alter table if exists event_match
  add constraint FK3ss4ot9xxdhij7eebx5teq03j foreign key (event_type_id) references event_type;
 alter table if exists event_match
  add constraint FKcq5l3q237ea9eg9vo43di4l98 foreign key (match_id) references match;
 alter table if exists match
  add constraint FK6ihefb9r7f0fcm0xuves72b2l foreign key (home_team_id) references team;
 alter table if exists match
  add constraint FKkkhvbvelajjhox9d9cecmbb1r foreign key (guest_team_id) references team;
 alter table if exists team
  add constraint FKb2w1sv33haglq22aw06m6x5ve foreign key (kind_of_sport_id) references kind_of_sport;
 alter table if exists users
  add constraint FK4qu1gr772nnf6ve5af002rwya foreign key (role_id) references role