public class Argentina extends ProductoDecorator{

    public Argentina(Producto producto) {
        super(producto);
    }

    @Override
    public String getPrecio() {
        return "$ARS "+ decoradoProducto.getPrecio();
    }
}
