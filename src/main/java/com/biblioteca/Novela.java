package com.biblioteca;

public class Novela extends Libro {
    private TipoNovela tipo;

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        setTipo(tipo);
    }

    public TipoNovela getTipo() { return tipo; }
    public void setTipo(TipoNovela tipo) {
        if (tipo == null) throw new IllegalArgumentException("El tipo de novela es obligatorio");
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Novela{" + super.toString() + ", tipo=" + tipo + '}';
    }
}