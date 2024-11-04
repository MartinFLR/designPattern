import java.util.ArrayList;

public class CajaAbierta implements State{
    private Caja caja;

    @Override
    public void imprimirMensaje(ArrayList<Cliente> clientes) {
        System.out.println("Caja abierta");
        Cliente cliente = clientes.removeLast();
        System.out.println("Pase el cliente siguiente numero: "+ (cliente.getNumero()+1) +" !");
    }

    @Override
    public void cambiarEstado(Caja caja) {
        this.caja = caja;
    }
}
