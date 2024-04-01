import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
// Importa las clases java.util.*, BufferedReader y FileReader para manejar la entrada de datos desde un archivo.
//Jorge Rafael Dominguez Roa
//
//En esta clase se reciben los datos de entrada para ser leídos
// Comentario que describe el propósito de la clase.
/**
 * Clase para manejar la entrada de datos desde un archivo.
 */
public class input {
    /**
     * Constructor por defecto de la clase input.
     */
    public input() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Cadena que almacena los datos leídos desde el archivo.
     */
    private String data;
    /**
     * Objeto BufferedReader para leer el archivo.
     */
    private BufferedReader br;
    /**
     * Método para leer datos desde un archivo.
     * @param file Nombre del archivo desde el cual se leerán los datos.
     * @return Cadena de texto con los datos leídos desde el archivo.
     */
    public String readData(String file) {
        // Método para leer datos desde un archivo, recibe el nombre del archivo y devuelve una cadena de texto con los datos.
        try {
            br = new BufferedReader(new FileReader(file));          // Crea un objeto BufferedReader para leer el archivo especificado.
            String temp = "";                                       // Variable temporal para almacenar temporalmente cada línea del archivo.
            String brRead;                                          // Variable para almacenar cada línea leída del archivo.
            while ((brRead = br.readLine()) != null) {             // Itera sobre cada línea del archivo hasta llegar al final del archivo.
                temp = temp + brRead + "#";                         // Concatena cada línea leída al final de la cadena temporal, con "#" como separador.
            }                                                       // Fin del bucle de lectura del archivo.
            data = temp;                                            // Almacena la cadena temporal en la variable de instancia 'data'.
        } catch (Exception e) {                                     // Captura cualquier excepción que ocurra durante la lectura del archivo.
            System.out.println(e);                                  // Imprime el mensaje de error en la consola.
        }                                                           // Fin del bloque try-catch.
        return data;                                                // Devuelve la cadena de texto con los datos leídos desde el archivo.
    }                                                               // Fin del método readData().
}
