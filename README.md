# Catálogo de Libros

Este proyecto es una aplicación de consola para buscar libros a través de la API de Gutendex y almacenar la información obtenida en una base de datos. La aplicación permite interactuar con los usuarios proporcionando varias opciones de consulta.

## Funcionalidades

- **Buscar libro por título**: Permite buscar un libro por su título en la API de Gutendex.
- **Ver todos los libros**: Muestra una lista de todos los libros que han sido buscados.
- **Ver libros por idioma**: Muestra una lista de libros filtrados por el idioma en que fueron escritos.
- **Ver todos los autores**: Muestra una lista de todos los autores de los libros que han sido buscados.

## Instalación

1. Clona el repositorio.
2. Navega al directorio del proyecto.
3. Compila el proyecto utilizando Maven.
4. Ejecuta la aplicación ubicada en "libros/src/main/java/com/daniel/libreria/libros/console".

## Uso

Al ejecutar la aplicación, se te presentarán las siguientes opciones en la consola:

### 1. Buscar libro por título

Al seleccionar esta opción, se pedirá que se ingrese el título del libro que deseas buscar. La aplicación mostrará el título, autor, idioma y número de descargas del libro encontrado.
![image](https://github.com/user-attachments/assets/b125892f-4788-454b-98c4-61670eb305ea)


### 2. Ver todos los libros

Esta opción muestra una lista de todos los libros que han sido buscados hasta el momento.
![image](https://github.com/user-attachments/assets/c95aa3fc-5074-47b7-beac-f5b1118cce03)


### 3. Ver libros por idioma

Al seleccionar esta opción, se pedirá igresar el idioma para filtrar los libros. La aplicación mostrará una lista de libros escritos en ese idioma.
![image](https://github.com/user-attachments/assets/038932a9-f9ba-4f16-877f-a020891c7ec1)


### 4. Ver todos los autores

Esta opción muestra una lista de todos los autores de los libros que han sido buscados.
![image](https://github.com/user-attachments/assets/0318c6b3-1fd1-4105-98de-f4b82e7c6e4e)


### 5. Salir

Esta opción cierra la aplicación.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `com.daniel.libreria.libros.api`: Contiene las clases para interactuar con la API de Gutendex.
- `com.daniel.libreria.libros.console`: Contiene la clase principal para ejecutar la aplicación de consola.
- `com.daniel.libreria.libros.models`: Contiene las clases de modelo `Book` y `Author`.
- `com.daniel.libreria.libros.repository`: Contiene la clase `BookRepository` para gestionar la persistencia de los libros.
- `com.daniel.libreria.libros.service`: Contiene la clase `BookService` que implementa la lógica de negocio.

