import java.util.LinkedList;
import java.util.Set;

public class Biblioteca {
    // Utilizamos una LinkedList para almacenar los libros disponibles.
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    // Método para registrar un libro en la biblioteca.
    // Complejidad temporal: O(1) - Operación de tiempo constante.
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro); // Agregamos el libro a la lista.
    }

    // Método para buscar un libro por título.
    // Complejidad temporal: O(n) 
    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i = i + 1) {
            Libro libro1 = librosDisponibles.get(i); // Obtenemos el libro en la posición i.
            if (titulo.equals(libro1.getTitulo())) { // Comparamos el título del libro con el título buscado.
                return libro1; // Si coincide, devolvemos el libro encontrado.
            }
        }
        return null; // Si no se encuentra ningún libro con el título buscado, devolvemos null.
    }

    // Método para obtener la lista de libros disponibles.
    // Complejidad temporal: O(1) - Operación de tiempo constante.
    public LinkedList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }
}
