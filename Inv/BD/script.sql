DROP DATABASE IF EXISTS InventoryDB;
CREATE DATABASE InventoryDB;
use InventoryDB;
/* Homologado en Java*/
CREATE TABLE TipoArticulo (
    id int NOT NULL AUTO_INCREMENT,
    tipoArticulo varchar(255),
    descripcion varchar(255),
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID)
);
/*--TipoRol: id, rol; Homologado en Java*/
CREATE TABLE TipoRol (
    id int NOT NULL AUTO_INCREMENT,
    tipoRol varchar(255),
    descripcion varchar(255),
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID)
);

/*--Articulo: id, nombre, descripcion, fechaCreacion, usuarioAlta, codigoBarra, cantidadDisponibles, cantidadTrasladada, tipoArticulo;*/
/* Homologado en Java*/
CREATE TABLE Articulo (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255),
    descripcion varchar(255),
    codigoBarra varchar(255),
    idTipoArticulo int,
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID),
	FOREIGN KEY (idTipoArticulo) REFERENCES TipoArticulo(id)
);    

/*--Usuario: identificador, nombres, paterno, materno, usuario, password, fechaCreacion, activo, rol*/
/*Homologado en Java*/
CREATE TABLE Usuario (
    id int NOT NULL AUTO_INCREMENT,
    nombres varchar(255),
    paterno varchar(255),
    materno varchar(255),
    usuario varchar(255),
    pass varchar(255),
    idTipoRol int,
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID),
	FOREIGN KEY (idTipoRol) REFERENCES TipoRol(id)
);    

/** Homologada en Java */
CREATE TABLE Direccion (
    id int NOT NULL AUTO_INCREMENT,
    numero varchar(100),
    calle varchar(255),
    colonia varchar(255),
    municipio varchar(255),
    estado varchar(255),
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID)
);

CREATE TABLE Almacen (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255),
    descripcion varchar(255),
    telefono1 varchar(20),
    telefono2 varchar(20),
    idDireccion int,
    idUsuarioAlta int,
    idUsuarioActualiza int,
    fechaCreacion TIMESTAMP,
    fechaActualiza TIMESTAMP,
    activo boolean,
	PRIMARY KEY (ID),
    FOREIGN KEY (idDireccion) REFERENCES Direccion(id)
);