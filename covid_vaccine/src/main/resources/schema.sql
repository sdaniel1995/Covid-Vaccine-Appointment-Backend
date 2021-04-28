CREATE TABLE patients ( 
    id serial primary key, 
    fname text not null,
    lname text not null,
    age integer not null,
    sex text not null,
    username text not null,
    pass text not null
);

CREATE TABLE vaccineDistributor (
    id serial primary key,
    distributorName text not null,
    location_address text not null, 
    city text not null, 
    countryState text not null,
    zipcode integer not null
 );

CREATE TABLE appointments (
    id serial primary key, 
    patient_id integer references patients (id),
    vaccineDistributor_id integer references vaccineDistributor(id)
 );
