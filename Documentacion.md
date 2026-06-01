SistemaGestionAcademica
Examen_1


Nombre completo de los 4 integrantes.

John Alex Rojas Alvarado
Cristopher Zuñiga Araya
Ivan Fernando Esquivel Hernández
Ethan Alexandro Naranjo Solis

Descripción del sistema
Sistema de Gestión Académica es una aplicación de consola desarrollada en Java que permite administrar personas dentro de una institución educativa.
 El sistema permite registrar estudiantes y docentes, mostrar la lista de personas registradas, buscar por identificación y ejecutar métodos de forma polimórfica. 
Aplica los principios fundamentales de la Programación Orientada a Objetos junto con un manejo robusto de errores mediante excepciones.

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
Abrir el proyecto en NetBeans.
Asegurarse de que todos los archivos estén dentro del paquete sistemagestoracademica.
Ejecutar la clase Sistemagestoracademica.java que contiene el método main.
Interactuar con el menú principal que aparece en la consola.

Descripción de las ramas utilizadas
El proyecto se desarrolló de manera colaborativa en GitHub utilizando ramas para organizar los aportes de cada integrante y evidenciar el trabajo grupal. La rama principal de integración fue Develop, donde se unieron los cambios de todos los integrantes.

Cada integrante trabajó en una rama propia:
Feature/ClaseBase_John: Integrante 1 para crear las clases base del sistema, incluyendo Persona, Direccion, Utilidades y el enum TipoPersona.
Feature/Herencia_Cristopher: Integrante 2 para implementar la herencia en las clases Estudiante y Docente, con constructores que usan super y métodos sobrescritos.
Feature/Polimorfismo_Ivan: Integrante 3 para aplicar polimorfismo, implementar la interfaz Evaluable, recorrer la lista de personas y ejecutar métodos polimórficos.
Feature/Excepciones_Ethan: Integrante 4 para desarrollar el manejo de excepciones, validaciones, creación de una excepción personalizada y construcción del menú principal con control de errores.

De esta manera, cada rama representó un aporte individual alineado con las Unidades 1, 2, 3 y 4 del examen. El uso de ramas permitió mantener el código organizado, realizar commits de cada uno de los integrantes a medida en la que se iva avanzando.

Resumen del aporte – Integrante 1 (John Rojas Alvarado)
Fui responsable de la creación de las clases base del proyecto, aplicando los principios de la Programación Orientada a Objetos:

Clase Persona
Definición de atributos privados: nombre, identificación, direccion, tipo.
Implementación de un constructor con validaciones para evitar datos vacíos.
Creación de un método privado validarCampo() para centralizar las validaciones.
Inclusión de un atributo constante final PAIS.
Metodos getters y setters con validaciones.
Implementación de un método final mostrarIdentificacion().
Declaración de un método  describirRol() para obligar a las subclases a definir su rol.
Uso del toString() para mostrar todos los datos de la persona en una sola línea.

Clase Direccion
Definición de atributos provincia y ciudad.
Constructor para inicializar los valores.
Métodos getters y setters.
Uso del  toString() para mostrar la dirección en Provincia y Ciudad.

Enumeración TipoPersona
Creación del enum con los valores ESTUDIANTE y DOCENTE.

Clase Utilidades
Implementación de un método estático mostrarBienvenida() para dar la bienvenida al sistema.

Resumen del aporte – Integrante 2 (Cristopher Zuñiga Araya)
Fui responsable de la implementación de la herencia en el sistema, desarrollando las clases Estudiante y Docente a partir de la clase base Persona, aplicando los principios de la Programación Orientada a Objetos:

Clase Estudiante
Definición del atributo privado carrera.
Implementación de constructor utilizando super para inicializar los datos heredados.
Métodos getters y setters para el manejo del atributo carrera.
Sobrescritura del método describirRol() para indicar que es estudiante y su carrera.
Método mostrarDatosEstudiante() para visualizar la información completa.

Clase Docente
Definición del atributo privado especialidad.
Implementación de constructor utilizando super para inicializar los datos heredados.Métodos getters y setters para el manejo del atributo especialidad.
Sobrescritura del método describirRol() para indicar que es docente y su especialidad.
Método mostrarDatosDocente() para visualizar la información completa.

Aplicación de conceptos
Uso de herencia para reutilizar atributos y métodos de la clase Persona.
Aplicación de encapsulamiento mediante atributos privados y métodos de acceso.
Implementación de polimorfismo a través de la sobrescritura del método describirRol().

Resumen del aporte – Integrante 3 (Iván Fernando Esquivel Hernández)
Fui responsable de la implementación del polimorfismo y la interfaz Evaluable en el sistema, desarrollando la clase GestorPersonas y la interfaz Evaluable, aplicando los principios de la Programación Orientada a Objetos:

Interfaz Evaluable
Definición del contrato evaluar() que deben implementar las clases evaluables.
Aplicación en la clase Estudiante para demostrar su uso concreto.

Clase GestorPersonas

Definición del atributo privado listaPersonas de tipo ArrayList<Persona>.
Implementación del método agregarPersona() para registrar objetos Estudiante y Docente a través de la referencia polimórfica Persona.
Método mostrarTodas() que recorre la lista invocando mostrarIdentificacion(), describirRol() y evaluar() de forma polimórfica.
Método mostrarRoles() para ejecutar describirRol() de forma exclusiva sobre todos los elementos de la lista.
Método buscarPorIdentificacion() para localizar una persona por su identificación dentro de la lista.
Método ejecutarEvaluar() que verifica mediante instanceof si la persona implementa Evaluable antes de invocar evaluar().

Clase Main actualizada
Integración de Utilidades.mostrarBienvenida() al inicio de la ejecución.
Instanciación de GestorPersonas como gestor central de la lista polimórfica.
Demostración de polimorfismo recorriendo la lista con distintos tipos de persona.
Prueba de búsqueda por identificación e invocación de describirRol() sobre el resultado.

Aplicación de conceptos
Uso de polimorfismo al tratar objetos Estudiante y Docente como referencias de tipo Persona.
Aplicación de interfaces para definir comportamientos opcionales como evaluar().
Uso de instanceof para verificar tipos en tiempo de ejecución de forma segura.
Invocación de métodos abstractos y finales heredados de Persona de forma polimórfica.


Resumen del aporte – Integrante 4 (Ethan Naranjo Solis)
Implemente la Unidad 4 completa: 

Validaciones de datos, bloques try-catch, excepción personalizada DatoInvalidoException, sucesión de excepciones con throws, uso de IllegalArgumentException e InputMismatchException, y el menú principal interactivo en Sistemagestoracademica.java.
