import java.util.ArrayList;

public class CajaSuspendida implements State{
    private Caja caja;

    @Override
    public void imprimirMensaje(ArrayList<Cliente> clientes) {
        System.out.println("Caja suspendida, solo atenderemos a mayores de 60!");

        // Crear lista de clientes mayores de 60 sin modificar la lista original
        ArrayList<Cliente> mayores60 = new ArrayList<>();
        for (Cliente cliente : clientes) {
            System.out.println("Cliente número " + cliente.getNumero() + " tiene " + cliente.getEdad() + " años.");
            if (cliente.getEdad() >= 60) {
                mayores60.add(cliente);
            }
        }

        // Imprimir todos los clientes mayores de 60
        if (!mayores60.isEmpty()) {
            for (Cliente cliente : mayores60) {
                System.out.println("Pase señor número " + cliente.getNumero());
            }
        } else {
            System.out.println("No hay clientes mayores de 60 en la lista.");
        }
    }




    @Override
    public void cambiarEstado(Caja caja) {
        this.caja = caja;
    }
}
