USE capacitacion_hibernet;
# Obtener todos los registros de los alumnos que estén en el grupo A en grado 3
SELECT *
FROM t_alumno
         INNER JOIN c_grupo ON t_alumno.c_grupo_idc_grupo = c_grupo.idc_grupo
         INNER JOIN c_grado ON t_alumno.c_grado_idc_grado = c_grado.idc_grado
WHERE c_grupo.descripcion = 'Grupo A'
  AND c_grado.descripcion = 'Grado 3';

# obtener el registro de los alumnos que estén en el salon con el profesor con id 2

SELECT t_alumno.nombre_completo   as 'Nombre Alumno',
       t_profesor.idt_profesor    as 'ID Profesor',
       t_profesor.nombre_completo as 'Nombre Profesor'
FROM t_alumno
         INNER JOIN t_salon ON t_alumno.idt_alumno = t_salon.t_alumno
         INNER JOIN t_profesor ON t_salon.t_profesor = t_profesor.idt_profesor
WHERE idt_profesor = 2;

# Obtener todas las materias en las que está el alumno con id 3
SELECT t_alumno.idt_alumno      as 'ID Alumno',
       t_materia.descripcion    as 'Materias',
       t_alumno.nombre_completo as 'Nombre Alumno'
FROM t_materia
         INNER JOIN t_profesor ON t_materia.idt_materia = t_profesor.t_materia
         INNER JOIN t_salon ON t_salon.t_profesor = t_profesor.idt_profesor
         INNER JOIN t_alumno ON t_alumno.idt_alumno = t_salon.t_alumno
WHERE t_alumno.idt_alumno = 3;
;
