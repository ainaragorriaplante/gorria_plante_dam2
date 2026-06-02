PREGUNTA 1

Explica cómo funciona la relación 1:N entre CentroForense y MuestraForense tanto en SQL como en Java.

La relación quiere representar el hecho de que un centro puede tener/realizar más de una muestra.
En SQL significa que más de un registro de muestra puede tener la id del centro.
Y en java que podemos crear tantos objetos muestra como queramos de un mismo centro.

PREGUNTA 2

Explica por qué en Java utilizamos:

private CentroForense centro;

y no:

private int centroId;

para llamar al objeto completo en lugar de solo la id

PREGUNTA 3

Explica qué ventaja aporta PreparedStatement frente a concatenar SQL manualmente.

Nos proporciona seguridad frente a SQL Injection, nos permite reutilizar de consultas.