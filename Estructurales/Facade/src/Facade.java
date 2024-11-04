public class Facade {
    private Helper traductor;
    private Helper2 modificador;

    public Facade(){
        traductor = new Helper();
        modificador = new Helper2();
    }

    public void traducirPalabra(String palabra){
        String palabraTrad = traductor.traducir(palabra);
        palabraTrad = modificador.toUpper(palabraTrad);
        System.out.println(palabraTrad);
        palabraTrad = modificador.toLower(palabraTrad);
        System.out.println(palabraTrad);
    }
}
