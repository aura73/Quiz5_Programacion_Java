import java.util.LinkedList;
import java.util.Set;

public class Biblioteca {
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (int i = 0; i < librosDisponibles.size(); i = i + 1) {
            Libro libro1 = librosDisponibles.get(i);
            if (titulo.equals(libro1.getTitulo())) {
                return libro1;
            }
        }
        return null;
    }

    public LinkedList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

}



