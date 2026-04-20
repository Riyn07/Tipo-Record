package com.example;


public class App {

    static final int XX = 5;
    public static void main(String[] args) {
    
            // una clase final significa que no se puede extender, es decir, no se pueden crear subclases de esa clase.
            // una clase no puede ser final y abstracta al mismo tiempo, ya que una clase abstracta está diseñada para ser extendida, mientras que una clase final no puede ser extendida.
            Persona persona = Persona.builder()
                .nombre("Javier")
                .edad(30)
                .build();
            System.out.println(persona.nombre());
            Persona persona2 = Persona.builder()
                .nombre("Carlos")
                .edad(25)
                .build();
            System.out.println(persona2);
    }
}
