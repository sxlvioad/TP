create database consultora;

use consultora;

create table tema (
cod_tema varchar (6) primary key,
palabra_clave varchar (20),
descripcion varchar (20),
fecha_inicio date,
fecha_fin date
);

create table seguimiento (
cod_seguimiento int not null auto_increment primary key,
cod_tema varchar (6),
id_operador varchar (15),
mintv date,
mincentral date,
cant_notas int,
cant_tapas int,
apreciacion varchar (50),
foreign key (cod_tema) references tema(cod_tema)
);

create table operador (
id_operador int not null auto_increment primary key,
nombre_operador varchar (20)
);

create table redes_sociales (
red_social varchar (20) primary key,
pub_apoyo int,
pub_rechazo int,
pub_neutral int,
replicas int,
mg int
);
