import java.util.ArrayList;

public class Carrera {
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public void comienzaCarrera(){
        Integer tiempoTotal = 0;
        for (Jugador jugador : listaJugadores) {
            jugador.start();
            try {
                jugador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tiempoTotal += jugador.getTiempo();
        }
        System.out.println("Tiempo total: " + tiempoTotal);
    }

}
