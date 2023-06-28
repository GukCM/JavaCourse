package com.amigoscode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {

    /*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = scanner.nextLine();
        System.out.println("What is your Age?");
        Integer age = scanner.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("You have: " + age + " years");
}

     */
    public static void main(String[] args) {
        //Creacon de Arraylist
        List<String> ListaColores = new ArrayList<>();
        //Creacion mediante la clase Arrays
        String [] nombres = {"Arturo", "Daniel", "Edgar"};
        List<String> listaNombres = Arrays.asList(nombres);
        System.out.println(listaNombres);
        //Adicion de elementos individuales
        ListaColores.add("Azul");
        ListaColores.add("Amarillo");
        ListaColores.add("Morado");
        System.out.println(ListaColores);
        System.out.println(ListaColores.size());
        //Crear lista a partir de otra lista
        List<String> elementos = new ArrayList<>(ListaColores);
        System.out.println(elementos);
        //Combinar 2 listas
        elementos.addAll(listaNombres);
        System.out.println("Lista elementos");
        System.out.println(elementos);
        System.out.println("Lista nombres");
        listaNombres.forEach(System.out::println);
        ListaColores.forEach(System.out::println);
        ListIterator<String> iterador = ListaColores.listIterator();
        System.out.println("Recorrido con iterador");
        while(iterador.hasNext()){
            System.out.println("Color: " + iterador.next());
        }        System.out.println("Recorrido con iterador");
        while(iterador.hasPrevious()){
            System.out.println("Color: " + iterador.previous());
        }

    }
}