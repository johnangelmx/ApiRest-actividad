Documentación de API OrdenarAPI Ordenar
===========

Endpoint: /ordenar
------------------

**Método:** POST

**Descripción:** Ordena un arreglo de enteros de forma ascendente y devuelve el resultado ordenado.

**Parámetros de entrada:**   
El cuerpo de la solicitud debe contener un objeto JSON con la siguiente estructura:

```json

{
  "arreglo": [
    elemento1,
    elemento2,
    ...,
    elementoN
  ]
}

```

Donde "elemento1, elemento2, ..., elementoN" son valores enteros que conforman el arreglo a ordenar.  **Respuesta:**

- Si el arreglo contiene algún valor que no sea entero, se devuelve un código de estado 400 Bad Request con un mensaje
  de error indicando que el arreglo debe contener solo enteros.
- Si el arreglo está vacío, se devuelve un código de estado 400 Bad Request con un mensaje de error indicando que el
  arreglo está vacío y debe ser validado.
- Si el arreglo es válido y contiene enteros, se devuelve un código de estado 200 OK con el arreglo ordenado:

```json

[
  elemento1,
  elemento2,
  ...,
  elementoN
]

```

Donde "elemento1, elemento2, ..., elementoN" son los valores enteros ordenados del arreglo de entrada.

---
Documentación de API FechaAPI Fecha
=========

Endpoint: /fecha
----------------

**Método:** GET

**Descripción:** Obtiene la fecha actual del sistema.

**Respuesta:**   
Código de estado: 200 OK   
Cuerpo de respuesta: Un mensaje que indica la fecha actual en formato "fechaActual: AAAA-MM-DD".

Endpoint: /fecha/mes
--------------------

**Método:** GET

**Descripción:** Obtiene el nombre del mes actual.

**Respuesta:**   
Código de estado: 200 OK   
Cuerpo de respuesta: Un mensaje que indica el nombre del mes actual en español. Ejemplo: "mesActual: enero".

Endpoint: /fecha/dia
--------------------

**Método:** GET

**Descripción:** Obtiene el día del mes actual.

**Respuesta:**   
Código de estado: 200 OK   
Cuerpo de respuesta: Un mensaje que indica el día del mes actual. Ejemplo: "diaActual: 26".

Endpoint: /fecha/dia/semana
---------------------------

**Método:** GET

**Descripción:** Obtiene el día de la semana actual.

**Respuesta:**   
Código de estado: 200 OK   
Cuerpo de respuesta: Un mensaje que indica el día de la semana actual en español. Puede ser "Domingo", "Lunes", "
Martes", "Miércoles", "Jueves", "Viernes", "Sábado" o "Día no válido"