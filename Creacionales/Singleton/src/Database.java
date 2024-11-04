import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Database {
    // Variable estática que almacena la única instancia de la clase
    private static Database instancia;

    private String name;

    // Constructor privado para evitar que se creen instancias desde fuera de la clase
    private Database() {
        this.name = "MiBaseDeDatos " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Conectando a la base de datos...");
    }

    // Métod_o público estático para obtener la única instancia de la clase
    public static Database obtenerInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    // Un métod_o de ejemplo para mostrar que la instancia es única
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta + " con BD: " + this.name);
    }
}
