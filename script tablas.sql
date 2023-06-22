CREATE TABLE IF NOT EXISTS usuario (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
	run VARCHAR(100) NOT NULL,
    fechaNacimiento VARCHAR(100) NOT NULL,
    tipo INT NOT NULL,
    expPrevia VARCHAR(100) NOT NULL,
    area VARCHAR(100) NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    fechaIngreso VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS contacto (
	id INT AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
	apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    numCelular VARCHAR(100) NOT NULL,
    comentario VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO usuario (nombre, apellido, run, fechaNacimiento, tipo, expPrevia, area, titulo, fechaIngreso)
VALUES ('Juan', 'Pérez', '12345678-9', '1990-01-01', 1, '', 'Informática', 'Ingeniero de Software', '2022-01-01');
INSERT INTO usuario (nombre, apellido, run, fechaNacimiento, tipo, expPrevia, area, titulo, fechaIngreso)
VALUES ('María', 'González', '98765432-1', '1992-05-15', 2, 'Desarrollador en XYZ Company', 'Informática', 'Ingeniera de Software', '2021-06-15');
INSERT INTO usuario (nombre, apellido, run, fechaNacimiento, tipo, expPrevia, area, titulo, fechaIngreso)
VALUES ('Carlos', 'López', '45678901-2', '1988-12-10', 3, 'Consultor en ABC Consulting', 'Consultoría', 'Consultor Senior', '2020-03-01');


INSERT INTO contacto (nombre, apellido, correo, numCelular, comentario) VALUES ('Juan', 'Pérez', 'juan@example.com', '123456789', 'Hola, me gustaría obtener más información sobre sus servicios.');

INSERT INTO contacto (nombre, apellido, correo, numCelular, comentario) VALUES ('María', 'Gómez', 'maria@example.com', '987654321', 'Estoy interesada en solicitar una cotización para un proyecto.');

INSERT INTO contacto (nombre, apellido, correo, numCelular, comentario) VALUES ('Pedro', 'Rodríguez', 'pedro@example.com', '555444333', 'Quisiera agendar una reunión para discutir detalles de un posible contrato.');

 INSERT INTO capacitacion (rutCliente, dia, hora, lugar, duracion, cantAsistentes) VALUES ('987654321', '2023-06-20', '14:30', 'Sala B', '1 hora', 15);

 INSERT INTO capacitacion (rutCliente, dia, hora, lugar, duracion, cantAsistentes) VALUES ('555444333', '2023-06-21', '10:00', 'Sala C', '3 horas', 30);

 INSERT INTO capacitacion (rutCliente, dia, hora, lugar, duracion, cantAsistentes) VALUES ('111222333', '2023-06-22', '13:00', 'Sala D', '2 horas', 25);


