//Como parte de un sistema de administración de archivos debe implementar, usando el
//patrón Composite, las clases necesarias para organizar carpetas y archivos.
//Tod_o elemento posee un nombre y un métod_o que indica si es carpeta o no. En el caso
//de las carpetas cuentan con un listado de elementos que contienen.
//El objetivo final será crear una serie de elementos y su contenido para luego imprimir el
//nombre de cada uno.
//Ejemplo de salida:
//● Carpeta 1
//○ Carpeta 2
//■ Archivo 1
//■ Archivo 2
//○ Archivo 3
//● Carpeta 3
//○ Archivo 4
public class Main {
    public static void main(String[] args) {
        Carpeta carpeta1 = new Carpeta("Carpeta1");
        Carpeta carpeta2 = new Carpeta("Carpeta2");
        Carpeta carpeta3 = new Carpeta("Carpeta3");
        Archivo archivo1 = new Archivo("Archivo1");
        Archivo archivo2 = new Archivo("Archivo2");
        Archivo archivo3 = new Archivo("Archivo3");
        Archivo archivo4 = new Archivo("Archivo4");


        carpeta1.agregarElemento(carpeta2);
            carpeta2.agregarElemento(archivo1);
            carpeta2.agregarElemento(archivo2);

        carpeta1.agregarElemento(archivo3);

        carpeta3.agregarElemento(archivo4);


        carpeta1.mostrarDetalle();


    }
}