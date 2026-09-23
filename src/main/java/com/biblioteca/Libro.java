package com.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
        this("", "", 0, 0);
    }

    public Libro(String titulo, String autor, int numeroEjemplares,
                 int numeroEjemplaresPrestados) {
        setTitulo(titulo);
        setAutor(autor);
        setNumeroEjemplares(numeroEjemplares);
        setNumeroEjemplaresPrestados(numeroEjemplaresPrestados);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo == null ? "" : titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor == null ? "" : autor; }
    public int getNumeroEjemplares() { return numeroEjemplares; }

    public void setNumeroEjemplares(int numeroEjemplares) {
        if (numeroEjemplares < 0 || numeroEjemplares < numeroEjemplaresPrestados) {
            throw new IllegalArgumentException("El total de ejemplares no es valido");
        }
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() { return numeroEjemplaresPrestados; }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        if (numeroEjemplaresPrestados < 0 || numeroEjemplaresPrestados > numeroEjemplares) {
            throw new IllegalArgumentException("El numero de ejemplares prestados no es valido");
        }
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public boolean prestamo() {
        if (numeroEjemplaresPrestados >= numeroEjemplares) return false;
        numeroEjemplaresPrestados++;
        return true;
    }

    public boolean devolucion() {
        if (numeroEjemplaresPrestados == 0) return false;
        numeroEjemplaresPrestados--;
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\''
                + ", ejemplares=" + numeroEjemplares + ", prestados="
                + numeroEjemplaresPrestados + '}';
    }
}