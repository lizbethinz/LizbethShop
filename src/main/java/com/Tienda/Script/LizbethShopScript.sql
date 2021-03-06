Drop table if exists Clasificaciones;
create table Clasificaciones(
     idClasificacion int auto_increment primary key,
     nombreClasificacion varchar(100),
     Descripcion varchar(200)
);

Drop table if exists Clientes;
create table Clientes(
    idCliente int auto_increment primary key,
    nombre varchar(150),
    Direccion varchar(200),
    email varchar(50),
    telefono varchar(10)
);

Drop table if exists Prendas;
create table Prendas(
    id int auto_increment primary key,
    codigo varchar(50),
    descripcion varchar(200),
    nombre varchar(100),
    Precio varchar(20),
    clasificacion int,
    foreign key(clasificacion) references Clasificaciones(idClasificacion)
);

Drop table if exists Pedidos;
create table Pedidos(
     idPedido int auto_increment primary key,
     idCliente int,
     CostoTotal int,
    estatus int, 
    foreign key(idCliente) references Clientes(idCliente)
);

Drop table if exists PedidosDetalle;
create table PedidosDetalle(
    idPedidoDetalle int auto_increment primary key, 
    idPedido int,
    idArticulo int,
    total int,
    foreign key(idPedido) references Pedidos(idPedido),
    foreign key(idArticulo) references Prendas(id)
);
