//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de la base de datos
        Database bd1 = Database.obtenerInstancia();
        bd1.ejecutarConsulta("SELECT * FROM usuarios");

        // Intentar obtener otra instancia de la base de datos
        Database bd2 = Database.obtenerInstancia();
        bd2.ejecutarConsulta("SELECT * FROM productos");

        // Comprobar que ambas instancias son iguales
        if (bd1 == bd2) {
            System.out.println("Ambas referencias apuntan a la misma instancia.");
        }
    }
}