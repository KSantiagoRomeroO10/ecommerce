-- Crear base de datos
CREATE DATABASE ecommerce;
GO

-- Usar base de datos
USE ecommerce;
GO

-- Tabla de productos
CREATE TABLE productos (
	id_producto INT PRIMARY KEY IDENTITY,
	nombre_producto NVARCHAR(50) NOT NULL,
	precio_producto DECIMAL(8, 2) NOT NULL,
	descripcion_producto NVARCHAR(MAX) NOT NULL,
	stock_producto INT NOT NULL
);

-- Tabla de vendedores
CREATE TABLE vendedores (
	id_vendedor INT PRIMARY KEY IDENTITY,
	nombre_vendedor NVARCHAR(50) NOT NULL,
	correo_vendedor NVARCHAR(50) NOT NULL,
	comision_vendedor INT NOT NULL
);

-- Tabla de ventas con FK en cascade
CREATE TABLE ventas (
	id_venta INT PRIMARY KEY IDENTITY,
	id_vendedor INT NOT NULL,
	fecha_venta DATETIME NOT NULL DEFAULT GETDATE(),
	FOREIGN KEY (id_vendedor) REFERENCES vendedores(id_vendedor)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

-- Tabla intermedia venta-producto con FK en cascade
CREATE TABLE venta_producto (
	id_venta_producto INT PRIMARY KEY IDENTITY,
	id_venta INT NOT NULL,
	id_producto INT NOT NULL,
	cantidad INT NOT NULL,
	precio_unitario DECIMAL(8,2) NOT NULL,
	FOREIGN KEY (id_venta) REFERENCES ventas(id_venta)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

-- La base de datos está organizada de manera que cada vendedor puede realizar muchas ventas,
-- pero cada venta pertenece solo a un vendedor. A su vez, una venta puede incluir varios
-- productos, y un mismo producto puede estar presente en muchas ventas. Esta relación entre
-- productos y ventas se gestiona a través de una tabla intermedia llamada venta_producto,
-- que permite registrar cuántos productos se vendieron y a qué precio. Así, se reflejan de
-- forma clara y ordenada las relaciones entre vendedores, productos y ventas.

-- Insertar productos
INSERT INTO productos (nombre_producto, precio_producto, descripcion_producto, stock_producto) VALUES
('Camiseta Azul', 35000.00, 'Camiseta de algodón talla M', 100),
('Pantalón Jeans', 85000.00, 'Jeans azul oscuro, corte slim', 60),
('Zapatos Deportivos', 120000.00, 'Zapatos para correr talla 42', 40),
('Chaqueta Impermeable', 95000.00, 'Chaqueta para lluvia talla L', 30),
('Gorra Negra', 15000.00, 'Gorra de tela negra ajustable', 80),
('Reloj Deportivo', 200000.00, 'Reloj resistente al agua', 25),
('Mochila Urbana', 68000.00, 'Mochila para uso diario', 50),
('Bufanda de Lana', 22000.00, 'Bufanda tejida unisex', 90),
('Lentes de Sol', 45000.00, 'Lentes con filtro UV', 70),
('Cinturón de Cuero', 38000.00, 'Cinturón marrón ajustable', 65);

-- Insertar vendedores
INSERT INTO vendedores (nombre_vendedor, correo_vendedor, comision_vendedor) VALUES
('Laura Gómez', 'laura.gomez@ecommerce.com', 10),
('Carlos Ruiz', 'carlos.ruiz@ecommerce.com', 12),
('Andrea Torres', 'andrea.torres@ecommerce.com', 15),
('David López', 'david.lopez@ecommerce.com', 11),
('Mariana Ríos', 'mariana.rios@ecommerce.com', 13);

-- Insertar ventas
INSERT INTO ventas (id_vendedor) VALUES
(1), (2), (3), (4), (5),
(1), (2), (3), (4), (5);

-- Insertar detalle de venta (venta_producto)
INSERT INTO venta_producto (id_venta, id_producto, cantidad, precio_unitario) VALUES
(1, 1, 2, 35000.00),
(1, 2, 1, 85000.00),
(2, 3, 1, 120000.00),
(2, 5, 3, 15000.00),
(3, 6, 1, 200000.00),
(3, 7, 2, 68000.00),
(4, 4, 1, 95000.00),
(4, 8, 2, 22000.00),
(5, 9, 1, 45000.00),
(5, 10, 1, 38000.00),
(6, 1, 1, 35000.00),
(6, 3, 1, 120000.00),
(7, 7, 1, 68000.00),
(7, 9, 1, 45000.00),
(8, 2, 2, 85000.00),
(8, 10, 1, 38000.00),
(9, 4, 1, 95000.00),
(9, 6, 1, 200000.00),
(10, 5, 2, 15000.00),
(10, 8, 1, 22000.00);
