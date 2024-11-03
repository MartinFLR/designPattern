//Aplique el patrón Builder para la construcción de tres tipos de tortas, una torta deberá
//tener como atributo la masa y el relleno. Las tortas deben ser de Vainilla, coco y una a
//su elección para demostrar el objetivo del patrón solicitado
public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        TortaVainillaBuilder vainillaBuilder = new TortaVainillaBuilder();
        director.hacerTortaVainilla(vainillaBuilder);
        TortaVainilla tortaVainilla = vainillaBuilder.build();

    }
}