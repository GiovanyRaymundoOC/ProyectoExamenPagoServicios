Descripción del Programa de Simulación de Pagos de Servicios

Objetivo:
El programa tiene como objetivo principal permitir a los usuarios realizar pagos de diversos servicios (agua, luz, Mercado Libre, cable, etc.) de manera segura y eficiente. Los datos de los pagos se almacenan en una base de datos establecida y las contraseñas de los usuarios se encriptan para garantizar la seguridad. Además, el programa enviará notificaciones por correo electrónico al momento de realizar un pago y mantendrá un registro detallado de los pagos tanto a nivel individual como general, accesible para los administradores.

Características Principales

1. Interfaz de Usuario

La interfaz de usuario está diseñada para ser intuitiva y fácil de usar, permitiendo a los usuarios navegar y realizar pagos sin complicaciones.

	•	Pantalla de Inicio de Sesión:
	•	Formulario de login con validación de datos.
	•	Opción para recuperar contraseña en caso de olvido.
	•	Pantalla de Registro:
	•	Formulario para registrar nuevos usuarios con campos como nombre, correo electrónico, y contraseña.
	•	Validación de datos y confirmación de contraseña.
	•	Panel Principal:
	•	Menú de navegación para acceder a las diferentes secciones del programa (Perfil, Pagos, Historial, etc.).
	•	Visualización de servicios disponibles para pago.
	•	Formulario de Pago:
	•	Selección del servicio a pagar desde un menú desplegable.
	•	Campos para ingresar el monto a pagar y la información de pago.
	•	Botón de confirmación para completar la transacción.

2. Base de Datos

La base de datos PagoDeServicios se estructura en varias tablas para organizar y gestionar la información de manera eficiente:

	•	Usuarios:
	•	Almacena información de los usuarios registrados (ID, nombre, correo electrónico, contraseña encriptada, etc.).
	•	Servicios:
	•	Contiene detalles de los servicios disponibles (ID, nombre del servicio, descripción, etc.).
	•	Pagos:
	•	Registra todas las transacciones de pagos realizadas (ID del pago, ID del usuario, ID del servicio, monto, fecha, etc.).
	•	HistorialUsuarios:
	•	Mantiene un registro detallado de los pagos realizados por cada usuario (ID del historial, ID del usuario, ID del pago, detalles del pago, etc.).
	•	Administrador:
	•	Guarda información de los administradores del sistema (ID, nombre, correo electrónico, permisos, etc.).

3. Encriptación de Contraseñas

Para proteger la privacidad y seguridad de los usuarios, el programa utiliza algoritmos de encriptación robustos.

	•	Hashing:
	•	Uso de algoritmos como bcrypt o SHA-256 para encriptar las contraseñas antes de almacenarlas en la base de datos.
	•	Validación:
	•	Al iniciar sesión, las contraseñas ingresadas se comparan con las encriptadas para validar la autenticidad del usuario.

4. Proceso de Pago

El proceso de pago está diseñado para ser sencillo y seguro:

	•	Selección de Servicio:
	•	El usuario selecciona el servicio a pagar desde una lista de opciones disponibles.
	•	Ingreso de Monto:
	•	El usuario ingresa el monto a pagar y cualquier información adicional requerida.
	•	Confirmación de Pago:
	•	Tras la verificación de los datos, el pago se procesa y se actualiza la base de datos con los detalles de la transacción.

5. Notificación por Correo Electrónico

Cada vez que un usuario realiza un pago, el programa envía automáticamente una notificación por correo electrónico con los detalles del pago.

	•	Detalles del Correo:
	•	Incluye información como el servicio pagado, el monto, la fecha y un número de referencia.
	•	Configuración del Correo:
	•	Uso de un servicio de correo electrónico (SMTP) para enviar las notificaciones.

6. Historial de Pagos

El programa mantiene un historial detallado de todos los pagos realizados, accesible tanto para los usuarios como para los administradores.

	•	Historial del Usuario:
	•	Cada usuario puede acceder a su historial de pagos desde su perfil, viendo detalles de todas sus transacciones.
	•	Historial General:
	•	Los administradores tienen acceso a un historial completo de todos los pagos realizados en el sistema, con opciones de filtrado y búsqueda.

Funcionalidades Adicionales

Seguridad

	•	Autenticación y Autorización:
	•	Sistema de roles y permisos para gestionar el acceso a diferentes partes del sistema.
	•	Protección de Datos:
	•	Medidas para prevenir accesos no autorizados y proteger datos sensibles.

Reportes

	•	Generación de Reportes:
	•	Funcionalidades para generar reportes de pagos, incluyendo estadísticas y análisis.
	•	Exportación de Datos:
	•	Opciones para exportar datos de pagos e historial en formatos como CSV o PDF.

Interfaz de Administración

	•	Panel de Control:
	•	Herramientas para que los administradores gestionen usuarios, servicios y pagos.
	•	Gestión de Servicios:
	•	Funcionalidades para agregar, editar y eliminar servicios disponibles para pago.

Este programa proporciona una solución completa para la gestión de pagos de servicios, con énfasis en la seguridad, la facilidad de uso y la eficiencia. Los usuarios pueden realizar pagos de manera segura y recibir confirmaciones instantáneas, mientras que los administradores pueden supervisar y gestionar todas las transacciones a través de una interfaz intuitiva.

Autores: Jose Julian Ortiz Martinez
         , Olmedo Carbajal Giovanhy Raymundo
Descripción del Programa de Simulación de Pagos de Servicios

Objetivo:
El programa tiene como objetivo principal permitir a los usuarios realizar pagos de diversos servicios (agua, luz, Mercado Libre, cable, etc.) de manera segura y eficiente. Los datos de los pagos se almacenan en una base de datos establecida y las contraseñas de los usuarios se encriptan para garantizar la seguridad. Además, el programa enviará notificaciones por correo electrónico al momento de realizar un pago y mantendrá un registro detallado de los pagos tanto a nivel individual como general, accesible para los administradores.

Características Principales

1. Interfaz de Usuario

La interfaz de usuario está diseñada para ser intuitiva y fácil de usar, permitiendo a los usuarios navegar y realizar pagos sin complicaciones.

	•	Pantalla de Inicio de Sesión:
	•	Formulario de login con validación de datos.
	•	Opción para recuperar contraseña en caso de olvido.
	•	Pantalla de Registro:
	•	Formulario para registrar nuevos usuarios con campos como nombre, correo electrónico, y contraseña.
	•	Validación de datos y confirmación de contraseña.
	•	Panel Principal:
	•	Menú de navegación para acceder a las diferentes secciones del programa (Perfil, Pagos, Historial, etc.).
	•	Visualización de servicios disponibles para pago.
	•	Formulario de Pago:
	•	Selección del servicio a pagar desde un menú desplegable.
	•	Campos para ingresar el monto a pagar y la información de pago.
	•	Botón de confirmación para completar la transacción.

2. Base de Datos

La base de datos PagoDeServicios se estructura en varias tablas para organizar y gestionar la información de manera eficiente:

	•	Usuarios:
	•	Almacena información de los usuarios registrados (ID, nombre, correo electrónico, contraseña encriptada, etc.).
	•	Servicios:
	•	Contiene detalles de los servicios disponibles (ID, nombre del servicio, descripción, etc.).
	•	Pagos:
	•	Registra todas las transacciones de pagos realizadas (ID del pago, ID del usuario, ID del servicio, monto, fecha, etc.).
	•	HistorialUsuarios:
	•	Mantiene un registro detallado de los pagos realizados por cada usuario (ID del historial, ID del usuario, ID del pago, detalles del pago, etc.).
	•	Administrador:
	•	Guarda información de los administradores del sistema (ID, nombre, correo electrónico, permisos, etc.).

3. Encriptación de Contraseñas

Para proteger la privacidad y seguridad de los usuarios, el programa utiliza algoritmos de encriptación robustos.

	•	Hashing:
	•	Uso de algoritmos como bcrypt o SHA-256 para encriptar las contraseñas antes de almacenarlas en la base de datos.
	•	Validación:
	•	Al iniciar sesión, las contraseñas ingresadas se comparan con las encriptadas para validar la autenticidad del usuario.

4. Proceso de Pago

El proceso de pago está diseñado para ser sencillo y seguro:

	•	Selección de Servicio:
	•	El usuario selecciona el servicio a pagar desde una lista de opciones disponibles.
	•	Ingreso de Monto:
	•	El usuario ingresa el monto a pagar y cualquier información adicional requerida.
	•	Confirmación de Pago:
	•	Tras la verificación de los datos, el pago se procesa y se actualiza la base de datos con los detalles de la transacción.

5. Notificación por Correo Electrónico

Cada vez que un usuario realiza un pago, el programa envía automáticamente una notificación por correo electrónico con los detalles del pago.

	•	Detalles del Correo:
	•	Incluye información como el servicio pagado, el monto, la fecha y un número de referencia.
	•	Configuración del Correo:
	•	Uso de un servicio de correo electrónico (SMTP) para enviar las notificaciones.

6. Historial de Pagos

El programa mantiene un historial detallado de todos los pagos realizados, accesible tanto para los usuarios como para los administradores.

	•	Historial del Usuario:
	•	Cada usuario puede acceder a su historial de pagos desde su perfil, viendo detalles de todas sus transacciones.
	•	Historial General:
	•	Los administradores tienen acceso a un historial completo de todos los pagos realizados en el sistema, con opciones de filtrado y búsqueda.

Funcionalidades Adicionales

Seguridad

	•	Autenticación y Autorización:
	•	Sistema de roles y permisos para gestionar el acceso a diferentes partes del sistema.
	•	Protección de Datos:
	•	Medidas para prevenir accesos no autorizados y proteger datos sensibles.

Reportes

	•	Generación de Reportes:
	•	Funcionalidades para generar reportes de pagos, incluyendo estadísticas y análisis.
	•	Exportación de Datos:
	•	Opciones para exportar datos de pagos e historial en formatos como CSV o PDF.

Interfaz de Administración

	•	Panel de Control:
	•	Herramientas para que los administradores gestionen usuarios, servicios y pagos.
	•	Gestión de Servicios:
	•	Funcionalidades para agregar, editar y eliminar servicios disponibles para pago.

Este programa proporciona una solución completa para la gestión de pagos de servicios, con énfasis en la seguridad, la facilidad de uso y la eficiencia. Los usuarios pueden realizar pagos de manera segura y recibir confirmaciones instantáneas, mientras que los administradores pueden supervisar y gestionar todas las transacciones a través de una interfaz intuitiva.

Autores: Jose Julian Ortiz Martinez
         , Olmedo Carbajal Giovanhy Raymundo
