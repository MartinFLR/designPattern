public class Helper {

    public String traducir(String palabra){
        String respuesta;
        switch (palabra){
            case "Hi" -> {
                respuesta = "Hola";
                return respuesta;
            }
            case "Bye" -> {
                        respuesta = "Adios";
                        return respuesta;
            }
            case "Fake" ->{
                respuesta = "Falso";
                return respuesta;
            }
            default -> throw new IllegalStateException("Unexpected value: " + palabra);
        }
    }
}
