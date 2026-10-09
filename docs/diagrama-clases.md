classDiagram
    %% 1. Superclase con atributos protected (#) y métodos comunes
    class Persona {
        #nombre : String
        #dui : String
        +presentarse() String
    }

    %% 2. Subclases con ÚNICAMENTE sus atributos y métodos propios
    class Cliente {
        -telefono : String
        +getTelefono() String
    }

    class Empleado {
        -salario : double
        +actualizarNombre(nuevoNombre: String) void
        +getSalario() double
    }

    class Estudiante {
        -carnet : String
        -carrera : String
        +matricular(materia: String) void
    }

    class Docente {
        -especialidad : String
        -añosExperiencia : int
        +impartirClase(materia: String) void
    }

    class Visitante {
        %% No añade atributos propios, solo redefine toString
    }

    %% 3. Triángulo de herencia (▷) para cada relación "es un"
    Persona <|-- Cliente
    Persona <|-- Empleado
    Persona <|-- Estudiante
    Persona <|-- Docente
    Persona <|-- Visitante