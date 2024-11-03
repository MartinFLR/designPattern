// Patrón decorator.
//Dada una clase Producto con un métod_o public String getPrecio() que el precio del
//mismo como String y con dos decimales.
//Eje: 90000,50
//Es necesario crear dos decorators, uno para cuando el sistema usa moneda
//estadounidense($USD) y otro para cuando el sistema usa moneda argentina ($ARS).
//Cada decorator debe implementar getLineDescription de forma de que se devuelva el
//símbolo de la moneda antes del valor.
//Eje: $ARS 90000,50 o $USD 90000,50
//Pruebe la implementación con un producto, imprimiendo:
//● Lo que retorna el métod_o getPrecio()
//● Lo que retorna el métod_o getPrecio() para el primer decorator.
//● Lo que retorna el métod_o getPrecio() para el segundo decorator
public class Main {
    public static void main(String[] args) {
    Producto producto = new Manteca();
        System.out.println(producto.getPrecio());

        producto = new Argentina(producto);
        System.out.println(producto.getPrecio());

        producto = new EstadosUnidos(producto);
        System.out.println(producto.getPrecio());

    //Util cuando quiero darle comportamiento a una clase, hay que revisar bien como se implementa
        // la parte del productoDecorator, las clases hijas a este siempre van a llamar al
        // metodo de la clase padre donde esta el objeto decorado
        // lo notamos en la clase "Argentina" y "Estados unidos", que estas sobreescriben
        // Los metodos del objetoDecorado
    }
}