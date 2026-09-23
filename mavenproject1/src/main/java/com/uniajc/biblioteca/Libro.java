package com.uniajc.biblioteca;


public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public int getEjemplaresDisponibles() {
        return numeroEjemplares - numeroEjemplaresPrestados;
    }

    public boolean prestar() {
        if (getEjemplaresDisponibles() > 0) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                ", disponibles=" + getEjemplaresDisponibles() +
                '}';
    }
}
