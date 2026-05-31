SistemaGestionAcademica
Examen_1

Nombre completo de los 4 integrantes.

John Alex Rojas Alvarado
Cristopher Zuñiga Araya
Ivan Fernando Esquivel Hernández
Ethan Alexandro Naranjo Solis

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

Descripción de las ramas utilizadas
El proyecto se desarrolló de manera colaborativa en GitHub utilizando ramas para organizar los aportes de cada integrante y evidenciar el trabajo grupal. La rama principal de integración fue Develop, donde se unieron los cambios de todos los integrantes.

Cada integrante trabajó en una rama propia:
Feature/ClaseBase_John: Integrante 1 para crear las clases base del sistema, incluyendo Persona, Direccion, Utilidades y el enum TipoPersona.
Feature/Herencia_Cristopher: Integrante 2 para implementar la herencia en las clases Estudiante y Docente, con constructores que usan super y métodos sobrescritos.
Feature/Polimorfismo_Ivan: Integrante 3 para aplicar polimorfismo, implementar la interfaz Evaluable, recorrer la lista de personas y ejecutar métodos polimórficos.
Feature/Excepciones_Ethan: Integrante 4 para desarrollar el manejo de excepciones, validaciones, creación de una excepción personalizada y construcción del menú principal con control de errores.
De esta manera, cada rama representó un aporte individual alineado con las Unidades 1, 2, 3 y 4 del examen. El uso de ramas permitió mantener el código organizado, realizar commits de cada uno de los integrantes a medida en la que se iva avanzando.

