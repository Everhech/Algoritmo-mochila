package main;

//Hecho por: Andres Torres Ciceri y Edwin Orlando Restrepo Mosquera.
import logic.Knapsack;

public class Main {

    public static void main(String[] args) {
        int peso[] = {1, 2, 4, 5}; //Vector de enteros con los pesos de los elementos
        int ganancia[] = {15, 10, 9, 5}; //Vector de enteros con la ganancia elementos 
        int w = 8; // Variable entera para la capacidad de la maleta
        Knapsack mochila = new Knapsack(); //Iniciacion de la variable para llamar el metodo donde está ubicada la lógica
        mochila.maleta(peso, ganancia, w); //Método para la mochila.
    }

}
