//Aplique el patrón Factory Method para la creación de juegos físicos y digitales. Los
//juegos comparten un id y un importe. También el méto_do abstracto getPrecio, que se
//encarga de calcular el precio de uno u otro. Para ello los juegos físicos tienen un
//atributo que es el precio de traslado (a caso de ejemplo elija usted). Y los juegos
//digitales el precio depende de la plataforma en la cual se compra teniendo como
//atributo el precio de la plataforma. Estos valores deben ser float y multiplicarlos al
//importe.
public class Main {
    public static void main(String[] args) {

        JuegoDigitalFactory digitalFactory = new JuegoDigitalFactory();
        JuegoDigital juegoDigital = digitalFactory.crearJuego(1,1000,"Xbox");


        JuegoFisicoFactory fisicoFactory = new JuegoFisicoFactory();
        JuegoFisico juegoFisico =  fisicoFactory.crearJuego(1,2000,1000);

        juegoFisico.getPrecio();
        juegoDigital.getPrecio();



    }
}