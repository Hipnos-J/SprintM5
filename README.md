# Sprint módulo 5


## Integrantes:
- Pilar Astorga
- Josué Jorquera
- Diego Paredes
- Paula Retamal
- Mangel Tort

## Tema:
Desarrollo de aplicaciones web dinámicas con Java.

## Objetivos del proyecto:
Desarrollar un sitio web dinámico bajo el patrón de
diseño MVC, conectándose a una base de datos Oracle.

## Requerimientos del proyecto:
- HTML
- Hojas de estilo
- Responsividad
- Javascript
- JEE
- Servlets
- Bases de datos
- Java Server Pages
- Tomcat

## Descripción:

### *Contexto*
En la última década, han aumentado los índices de accidentabilidad, especialmente en las
empresas del rubro industrial, minero y construcción. Las cifras son alarmantes, a pesar de las
leyes y normativas que obligan a las empresas a tomar todas las medidas necesarias para
protegerla vida y salud de los trabajadores. Para dar cumplimiento a la normativa y mantener
ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría
profesional, lo cual representa un costo elevado y fomenta la disminución o la no
implementación de medidas necesarias para la seguridad. Muchas de las empresas que han
optado por no invertir en asesoría preventiva, se ven expuestas a aplicación de multas de las
entidades fiscalizadoras, gastos por días perdidos en accidentabilidad, bajas en la producción,
alzas en el pago de cotizaciones (al organismo administrador del seguro de accidentes del
trabajo, ley 16.744), entre otros. Además, hay que considerar posibles demandas y pagos de
indemnizaciones a lostrabajadores y familiares afectados por accidentes del trabajo.
Un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos
laborales y necesita una solución tecnológica que ayude a administrar los procesos que se
deben ejecutar en cada una de las empresas que son clientes de la compañía. Este servicio
finalmente pretende ofrecer una solución completa en prevención de riesgos para las
empresas a un costo razonable, cumpliendo estrictamente todos los procesos necesarios para
dar cumplimiento a la normativa vigente, mejorando los ambientes de trabajo, la
productividad, contribuyendo a un ahorro económico.

### *Problema*
La empresa no posee un sistema de información que le permita administrar toda la cantidad de
información que se genera, ni controlar las actividades y el recurso humano.
Existen problemas con la planificación de las visitas, generalmente los profesionales están en
terreno por lo que no están disponibles para informarles sus actividades futuras.

No existe registro del profesional que ha estado con mayor actividad ni se sabe dónde está
cadauno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el
cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la
ejecución de la capacitación, lo que trae consigo multas para la empresa. No se tiene un control
de los clientes que pagan y los que no, lo que hace que muchas actividades de los
profesionales corran por cuenta de la empresa, generando desbalances financieros. Las
actividades se registran en carpetas lo que dificulta el seguimiento de las asesorías y el resumen
de resultados por empresa. Además, generalmente no se cumplen ciertas actividades de
control de implementación de soluciones y a veces no se ha cumplido con la dirección del
trabajo, lo que genera multas para los clientes, bajando la calidad del servicio. Los
profesionales que han atendido la empresa esporádicamente han variado, no existiendo un
registro de la totalidad de actividades preventivas realizadas y no se tiene certeza de los
avances.

### *Solución*
Es necesario desarrollar una solución tecnológica que cubra los procesos de negocio descritos y
que proponga una mejora en la gestión, el control, la seguridad, y disponibilidad de información
para la empresa y sus clientes. Elsistema debe permitir la planificación de actividades y el control
de ejecución de éstas, la gestión de clientes, la coordinación entre la empresa, los profesionales
y los clientes para la respuesta temprana ante incidentes de seguridad. Además, se requiere que
el sistema genere reportes y estadísticas que ayuden a tomar de decisiones y mejorar el
rendimiento de la empresa, considerando la carga laboral, y la demanda de clientes y las
actividades que cada uno involucra para el cumplimiento de los contratos. Es imprescindible,
mantener comunicación con los profesionales en todo momento, aún en terreno, y darle la
posibilidad de realizar todas sus actividades aun no teniendo conectividad (internet), ya que
muchas empresas se encuentran en zonas donde no hay conexión de ese tipo.

## Desarrollo:
Se crean servlets para los siguientes casos de uso:

- Inicio
- Contacto
- Crear Capacitación
- Listar Capacitación
- Login
- Listado de Usuarios
- Crear Usuario


Se actualizan los componentes del caso de uso “Crear Usuario”, permitiendo que se pueda registrar un usuario en la base de datos. Se considera que el usuario puede ser un cliente, administrativo o profesional.

Se agrega funcionalidad a los servlets correspondientes a los casos de uso Editar Cliente, Editar Administrativo y Editar Profesional. A estos casos de uso se accede desde el listado de usuarios, desplegando el formulario adecuado según el tipo.

Se actualiza el servlet correspondiente al caso de uso “Contacto”. En este caso de uso se despliega el formulario de contacto; una vez que se procese el formulario, se llama un método que despliegue los datos ingresados a través de la consola de Java.
