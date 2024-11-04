import java.util.ArrayList;

public interface State {
    void imprimirMensaje(ArrayList<Cliente> clientes);

    void cambiarEstado(Caja caja);
}
