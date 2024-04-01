import java.util.*;
// Importa el paquete java.util.* para acceder a las clases y métodos relacionados con la utilidad.
//Jorge Rafael Dominguez Roa
//
//En esta clase se encuentra toda la lógica del programa
// Comentario que describe el propósito de la clase.
/**
 * Clase que contiene la lógica del programa.
 */
public class Logic2a {
    /**
     * Constructor por defecto de la clase Logic2a.
     */
    public Logic2a() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Nombre del programa.
     */
    private String programName;
    /**
     * Datos del programa.
     */
    private String data;
    /**
     * Arreglo de cadenas que contiene los datos del programa.
     */
    private String[] arrData;
    /**
     * Contador de líneas de código.
     */
    private int lineCounter;
    /**
     * Contador de métodos.
     */
    private int methodCounter;
    /**
     * Método que contiene la lógica principal del programa.
     */
    public void Logic2a() {
        // Método que contiene la lógica principal del programa.
        // Crear instancias de las clases necesarias para el funcionamiento del programa.
        input myInput = new input();                           // Instancia de la clase input para manejar la entrada de datos desde un archivo.
        Data myData = new Data();                              // Instancia de la clase Data para manejar los datos del programa.
        lineCounter myLineCounter = new lineCounter();         // Instancia de la clase lineCounter para contar líneas de código.
        methodCounter myMethodCounter = new methodCounter();   // Instancia de la clase methodCounter para contar métodos.
        output myOutput = new output();                         // Instancia de la clase output para escribir datos de salida en un archivo.
        programName = "Logic2a.java";                          // Nombre del programa actual.
        data = myInput.readData(programName);                  // Leer los datos del programa desde un archivo.
        arrData = myData.saveData(data);                       // Guardar los datos del programa en un arreglo de cadenas.
        lineCounter = myLineCounter.count(arrData);            // Contar las líneas de código en el programa.
        methodCounter = myMethodCounter.countString(arrData);  // Contar los métodos en el programa.
        // Escribir los resultados en un archivo de salida.
        myOutput.writeData("output", " Num lineas de codigo: " + lineCounter + " Num metodos: " + methodCounter);
    }
}
