import java.util.ArrayList;
import java.util.Random;

//Aplique el patrón State para simular el funcionamiento de atención de una caja en un
//banco. La clase Banco tiene una caja y este puede atender una persona, suspender,
//cerrar y abrir la caja. La caja tiene el nombre del cajero y el estado actual, los estados
//posibles son:
//a. Abierta: imprime por pantalla al cliente próximo en la fila.
//b. Suspendida: en este estado solo atiende a personas mayores a 60 años de
//edad, en otro caso imprime un mensaje de espera.
//c. Cerrada: no atiende personas y muestra mensajes indicando su estado.
//Pruebe el correcto funcionamiento del sistema creando personas con diferentes edades
//y cambiando los estados de la caja.
public class Main {
    public static void main(String[] args) {
        int numClientes = 0;
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numClientes = numClientes +1;
            Random random = new Random();
            Cliente cliente = new Cliente(numClientes,random.nextInt(18,100));
            listaClientes.add(cliente);
        }

        Caja caja = new Caja(listaClientes);

        caja.setEstado(new CajaSuspendida());


        Banco banco = new Banco(caja);





        //El patrón State sugiere que crees nuevas clases para todos los estados posibles
        //de un objeto y extraigas todos los comportamientos específicos del estado
        // para colocarlos dentro de esas clases.
    }
}

