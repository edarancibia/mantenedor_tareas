# mantenedor_tareas

Instrucciones:
1 - Para ejecutar en localhost o en algun ambiente Cloud se debe crear la base de datos y tabla con la siguiente instrucción:

```CREATE DATABASE mantenedor;
use mantenedor;

CREATE TABLE `tasks` (
  `idtask` int NOT NULL AUTO_INCREMENT,
  `description` varchar(100) DEFAULT NULL,
  `creationdate` datetime DEFAULT NULL,
  `vigent` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idtask`)
)
```

2- Modificar el archivo src/main/resources/applitation.propertie con la credenciales correspondientes
3- Descargar repositorio e importarlo a algun IDE, ejemplo STS
4- Ejecutar proyecto, la API quedará corriente el la url http://localhost:8080/tasks

DOCUMENTACIÓN API EN SWAGGER:
http://localhost:8080/swagger-ui.html/

El codigo del frontend se encuentra en el repositorio llamado mantenedor_tareas_front, el cual se puede desacargar y ejecutar en vs code
