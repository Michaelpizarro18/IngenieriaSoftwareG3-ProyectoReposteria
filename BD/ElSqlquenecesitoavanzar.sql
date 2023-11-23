create database P_Sales_System

use P_Sales_System
go
-------------------------


CREATE TABLE Categoria(
	idCategoria int identity(100,1) primary key,
	catnombre varchar(100)
);
GO

CREATE TABLE Proveedor(
	idProveedor int identity(1000,5) primary key,
	pronombre varchar(100),
	direccion varchar(255)
);
GO

CREATE TABLE Detalle(
	idDetalleVenta int identity(1,1) primary key,
	idVenta int,
	r_producto varchar(100),
	cantidad int,
	precio float,
	descuento float,
	subtotal float,
	foreign key (idVenta) REFERENCES Venta(idVenta)
)

CREATE TABLE Producto(
	idProducto int identity (418,6) primary key, 
	nombre varchar(100),
	precio float,
	receta VARCHAR (300),
	foto image,
	categoria int foreign key references Categoria(idCategoria),
	proveedor int foreign key references Proveedor(idProveedor)
);
GO
ALTER TABLE Producto
ADD receta VARCHAR(300);

ALTER TABLE Producto
ALTER COLUMN receta NVARCHAR(1000); 

ALTER TABLE Producto
ADD foto image;


SELECT * FROM Producto
UPDATE Producto
SET receta = N'Para el delicioso pastel de fresa, mezcla 2 1/2 tazas de harina de trigo, 1 1/2 tazas de azúcar, 1 taza de leche, 1/2 taza de mantequilla derretida, 4 huevos, 2 cucharaditas de polvo de hornear, 1 cucharadita de extracto de vainilla y 1/4 de cucharadita de sal. Divide la masa entre dos moldes de 23 cm y hornea a 180°C durante 25-30 minutos. Deja enfriar y coloca uno de los pasteles en un plato. Cubre con crema batida y fresas, luego coloca el segundo pastel encima y decora con más crema batida, fresas y azúcar glas (opcional). ¡Listo para disfrutar este delicioso pastel de fresa!'
WHERE idProducto = 622;

CREATE TABLE Venta(
	idVenta int identity(1,1) primary key,
	fecha date,
	total float
);
GO

Select * from Venta
Select * from Detalle



CREATE TABLE PROBANDO(
	idProbando int identity(1,1) primary key,
	r_producto varchar(100),
	cantidad int,
	precio float,
	descuento float,
	subtotal float,
	impuesto float,
	total float,
);
GO

DROP TABLE DetalleVenta;
select * from PROBANDO;


CREATE TABLE Factura(
	idFactura int identity (1,1) primary key,
	fecha datetime,
	total float,
	venta int foreign key references Venta(idVenta)
);
GO
CREATE TABLE Cuenta (
IDCuenta int identity (1,1) primary key,
Usuario varchar (50),
Contraseña varchar (50)
);
Go
----------------------------------
--Cuenta de la reposteria:

Insert Into Cuenta Values ('Paula','paula123456');
-----------------------------------
--CATEGORÍAS
INSERT INTO Categoria (catnombre) VALUES
('Pasteles'),
('Galletas'),
('Flanes'),
('Gelatinas');
go

--PROVEEDORES
INSERT INTO Proveedor (pronombre, direccion) VALUES
('Mercado de Ingeniería', 'Av. Luna Pizarro 277, San Martín de Porres 15103'),
('Mercado Milagros','Ca. Sta. Mercedes 184, San Martín de Porres 15103')
go

--PRODUCTOS
INSERT INTO Producto (nombre,precio,categoria,proveedor) VALUES
('Keke de Chocolate', 20.0, 100, 1005),
('Pastel 3 Leches', 22.0, 100, 1000),
('Pie de Manzana', 18.0, 100, 1000),
('Pastel de Queso', 25.0, 100, 1000),
('Pastel de Selva Negra', 45.0, 100, 1005),
('Pastel de Moka', 50.0, 100, 1005),

('Rosquita', 0.20, 101, 1005),
('Alfajores', 0.30, 101, 1000),
('Empanadas Dulces', 1.0, 101, 1000),
('Empanadas Dulces con relleno', 0.40, 101, 1000),
('Galletas de Chocolate', 0.40, 101, 1005),
('Milhojas', 1.50, 101, 1000),

('Flan Clasico', 1.50, 102, 1005),
('Flan de Coco', 2.0, 102, 1005),
('Flan de Maracuya', 2.0, 102, 1005),
('Flan de Chocolate', 2.0, 102, 1005),
('Flan con Gelatina', 2.0, 102, 1005),
('Flan Napolitano', 2.0, 102, 1005),

('Gelatina de Mosaico', 2.50, 103, 1005),
('Gelatina con Leche', 1.50, 103, 1000),
('Torta Helada', 50.0, 103, 1005)
Go


--------------------------------

CREATE PROCEDURE SP_E_DETALLEVENTA 
	@idVenta int,
	@r_producto varchar(100),
	@cantidad int,
	@descuento float,
	@subtotal float,
	@impuesto float,
	@total float
AS
BEGIN	
	INSERT INTO DetalleVenta (idVenta, r_producto, cantidad, descuento, subtotal, impuesto, total)
					  VALUES (@idVenta, @r_producto, @cantidad, @descuento, @subtotal, @impuesto, @total)
END;


CREATE PROCEDURE SP_E_VENTA
	@total float
AS
BEGIN
	INSERT INTO Venta (fecha, total)	
			   VALUES (GETDATE(), @total)
END;


CREATE PROCEDURE SP_E_FACTURA
	@total float,
	@venta int
AS
BEGIN
	INSERT INTO Factura (fecha, total, venta)
				 VALUES (GETDATE(), @total, @venta)
END;
--------------------------------------------------------
CREATE PROCEDURE InsertarProducto
    @nombre VARCHAR(100),
    @precio FLOAT,
    @categoria INT,
    @proveedor INT,
    @receta NVARCHAR(500),
    @foto image
AS
BEGIN
    INSERT INTO Producto (nombre, precio, categoria, proveedor, receta, foto)
    VALUES (@nombre, @precio, @categoria, @proveedor, @receta, @foto);
END;


---------------------------------------------------------
CREATE PROCEDURE ActualizarProducto
    @idProducto INT,
    @nombre VARCHAR(100),
    @precio FLOAT,
    @categoria INT,
    @proveedor INT,
    @receta NVARCHAR(500),
    @foto image
AS
BEGIN
    UPDATE Producto
    SET nombre = @nombre, precio = @precio, categoria = @categoria, proveedor = @proveedor, receta = @receta, foto = @foto
    WHERE idProducto = @idProducto;
END;

CREATE PROCEDURE ActualizarProducto2
    @idProducto INT,
    @nombre VARCHAR(100),
    @precio FLOAT,
    @categoria INT,
    @proveedor INT,
    @receta NVARCHAR(500)
AS
BEGIN
    UPDATE Producto
    SET nombre = @nombre, precio = @precio, categoria = @categoria, proveedor = @proveedor, receta = @receta
    WHERE idProducto = @idProducto;
END;
----------------------------------------------------------------------
CREATE PROCEDURE EliminarProducto
    @idProducto INT
AS
BEGIN
    DELETE FROM Producto
    WHERE idProducto = @idProducto;
END;

-------------------------------------
CREATE PROCEDURE MostrarTodosLosProductos
AS
BEGIN
    SELECT * FROM Producto;
END;

------------
CREATE PROCEDURE sp_GetProveedorNames
AS
BEGIN
    SELECT idProveedor, pronombre FROM Proveedor;
END;

-----------
CREATE PROCEDURE sp_GetCategoria
AS
BEGIN
    SELECT idCategoria, catnombre FROM Categoria;
END;

---------------------
CREATE PROCEDURE sp_GetProductoNames
AS
BEGIN
    SELECT nombre FROM Producto;
END;

-------------------------
CREATE PROCEDURE sp_GetPrecioPorNombre(p_nombre VARCHAR(255))
BEGIN
    SELECT precio FROM Producto WHERE nombre = p_nombre;
END;
----------------------------------
CREATE PROCEDURE InsertarDatosVentas
    @r_producto VARCHAR(100),
    @cantidad INT,
    @precio FLOAT,
    @descuento FLOAT,
    @subtotal FLOAT,
    @impuesto FLOAT,
    @total FLOAT
AS
BEGIN
    INSERT INTO PROBANDO (r_producto, cantidad, precio, descuento, subtotal, impuesto, total)
    VALUES (@r_producto, @cantidad, @precio, @descuento, @subtotal, @impuesto, @total);
END;
------------------
CREATE PROCEDURE ObtenerDatosCuenta
    @usuario VARCHAR(50),
    @contrasena VARCHAR(50)
AS
BEGIN
    SELECT
        IDCuenta AS codigo,
        Usuario AS nombrecompleto,
        '****' AS clave
    FROM
        Cuenta
    WHERE
        Usuario = @usuario AND Contraseña = @contrasena;
END;
-----------------------------


DROP PROCEDURE sp_GetProveedorNames

CREATE PROCEDURE BuscarProductosPorCategoria
    @idCategoria int
AS
BEGIN
    -- Consulta para buscar productos por categoría
    SELECT 
        idProducto,
        nombre,
        precio,
        receta,
        foto,
        categoria,
        proveedor
    FROM Producto
    WHERE categoria = @idCategoria;
END;

------------------------------------------------------------------------------
CREATE PROCEDURE ObtenerIdCategoria
    @nombreCategoria NVARCHAR(100)  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT idCategoria
    FROM Categoria
    WHERE catnombre = @nombreCategoria;
END;
GO
--------------------------------------------------------------------------------------------
CREATE PROCEDURE ObtenerProductosPorCategoria
    @nombreCategoria NVARCHAR(100)  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT idProducto, nombre, precio, receta, foto
    FROM Producto
    WHERE categoria = @nombreCategoria;
END;
GO
-----------------------------------------------------
CREATE PROCEDURE ObtenerIdProductoPorNombre
    @nombreProducto NVARCHAR(100)  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT idProducto
    FROM Producto
    WHERE nombre = @nombreProducto;
END;
GO
------------------------------------------------
CREATE PROCEDURE ObtenerPrecioProductoPorNombre
    @nombreProducto NVARCHAR(255)  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT precio
    FROM Producto
    WHERE nombre = @nombreProducto;
END;
GO
----------------------------------------------------
CREATE PROCEDURE ContarVentasPorId
    @idVenta INT  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT COUNT(*) AS TotalVentas
    FROM Venta
    WHERE idVenta = @idVenta;
END;
GO
-----------------------
CREATE PROCEDURE EliminarDetallePorIdVenta
    @idVenta INT  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    DELETE FROM Detalle
    WHERE idVenta = @idVenta;
END;
GO
-------------------------------------------------------
CREATE PROCEDURE EliminarVentaPorId
    @idVenta INT  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    DELETE FROM Venta
    WHERE idVenta = @idVenta;
END;
GO
---------------------------------------------
CREATE PROCEDURE ObtenerDetallePorIdVenta
    @idVenta INT  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT r_producto, cantidad, precio, descuento, subtotal
    FROM Detalle
    WHERE idVenta = @idVenta;
END;
GO
----------------------------------------------------------
CREATE PROCEDURE ObtenerTotalYIdVenta
    @idVenta INT  -- Ajusta el tipo de datos según tu necesidad
AS
BEGIN
    SET NOCOUNT ON;

    SELECT total, idVenta
    FROM Venta
    WHERE idVenta = @idVenta;
END;
GO
---------------------------------------------
CREATE PROCEDURE RegistrarVenta
    @Fecha DATETIME,
    @Total FLOAT
AS
BEGIN
    -- Insertar la venta en la tabla Venta
    INSERT INTO Venta (fecha, total) VALUES (@Fecha, @Total);

    -- Obtener el ID generado
    DECLARE @IdVenta INT;
    SET @IdVenta = SCOPE_IDENTITY();

    -- Devolver el ID generado
    SELECT @IdVenta AS IdVenta;
END;
-----------------------------------------------
CREATE PROCEDURE RegistrarDetalleVenta
    @IdVenta INT,
    @RProducto VARCHAR(255),
    @Cantidad INT,
    @Precio FLOAT,
    @Descuento FLOAT,
    @Subtotal FLOAT
AS
BEGIN
    -- Insertar el detalle de venta en la tabla Detalle
    INSERT INTO Detalle (idVenta, r_producto, cantidad, precio, descuento, subtotal)
    VALUES (@IdVenta, @RProducto, @Cantidad, @Precio, @Descuento, @Subtotal);
END;


