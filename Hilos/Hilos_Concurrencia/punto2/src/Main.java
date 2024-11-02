//Implemente un programa que lance cuatro threads, cada uno incrementará una variable
//contador de tipo entero, compartida por todos, 5000 veces y luego imprima.
//Java: ¿Que diferencia hay entre trabajar con Runnable o Threads?

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ContadorCompartido contador = new ContadorCompartido();
            ArrayList<Thread> hilos = new ArrayList<>();
            ArrayList<Thread> hilosRestadores = new ArrayList<>();


            for (int i = 0; i < 4; i++) {
                Thread hilo = new Thread(new Hilo(contador,i));
                hilos.add(hilo);
                hilo.start();
            }
            for (Thread hilo : hilos) {
                try {
                    hilo.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            for (int i = 0; i < 4; i++) {
                Thread hiloRestador = new Thread(new HiloRestador(contador,i));
                hilosRestadores.add(hiloRestador);
                hiloRestador.start();
            }

            for (Thread hilosRestadore : hilosRestadores) {
                try {
                    hilosRestadore.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
