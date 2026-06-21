# Sistema de Cafetería - Patrón Decorator

Este proyecto implementa el patrón **Decorator** en Java para calcular dinámicamente el costo de bebidas de café según su tamaño (Normal (N), Mediano (M), Grande (G)) y la adición de múltiples complementos.


## Arquitectura y Decisiones de Diseño

* **Uso de `protected Cafe cafe;`**: Al definir la variable como `protected` en la clase abstracta, permitimos que los decoradores concretos (`Leche`, `Crema`, etc.) accedan directamente al objeto envuelto. Esto es indispensable para consultar su tamaño mediante `cafe.getTamano()` y calcular el costo extra de forma dinámica.
* **Validación Fail-Fast**: Los constructores de los cafés base lanzan un `IllegalArgumentException` si el tamaño no es "N", "M" o "G". Detener el programa de inmediato ante un dato inválido garantiza la integridad de los datos y evita cobros erróneos en el sistema.


## Lógica del Main

* **Estructura de Impresión (`imprimirPedido`)**: Centraliza la salida en consola en un único método reutilizable. Aplica el principio DRY (Don't Repeat Yourself), manteniendo el método `main` limpio y asegurando un formato uniforme para todos los reportes de costos.
* **Agrupación Dinámica (`agruparIngredientes`)**: Evita descripciones redundantes causadas por la acumulación de decoradores (ej: *"soya, soya, soya"*).
    * **Conteo y Orden**: Utiliza un `LinkedHashMap` para registrar la frecuencia de cada ingrediente respetando estrictamente su orden de inserción.
    * **Lenguaje Natural**: Traduce las cantidades a prefijos legibles (*doble*, *triple*) y une los elementos con una sintaxis fluida en español (*"con doble crema y triple soya"*).