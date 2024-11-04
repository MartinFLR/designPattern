import java.util.ArrayList;

public class ContadorCompartido {
    private int contador = 0;

    public synchronized void incrementar(){
        contador++;
    }

    public int getContador() {
        return contador;
    }
}
