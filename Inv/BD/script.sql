DROP DATABASE IF EXISTS InventoryDB;
CREATE DATABASE InventoryDB;
use InventoryDB;
CREATE TABLE TipoArticulo (
    id int NOT NULL AUTO_INCREMENT,
    tipoArticulo varchar(255),
    descripcion varchar(255),
    Address varchar(255),
    fechaCreacion TIMESTAMP,
	PRIMARY KEY (ID)
);
/*--TipoRol: id, rol;*/
CREATE TABLE TipoRol (
    id int NOT NULL AUTO_INCREMENT,
    rol varchar(255),
    descripcion varchar(255),
    fechaCreacion TIMESTAMP,
	PRIMARY KEY (ID)
);

/*--Articulo: id, nombre, descripcion, fechaCreacion, usuarioAlta, codigoBarra, cantidadDisponibles, cantidadTrasladada, tipoArticulo;*/
CREATE TABLE Articulo (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255),
    descripcion varchar(255),
    fechaCreacion TIMESTAMP,
    idUsuarioAlta int,
    codigoBarra varchar(255),
    idTipoArticulo int,
    activo boolean,
	PRIMARY KEY (ID),
	FOREIGN KEY (idTipoArticulo) REFERENCES TipoArticulo(id)
);    

/*--Usuario: identificador, nombres, paterno, materno, usuario, password, fechaCreacion, activo, rol*/
CREATE TABLE Usuario (
    id int NOT NULL AUTO_INCREMENT,
    nombres varchar(255),
    paterno varchar(255),
    materno varchar(255),
    usuario varchar(255),
    password varchar(255),
    fechaCreacion TIMESTAMP,
    activo boolean,
    idTipoRol int,
	PRIMARY KEY (ID),
	FOREIGN KEY (idTipoRol) REFERENCES TipoRol(id)
);    

CREATE TABLE Almacen (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255),
    materno varchar(255),
    fechaCreacion TIMESTAMP,
    activo boolean,
    idDireccion int,
	PRIMARY KEY (ID)
);