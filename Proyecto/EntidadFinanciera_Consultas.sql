# Crear las tablas

CREATE TABLE CLIENTE
(
Cedula integer not null primary key,
Nombre varchar(15) not null,
Apellido varchar(25) not null,
Direccion varchar(25) not null,
Telefono long not null,
Correo varchar(20) not null,
Contrasena varchar(30) not null
);

CREATE TABLE ADMINISTRADOR
(
Cedula integer not null primary key,
Nombre varchar(15) not null,
Apellido varchar(25) not null,
Direccion varchar(25) not null,
Telefono long not null,
Correo varchar(20) not null,
Contrasena varchar(30) not null,
IdAdmin int not null
);

CREATE TABLE CAJERO
(
Cedula integer not null primary key,
Nombre varchar(15) not null,
Apellido varchar(25) not null,
Direccion varchar(25) not null,
Telefono long not null,
Correo varchar(20) not null,
Contrasena varchar(30) not null,
IdCajero int not null,
Sueldo double not null
);


CREATE TABLE CUENTA_AHORROS
(
IdCuenta varchar(15) not null,
Saldo float not null,
IdCliente integer not null,
primary key (IdCuenta),
foreign key (IdCliente) references CLIENTE(Cedula)
);

CREATE TABLE CUENTA_CORRIENTE
(
IdCuenta varchar(15) not null,
Saldo float not null,
IdCliente integer not null,
primary key (IdCuenta),
foreign key (IdCliente) references CLIENTE(Cedula)
);


# Consultas:

SELECT * FROM ADMINISTRADOR;
SELECT * FROM CLIENTE;
SELECT * FROM CUENTA_AHORROS;
SELECT * FROM CUENTA_CORRIENTE;
SELECT * FROM CAJERO;
