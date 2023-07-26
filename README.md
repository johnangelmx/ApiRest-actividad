Documentación API Ordenar ArregloDocumentación API Ordenar Arreglo
=================================

Esta API proporciona una forma de ordenar un arreglo de enteros.

Ruta
----

La ruta de la API es `/ordenar`.

Método de solicitud
-------------------

El método de solicitud debe ser `POST`.

Cuerpo de la solicitud
----------------------

El cuerpo de la solicitud debe ser un objeto JSON con la siguiente estructura:

 ```json

    {
        "arreglo": [elemento1, elemento2, ..., elementoN]
    }
    
```

Donde `elemento1`, `elemento2`, ..., `elementoN` son los elementos del arreglo. Cada elemento debe ser un entero. El arreglo puede contener cualquier cantidad de elementos.

Respuestas
----------

- Respuesta exitosa (200 OK): Si la solicitud es válida y contiene un arreglo válido de enteros, la respuesta contendrá un objeto JSON con el arreglo ordenado.
- Respuesta de error (400 Bad Request): Si la solicitud contiene un arreglo no válido o vacío, la respuesta contendrá un objeto JSON con un mensaje de error explicativo.

Ejemplo de solicitud
--------------------

El siguiente es un ejemplo de una solicitud válida:

```text
POST /ordenar
```
 ```json

    {
        "arreglo": [7, 3, 9, 1, 5]
    }
    
```

Ejemplo de respuesta exitosa
----------------------------

El siguiente es un ejemplo de una respuesta exitosa:

 ```json

    {
        "arreglo": [1, 3, 5, 7, 9]
    }
    
```

Ejemplo de respuesta de error
-----------------------------

El siguiente es un ejemplo de una respuesta de error:

 ```json

    {
        "error": "El arreglo está vacío"
    }
    
```