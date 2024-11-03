//Aplique el patrón de diseño Observer para un sistema de reporte del clima, defina la
//clase Sistema Meteorológico que extienda de la clase Observable y tenga como atributo
//el estado del clima en forma de String. Cada vez que se modifica el clima esté notifica a
//todos los observadores. El observador va a ser la clase Reportero que implementa la
//interfaz Observer, él será el encargado de imprimir por consola el clima cuando cambia
//en el sistema meteorológico.
//Pruebe el sistema creando instancias de cada clase y cambiando el clima.
public class Main {
    public static void main(String[] args) {

        SistemaMetereologico sistemaMetereologico = new SistemaMetereologico("Calido");
        Reportero reportero = new Reportero(sistemaMetereologico);

        sistemaMetereologico.setEstadoClima("aldo");



    }
}