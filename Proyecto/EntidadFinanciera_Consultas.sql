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


# Cambiar para poner correos más largos:

ALTER TABLE EntidadFinanciera.CLIENTE
MODIFY COLUMN Correo varchar(50) not null;

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

ALTER TABLE EntidadFinanciera.ADMINISTRADOR
MODIFY column Correo varchar(50) not null;

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

ALTER TABLE EntidadFinanciera.CAJERO
MODIFY column Correo varchar(50) not null;

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

SELECT * FROM EntidadFinanciera.ADMINISTRADOR;
SELECT * FROM EntidadFinanciera.CLIENTE;
SELECT * FROM EntidadFinanciera.CUENTA_AHORROS;
SELECT * FROM EntidadFinanciera.CUENTA_CORRIENTE;
SELECT * FROM EntidadFinanciera.CAJERO;
