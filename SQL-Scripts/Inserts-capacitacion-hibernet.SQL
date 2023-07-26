USE capacitacion_hibernet;
SHOW TABLES;

INSERT INTO c_grado (descripcion)
VALUES ('Grado 1'),
       ('Grado 2'),
       ('Grado 3');
SELECT *
FROM c_grado;

INSERT INTO c_grupo (descripcion)
VALUES ('Grupo A'),
       ('Grupo B'),
       ('Grupo C'),
       ('Grupo D'),
       ('Grupo E');
SELECT *
FROM c_grupo;

INSERT INTO t_alumno (c_grupo_idc_grupo, c_grado_idc_grado, nombre_completo, matricula)
VALUES (1, 1, 'Juan Pérez', 'CHMX-001'),
       (2, 2, 'María López', 'CHMX-002'),
       (3, 3, 'Carlos Gómez', 'CHMX-003'),
       (1, 1, 'Laura Torres', 'CHMX-004'),
       (2, 2, 'Pedro Ramirez', 'CHMX-005'),
       (3, 3, 'Ana Navarro', 'CHMX-006'),
       (1, 3, 'Ana Martínez', 'CHMX-007'),
       (1, 3, 'Luis Rodríguez', 'CHMX-008');

SELECT *
FROM t_alumno;

INSERT INTO t_materia (descripcion)
VALUES ('Matemáticas'),
       ('Historia'),
       ('Ciencias'),
       ('Lengua Española'),
       ('Arte'),
       ('Educación Física');
SELECT *
FROM t_materia;

INSERT INTO t_profesor (t_materia, nombre_completo, anios_laborando)
VALUES (1, 'Profesor 1', '5 años'),
       (2, 'Profesor 2', '3 años'),
       (3, 'Profesor 3', '8 años'),
       (4, 'Profesor 4', '6 años'),
       (5, 'Profesor 5', '4 años'),
       (6, 'Profesor 6', '2 años');
SELECT *
FROM t_profesor;

INSERT INTO t_salon (t_profesor, t_alumno)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 6);
SELECT *
FROM t_salon;

INSERT INTO t_usuarios (email, pass, t_profesor)
VALUES ('profesor1@gmail.com', 'contraseña1', 1),
       ('profesor2@gmail.com', 'contraseña2', 2),
       ('profesor3@gmail.com', 'contraseña3', 3),
       ('profesor4@gmail.com', 'contraseña4', 4),
       ('profesor5@gmail.com', 'contraseña5', 5),
       ('profesor6@gmail.com', 'contraseña6', 6);
SELECT *
FROM t_usuarios;

