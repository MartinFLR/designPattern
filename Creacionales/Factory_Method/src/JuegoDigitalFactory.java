public class JuegoDigitalFactory{

    public JuegoDigital crearJuego(int id, int importe, String plataforma) {
        return new JuegoDigital(id,importe,plataforma);
    }
}
