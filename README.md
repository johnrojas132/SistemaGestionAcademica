Sistema de Gestión Académica
Integrantes
Nombre completo:Jhon Rojas Cristopher Zuñiga Ivan Ezquivel Ethan Naranjo

Descripción del sistema
Sistema de Gestión Académica es una aplicación de consola desarrollada en Java que permite administrar personas dentro de una institución educativa. El sistema permite registrar estudiantes y docentes, mostrar la lista de personas registradas, buscar por identificación y ejecutar métodos de forma polimórfica. Aplica los principios fundamentales de la Programación Orientada a Objetos junto con un manejo robusto de errores mediante excepciones.

Temas aplicados

Clases y objetos: creación de clases con atributos privados, métodos getter y setter, uso de this y variable final.
Composición: la clase Persona contiene un objeto Direccion.
Enum: enumeración TipoPersona con los valores ESTUDIANTE y DOCENTE.
Herencia: las clases Estudiante y Docente extienden de Persona usando extends y super.
Polimorfismo: lista de tipo Persona que almacena objetos Estudiante y Docente, invocando métodos de forma polimórfica.
Interfaz: interfaz Evaluable con el método evaluar(), implementada en Estudiante.
Método final: método mostrarIdentificacion() declarado como final en Persona.
Clase abstracta: Persona es abstracta con el método abstracto describirRol().
Manejo de errores: validaciones para evitar datos vacíos o nulos en todos los campos del sistema.
Excepciones: uso de try-catch, excepción personalizada DatoInvalidoException, excepciones propias de Java (IllegalArgumentException, InputMismatchException) y sucesión de excepciones con throws.
Git y GitHub: desarrollo colaborativo mediante ramas, commits significativos y merge a la rama principal.


Instrucciones para ejecutar el programa

Clonar el repositorio desde GitHub.
Abrir el proyecto en NetBeans (o cualquier IDE compatible con Java).
Asegurarse de que todos los archivos estén dentro del paquete sistemagestoracademica.
Ejecutar la clase Sistemagestoracademica.java que contiene el método main.
Interactuar con el menú principal que aparece en la consola.


Ramas utilizadas
RamaResponsableDescripciónmainTodosRama principal con el código final integradofeature/ExcepcionesEthanEthan NaranjoUnidad 4: validaciones, excepciones, menú principalfeature/Biblio_Main_EthanEthan NaranjoIntegración del Main y pruebas generales

Aporte de cada integrante
Jhon Rojas — Integrante 1
Desarrolló las clases base del sistema: Persona, Direccion, TipoPersona y Utilidades. Implementó los atributos privados, métodos getter y setter, uso de this, la variable final PAIS, la enumeración TipoPersona y el método estático de bienvenida en Utilidades.
Cristopher Zuñiga — Integrante 2
Desarrolló la herencia del sistema mediante las clases Estudiante y Docente, ambas extendiendo de Persona. Implementó los constructores usando super, agregó los atributos específicos de cada subclase (carrera y especialidad) y demostró la relación entre superclases y subclases.
Ivan Ezquivel — Integrante 3
Implementó el polimorfismo del sistema. Declaró el método abstracto describirRol() en Persona y lo implementó en Estudiante y Docente. Creó la interfaz Evaluable con el método evaluar() y la implementó en Estudiante. Desarrolló la clase GestorPersonas con la lista polimórfica y los métodos de recorrido.
Ethan Naranjo — Integrante 4
Implementó la Unidad 4 completa: validaciones de datos, bloques try-catch, excepción personalizada DatoInvalidoException, sucesión de excepciones con throws, uso de IllegalArgumentException e InputMismatchException, y el menú principal interactivo en Sistemagestoracademica.java.
