--Creacion DB --
CREATE DATABASE almacenesjuegos;

use almacenesjuegos;


--Creacion tablas --

CREATE TABLE almacen(
	idalmacen INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idciudad INT(6) NOT NULL,
	nombre VARCHAR(63) NOT NULL
	);


CREATE TABLE ciudad(
	idciudad INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	nombre VARCHAR(63) NOT NULL
	);



CREATE TABLE juego(
	idjuego INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idalmacen INT (6) NOT NULL,
	idcliente INT (6) NOT NULL,
	nombre VARCHAR(80) NOT NULL,
	estado BOOLEAN NOT NULL,
	fechainicio date,
	fechafin date,
	nombredirector VARCHAR(80) NOT NULL,
	productor VARCHAR(80) NOT NULL,
	marca VARCHAR(80) NOT NULL,
	año date,
	tecnologia VARCHAR(80) NOT NULL
	);
	
CREATE TABLE protagonistas(
	idprotagonista INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idjuego  INT (6) NOT NULL,
	nombre VARCHAR(80) NOT NULL,
	descripcion VARCHAR(200) NOT NULL
	);
	
CREATE TABLE precio(
	idprecio INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idjuego INT (6) NOT NULL,
	valor float(20) NOT NULL,
	fechacambio date NOT NULL
	);
	
CREATE TABLE cliente(
	idcliente INT (6) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	tipoidentificacion INT (2) NOT NULL,
	numeroidentificacion INT (10) NOT NULL,
	nombres VARCHAR(50) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	fechanacimiento date NOT NULL,
	edad INT (3) NOT NULL
	);
	
CREATE TABLE factura(
	idfactura INT (6)  AUTO_INCREMENT NOT NULL PRIMARY KEY,
	idjuego INT (6) NOT NULL,
	idcliente INT (6) NOT NULL, 
	idalmacen INT (6) NOT NULL,
	fecha date NOT NULL,
	valor float(20) NOT NULL
	);

--Generar llaves foreign--	

alter table almacen add constraint almacenciudad_fk foreign key (idciudad) references ciudad (idciudad);
alter table factura add constraint almacenfactura_fk foreign key (idalmacen) references almacen (idalmacen); 
alter table juego add constraint almacenjuego_fk foreign key (idalmacen) references almacen (idalmacen);
alter table protagonistas add constraint protagonistasjuego_fk foreign key (idjuego) references juego (idjuego);
alter table precio add constraint preciojuego_fk foreign key (idjuego) references juego (idjuego);
alter table factura add constraint usuariorol_fk foreign key (idjuego) references juego (idjuego);
alter table juego add constraint clientejuego_fk foreign key (idcliente) references cliente (idcliente);
alter table factura add constraint clientefactura_fk foreign key (idcliente) references cliente (idcliente);


--Llenado de tablas.--

INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (1,1,'Teusaquillo');
INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (2,1,'Andino');
INSERT INTO almacen (idalmacen, idciudad, nombre) VALUE (3,2,'Metro');

INSERT INTO ciudad (idciudad, nombre) VALUE (1, 'Bogota');
INSERT INTO ciudad (idciudad, nombre) VALUE (2, 'Medellin');
INSERT INTO ciudad (idciudad, nombre) VALUE (3, 'Cali');
INSERT INTO ciudad (idciudad, nombre) VALUE (4, 'Boyaca');
INSERT INTO ciudad (idciudad, nombre) VALUE (5, 'Cundinamarca');