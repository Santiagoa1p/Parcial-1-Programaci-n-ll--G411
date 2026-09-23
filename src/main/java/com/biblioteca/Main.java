package com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 3, 1);

    Libro libro2 = new Libro();
    System.out.println("Ingrese los datos de libro2");
    System.out.print("Titulo: ");
    libro2.setTitulo(scanner.nextLine());
    System.out.print("Autor: ");
    libro2.setAutor(scanner.nextLine());
    System.out.print("Numero de ejemplares: ");
    libro2.setNumeroEjemplares(Integer.parseInt(scanner.nextLine()));
    System.out.print("Numero de ejemplares prestados: ");
    libro2.setNumeroEjemplaresPrestados(Integer.parseInt(scanner.nextLine()));

    LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
        "Fundamentos de Programacion", "Ana Torres", 5, 1,
        "Programacion II", "Facultad de Ingenieria");
    Novela novela = new Novela("El nombre de la rosa", "Umberto Eco", 2, 0,
        TipoNovela.POLICIACA);

    System.out.println("\nObjetos creados:");
    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libroTextoUNIAC);
    System.out.println(novela);
    System.out.println("\nPruebas de prestamo y devolucion:");
    System.out.println("Prestamo de libro1: " + libro1.prestamo());
    System.out.println("Devolucion de libro1: " + libro1.devolucion());
    System.out.println("Devolucion de novela sin prestamos: " + novela.devolucion());
    System.out.println("Prestamo de novela: " + novela.prestamo());
    }
}