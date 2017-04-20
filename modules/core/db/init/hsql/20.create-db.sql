-- begin DEMO_CAR
alter table DEMO_CAR add constraint FK_DEMO_CAR_MANUFACTURER foreign key (MANUFACTURER_ID) references DEMO_MANUFACTURER(ID)^
alter table DEMO_CAR add constraint FK_DEMO_CAR_PHOTO foreign key (PHOTO_ID) references SYS_FILE(ID)^
create index IDX_DEMO_CAR_MANUFACTURER on DEMO_CAR (MANUFACTURER_ID)^
create index IDX_DEMO_CAR_PHOTO on DEMO_CAR (PHOTO_ID)^
-- end DEMO_CAR
