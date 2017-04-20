-- begin DEMO_MANUFACTURER
create table DEMO_MANUFACTURER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    COUNTRY varchar(255),
    --
    primary key (ID)
)^
-- end DEMO_MANUFACTURER
-- begin DEMO_CAR
create table DEMO_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MANUFACTURER_ID varchar(36),
    MODEL varchar(255),
    CAR_TYPE varchar(50),
    PHOTO_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMO_CAR
