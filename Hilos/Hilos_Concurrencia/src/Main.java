//Implemente un programa que escriba un “hola mundo” por cada hilo de ejecución que
//se cree (seis es un número razonable) y que además indique desde qué hilo se
//imprime. Luego haga que cada uno espere un tiempo proporcional a su identificador
//antes de imprimir el mensaje (el thread 1, un segundo, el 2, dos segundos, el 3, tres
//segundos).
public class Main {
    public static void main(String[] args) {



    //Sin la llamada a hilo.join(), el hilo principal no esperará
    // a que los hilos secundarios terminen su ejecución.
    // Esto significa que el hilo principal puede completar su
    // ejecución y llegar al final del métod_o main antes de que alguno
    //  o todos los hilos secundarios hayan terminado.
    }}
