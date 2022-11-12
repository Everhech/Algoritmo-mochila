package logic;

//Hecho por: Andres Torres Ciceri y Edwin Orlando Restrepo Mosquera.
import java.util.*;

public class Knapsack {

    public void maleta(int p[], int g[], int w) { //Método Knapsack

        List<Integer> listaMochila = new ArrayList<Integer>(); //Lista para contener los pesos en la mochila
        List<Integer> listaConteo = new ArrayList<Integer>(); //Lista que guarda las repeticiones de cada peso.

        int valorComparable = 0; //Valor para comparar la ganancia máxima.
        int valorMaximo; //Valor de la ganancia máxima
        String cadenaP = "", cadenaG = ""; //Strings para poder mostrar el vector de peso y ganancia.
        int posicionMaximo = 0; //Valor que contendrá la posición del peso, con la mayor ganancia posible.

        for (int i = 0; i < p.length; i++) { //For que recorre el vector de peso
            int suma = 0; //Variable que contendrá la suma de cada peso, como caso base para salir del while.
            int conteo = 0; //Variable que contará las repeticiones de cada peso que cabe en la mochila.
            cadenaP += p[i] + " "; //Se guarda los valores del vector de peso en una cadena y luego se muestra
            cadenaG += g[i] + " "; //Se guarda los valores del vector de ganancia y se muestra.
            while (suma <= w) { //Condición para salir del while
                suma = suma + p[i]; //Se suma cada peso en cada iteración del while, y se mira la condición
                if (suma <= w) { //Si la suma es menor al peso, se registrarán en una lista y el conteo de repetición aumenta.
                    listaMochila.add(p[i]); //Lista que guardará los pesos en la mochila.
                    conteo++; //Contará las repeticiones de cada peso en la mochila.
                }
            }
            listaConteo.add(conteo); //Guarda el conteo de cada peso repetido.
        }
        System.out.println("Pesos: " + cadenaP); //Muestra el vector de peso
        System.out.println("Ganancias: " + cadenaG); //Muestra el vector de ganancias
        System.out.println("Peso de la mochila: " + w); //Muestra la capacidad que tiene la mochila.

        for (int i = 0; i < listaConteo.size(); i++) { //Recorre la lista de conteo de cada peso repetido.
            valorMaximo = listaConteo.get(i) * g[i]; //Se multiplica la ganancia con la repetición de cada peso
            if ((valorMaximo > valorComparable)) { //Se compara para hallar la ganancia máxima.
                posicionMaximo = i; //Se guarda la posición en donde se encuentra la ganancia máxima
                valorComparable = valorMaximo; //Se intercambia la variable comparable con la del valor máximo
            }
        }
        if (valorComparable != 0) { //Si la ganancia no es de cero muestra la información
            System.out.println("\n\nEl producto que cabe en la mochila de peso " + w + " tiene una ganancia de " + valorComparable);
            System.out.println("El peso con mayor ganancia para la mochila se encuentra en la posición: " + (posicionMaximo + 1));
            System.out.println("El peso del objeto es de " + (p[posicionMaximo]) + " con ganacia " + (g[posicionMaximo]) + " y se repite " + listaConteo.get(posicionMaximo) + " veces para llenar la capacidad de la maleta.");
        } else { //Si la ganancia es de cero, no muestra la información, y muestra el mensaje.
            System.out.println("\n\nEl peso de la mochila es mucho menor que los pesos disponibles.");
        }
    }
}
