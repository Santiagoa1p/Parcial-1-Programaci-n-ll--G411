package com.biblioteca;

public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto() { super(); curso = ""; }

    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                      int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        setCurso(curso);
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso == null ? "" : curso; }

    @Override
    public String toString() {
        return "LibroTexto{" + super.toString() + ", curso='" + curso + "'}";
    }
}