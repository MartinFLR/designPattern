//Aplique el patrón Builder para la construcción de tres tipos de tortas, una torta deberá
//tener como atributo la masa y el relleno. Las tortas deben ser de Vainilla, coco y una a
//su elección para demostrar el objetivo del patrón solicitado
public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        TortaVainillaBuilder vainillaBuilder = new TortaVainillaBuilder();
        director.hacerTortaVainilla(vainillaBuilder);
        TortaVainilla tortaVainilla = vainillaBuilder.build();

        tortaVainilla.imprimir();

        //Este patron es util cuando se quiere achicar el tamaño del constructor, separando en partes
        //La inicializacion del objeto, se le agrega un director por si ademas se desea
        //cambiar el orden en el que estos son puestos, aunque es a eleccion del programador.
        //Una cosa que hay que tener en cuenta en este patron es que el metodo
        //reset() es indispensable, ya que este prepara el builder para una nueva generacion del objeto
    }
}