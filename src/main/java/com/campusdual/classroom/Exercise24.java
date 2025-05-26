package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> lista = new LinkedList<>();
        lista.offer("Smith");
        lista.offer("Montessori");
        lista.offer("Peralta");
        lista.offer("House");
        return lista;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        System.out.println("Contenido de la cola:");
        printAndEmptyQueue(queue);

        System.out.println("Cola despues de vaciarse:");
        printAndEmptyQueue(queue); // No debería imprimir nada, ya que la cola está vacía.
    }

}
