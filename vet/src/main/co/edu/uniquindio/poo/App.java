package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear la veterinaria
        Veterinaria veterinaria = new Veterinaria("Clinica Animalia");

        // Crear dueños
        Dueño dueño1 = new Dueño("Carlos Ramírez", "1122334455", "Carrera 45 #23-10");
        Dueño dueño2 = new Dueño("Ana González", "5566778899", "Calle 50 #10-15");

        // Crear animales
        Perro perro1 = new Perro("Max", 6, 12.5, TipoAnimal.DOMESTICO, "Golden Retriever", dueño1);
        Gato gato1 = new Gato("Luna", 2, 3.8, TipoAnimal.DOMESTICO, "Blanco", dueño2);
        Leon leon1 = new Leon("Mufasa", 10, 220.0, TipoAnimal.SALVAJE, 25.0, new HabitatNatural("Desierto"));
        Aguila aguila1 = new Aguila("Volare", 5, 7.2, TipoAnimal.SALVAJE, 3.1, new HabitatNatural("Cañones"));
        Canario canario1 = new Canario("Tweety", 2, 0.4, TipoAnimal.DOMESTICO, dueño1);

        // Agregar animales a la veterinaria
        veterinaria.agregarPerro(perro1);
        veterinaria.agregarGato(gato1);
        veterinaria.agregarLeon(leon1);
        veterinaria.agregarAguila(aguila1);
        veterinaria.agregarCanario(canario1);

        // Mostrar información de la veterinaria
        System.out.println(veterinaria);
    }
}
