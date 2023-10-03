public class Libro {
    /* *
     * ATRIBUTOS
     * */
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /*
    METODOS
     */

    /**
     * metodo constructor para inicializar la clase libro
     * @param titulo
     * almacena el titulo del libro luego de el ingreso por consola
     * @param autor
     * almacena el autor del libro luego de el ingreso por consola
     * @param numeroPaginas
     * almacena el numero de paginas del libro luego de el ingreso por consola
     */
    public  Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    /**
     * @return
     * muestra el titulo de libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo
     * asigna valores al titulo
     * */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return
     * muestra el autor de libro
     */
    public String getAutor() {
        return autor;
    }
    /**
     * @param autor
     * asigna valores al autor
     * */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * @return
     * muestra el numero de paginas de libro
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    /**
     *
     * @param titulo
     * asigna valores al titulo
     * */
    public void setNumeroPaginas(int numeroPaginas) {
        this.titulo = titulo;
    }
}
