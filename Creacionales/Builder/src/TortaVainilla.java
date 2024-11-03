public class TortaVainilla extends Torta {
    private int cantExtractoVainilla;

    @Override
    public void imprimir() {
        System.out.println(this.getCantHuevo());
        System.out.println(this.getCantLeche());
        System.out.println(this.getCantHarina());
        System.out.println(this.cantExtractoVainilla);
    }

    public void setCantExtractoVainilla(int cantExtractoVainilla) {
        this.cantExtractoVainilla = cantExtractoVainilla;
    }


}
