package com.biblioteca;

public class LibroTextoUNIAC extends LibroTexto {
    private String facultad;

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares,
                           int numeroEjemplaresPrestados, String curso,
                           String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        setFacultad(facultad);
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad == null ? "" : facultad; }

    @Override
    public String toString() {
        return "LibroTextoUNIAC{" + super.toString() + ", facultad='" + facultad + "'}";
    }
}