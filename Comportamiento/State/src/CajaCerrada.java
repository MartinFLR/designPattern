import java.util.ArrayList;

public class CajaCerrada implements State{
    private Caja caja;

    @Override
    public void imprimirMensaje(ArrayList<Cliente> clientes) {
        System.out.println("Caja cerrada, no atendemos a nadie");
    }

    @Override
    public void cambiarEstado(Caja caja) {
        this.caja = caja;
    }
}
