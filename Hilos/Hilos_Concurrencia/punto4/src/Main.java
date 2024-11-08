//Implemente una simulación de un entrenamiento de carrera de posta para un equipo de
//cuatro integrantes. En este tipo de carreras el primer integrante se coloca en línea de
//largada y los otros tres en posiciones más adelantadas. Cuando la carrera comienza el
//primer integrante debe correr hasta la posición del integrante 2 y entregar la posta;
//luego el integrante 2 corre hasta la posición del integrante 3 y entrega la posta; luego
//este hasta el integrante 4 y finalmente, este último, corre hasta la línea de llegada. Es
//decir, que cada integrante del equipo comienza a correr cuando el anterior le entrega la
//posta y termina cuando hace entrega al siguiente.
//Para esta simulación cada Corredor extenderá de Thread y finalizará dentro de un
//rango random de entre 5 y 10 segundos. Solo a partir de que termine podrá comenzar el
//siguiente corredor.
//La impresión en salida debe ser similar a la siguiente:
//Inicia Corredor 1
//Tiempo: 7 segundos
//Inicia Corredor 2
//Tiempo: 8 segundos
//Inicia Corredor 3
//Tiempo: 8 segundos
//Inicia Corredor 4
//Tiempo: 7 segundos
//Tiempo total 30 segundos.
public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        for(int i=0;i<4;i++){
            carrera.agregarJugador(new Jugador(i, new ContadorCompartido()));
        }

        carrera.comienzaCarrera();
    }
    }
