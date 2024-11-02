//Implemente un programa que lance cuatro threads, cada uno incrementará una variable
//contador de tipo entero, compartida por todos, 5000 veces y luego imprima.
//Java: ¿Que diferencia hay entre trabajar con Runnable o Threads?

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContadorCompartido contador = new ContadorCompartido();
        ArrayList<Thread> hilos = new ArrayList<>();
        

        for (int i = 0; i < 4; i++) {
            Thread hilo = new Thread(new Hilo(contador,i));
            hilos.add(hilo);
        }

        for (Thread hilo : hilos) {
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }
