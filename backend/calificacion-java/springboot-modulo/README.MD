
# 📚 Módulo de Calificaciones – Spring Boot

## Descripción General

Este módulo, desarrollado en **Java Spring Boot**, forma parte de un sistema backend modular para la gestión y evaluación de presentaciones orales. Permite crear, consultar, actualizar y eliminar calificaciones, criterios de evaluación, detalles de calificación, feedbacks y parámetros ideales. Es compatible con bases de datos PostgreSQL (usando Supabase).

---

## 🚀 ¿Cómo inicializar el proyecto?

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/tu-repo.git
cd springboot-modulo
````

### 2. Instalar dependencias

El proyecto utiliza **Maven** como gestor de dependencias. No necesitas instalar nada extra si usas el wrapper que ya viene en el proyecto.

```bash
./mvnw clean install
```

O si tienes Maven instalado globalmente:

```bash
mvn clean install
```

### 3. Configurar la base de datos

Edita el archivo `application.properties` con tus credenciales de base de datos PostgreSQL (ya viene listo para Supabase, pero revisa que el usuario, password y url sean correctos).

### 4. Levantar el proyecto

```bash
./mvnw spring-boot:run
```

O, si tienes Maven instalado globalmente:

```bash
mvn spring-boot:run
```

El backend estará disponible en [http://localhost:8080](http://localhost:8080).

---

## 📁 Estructura del Módulo

```
/springboot-modulo
│
├── src/
│   ├── controller/         # Controladores REST
│   ├── service/            # Lógica de negocio
│   ├── repository/         # Interfaces JPA para acceso a datos
│   ├── model/              # Entidades JPA
│   ├── dto/                # Objetos de transferencia de datos
│   ├── mapper/             # Conversores entidad-DTO
│   ├── config/             # Configuración (seguridad, etc.)
│
├── screenshots/            # Evidencias de pruebas (Postman)
│   ├── calificacion_delete.png
│   ├── calificacion_get_delete.png
│   ├── calificacion_getbyid.png
│   ├── calificacion_post.png
│   ├── calificacion_put.png
│   ├── calificaciones_get.png
│   ├── get_criterios.png
│   ├── get_detalles.png
│   ├── get_parametros_ideales.png
│   ├── getfeedback.png
│   ├── post_supabase.png
│   └── revision_post.png
│
├── README.md
└── application.properties
```

---

## 🌍 Contexto Internacional

Este módulo fue desarrollado para un emprendimiento internacional que automatiza la gestión de calificaciones en presentaciones orales en instituciones educativas fuera de Ecuador. El enfoque es la adaptabilidad y escalabilidad para contextos internacionales.

---

## 🏗️ Entidades Principales

* **Calificacion:** Evaluación global de una grabación de presentación.
* **CriterioEvaluacion:** Criterios para evaluar presentaciones (claridad, estructura, etc.).
* **DetalleCalificacion:** Detalle individual de calificación por criterio.
* **FeedbackCalificacion:** Retroalimentación sobre la calificación.
* **ParametrosIdeales:** Parámetros de referencia para la evaluación (velocidad, pausas, claridad).

---

## 🔒 Seguridad

El módulo está protegido con **Spring Security**.

* Autenticación: Basic Auth
* Usuario para pruebas:

  * **Username:** `admin`
  * **Password:** `admin123`

---

## 🌐 Endpoints REST

### Calificaciones

* **GET** `/api/calificaciones` – Listar todas
* **GET** `/api/calificaciones/{id}` – Buscar por ID
* **POST** `/api/calificaciones` – Crear
* **PUT** `/api/calificaciones/{id}` – Actualizar
* **DELETE** `/api/calificaciones/{id}` – Eliminar

### Criterios de Evaluación

* **GET** `/api/criterios` – Listar todos

### Detalles de Calificación

* **GET** `/api/detalles` – Listar todos

### Feedback

* **GET** `/api/feedback` – Listar todos

### Parámetros Ideales

* **GET** `/api/parametros-ideales` – Listar todos

> **Nota:** Excepto `/api/parametros-ideales`, todos los endpoints requieren autenticación Basic Auth.

---

## 🧪 Evidencias de Pruebas (Postman)

En la carpeta `/screenshots` se incluyen capturas reales de todas las pruebas realizadas en Postman para cada entidad y operación principal del CRUD:

* **GET** de todas las calificaciones
  ![GET Calificaciones](screenshots/calificaciones_get.png)

* **GET** de calificación por ID
  ![GET Calificación por ID](screenshots/calificacion_getbyid.png)

* **POST** crear nueva calificación
  ![POST Calificación](screenshots/calificacion_post.png)

* **PUT** editar calificación existente
  ![PUT Calificación](screenshots/calificacion_put.png)

* **DELETE** calificación
  ![DELETE Calificación](screenshots/calificacion_delete.png)

* **GET** tras eliminar (comprobar que se borró)
  ![GET tras DELETE](screenshots/calificacion_get_delete.png)

* **GET** todos los criterios de evaluación
  ![GET Criterios](screenshots/get_criterios.png)

* **GET** todos los detalles de calificación
  ![GET Detalles](screenshots/get_detalles.png)

* **GET** todos los parámetros ideales
  ![GET Parámetros Ideales](screenshots/get_parametros_ideales.png)

* **GET** feedbacks
  ![GET Feedback](screenshots/getfeedback.png)

* **POST** Supabase y revisión
  ![POST Supabase](screenshots/post_supabase.png)
  ![Revisión POST](screenshots/revision_post.png)

---

## ⚙️ Recomendaciones y Notas

* Asegúrate de que los registros relacionados (usuarios, grabaciones, parámetros ideales, etc.) existan en la base antes de hacer POST o PUT.
* Las evidencias aquí mostradas son de rutas realmente probadas con Postman.
* Puedes ampliar este módulo agregando más lógica de negocio o integraciones según las necesidades del proyecto.
* La integración de IA corresponde a otro módulo del grupo; este módulo se enfoca exclusivamente en la lógica de calificación.
