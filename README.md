DESCRIPTIVO DEL CÓDIGO FUENTE DESARROLLADO:

Se creo un proyecto Maven - Web Aplication, llamado ProjectAlmacenesJuegos, que contiene:

1. Modulo Entities: En este creamos las entidades por cada una de las tablas que se encuentran en el Diagrama de entidad relacion.

2. Modulo Persistence: En este se crean las interfaces para acceder a las entidades.

3. Modulo Business: Se crea toda la logica de negocio, donde por medio de Almacenes se realiza toda la relacion.

4. Modulo Web: Se crea la parte Web con primefaces.

5. Modulo Web - Managed Bean: Se crean los MB, para la conexion con la DB.

# REQUISITOS 

DB: Instalar la DB, el Script es ScriptDBAlmacenesJuegos.sql

Glassfihs : Se debe crear el JDBC Connection Pools y luego el JDBC Resources con el nombre AlmacenesJuegos_Pool

# COMO ACCEDER 

Cuando se sube el servidor de aplicaciones Glassfihs se debe acceder a la ruta http://localhost:8080/ProjectAlmacenesJuegos/ donde  localhost se reemplazara por la direccion IP donde este el servidor de aplicaciones. http://localhost:4848/jdbc/jdbcConnectionPools.jsf
