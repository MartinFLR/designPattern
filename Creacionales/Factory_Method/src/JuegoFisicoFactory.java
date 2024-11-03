public class JuegoFisicoFactory {

    public JuegoFisico crearJuego(int id, int importe,int precioTraslado) {
        return new JuegoFisico(id,importe,precioTraslado);
    }
}
