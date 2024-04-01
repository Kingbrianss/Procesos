import java.util.*;
// Importa el paquete java.util.* para acceder a las clases y metodos relacionados con la utilidad.

//En esta clase se define el metodo de salida y todo lo que conlleva
// Comentario que describe el proposito de la clase.
/**
 * Clase para manejar la salida de datos.
 */
public class output {
    /**
     * Constructor por defecto de la clase output.
     */
    public output() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Método para escribir datos en un archivo de salida.
     * @param outFile 
     * @param outText 
     */
    public void writeData(String outFile, String outText) {
        // Metodo para escribir datos en un archivo de salida, recibe el nombre del archivo y el texto a escribir.
        try {
            
            java.io.FileWriter myWriter = new java.io.FileWriter(outFile);  
            myWriter.write(outText);                                        
            myWriter.close();                                               
        } catch (Exception e) {
            // Manejar cualquier excepcin que ocurra durante la escritura del archivo.
            e.printStackTrace();                                       
        }
    }
}
