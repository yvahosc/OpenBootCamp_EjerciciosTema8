package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Yeisson");
        persona.setEdad(26);
        persona.setTelefono("555-123-4523");

        System.out.println("El nombre de la persona correspondiente al " +
                "objeto de la clase Persona creado es: " + persona.getNombre()
                + ".");
        System.out.println("La edad de la persona correspondiente al " +
                "objeto de la clase Persona creado es: " + persona.getEdad()
                + ".");
        System.out.println("El teléfono de la persona correspondiente al " +
                "objeto de la clase Persona creado es: " + persona.getTelefono()
                + ".");
    }
}
