import java.util.ArrayList;

public class Caja {
    private State estado;
    private ArrayList<Cliente> clientes;

    public Caja(ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.estado = new CajaAbierta();
    }
    public void imprimirMensajito(){
        this.estado.imprimirMensaje(this.clientes);
    }

    public void setEstado(State estado) {
        this.estado = estado;
        this.estado.cambiarEstado(this);
    }
}
