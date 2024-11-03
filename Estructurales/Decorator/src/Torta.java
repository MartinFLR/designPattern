public abstract class Torta {
    private int cantHuevo;
    private int cantHarina;
    private int cantLeche;
    private String relleno;

    public void setCantHarina(int cantHarina) {
        this.cantHarina = cantHarina;
    }

    public void setCantHuevo(int cantHuevo) {
        this.cantHuevo = cantHuevo;
    }

    public void setCantLeche(int cantLeche) {
        this.cantLeche = cantLeche;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public abstract void imprimir();

    public int getCantHuevo() {
        return cantHuevo;
    }

    public String getRelleno() {
        return relleno;
    }

    public int getCantLeche() {
        return cantLeche;
    }

    public int getCantHarina() {
        return cantHarina;
    }
}
