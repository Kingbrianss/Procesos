import java.util.*;
// Importa el paquete java.util para acceder a las clases y métodos relacionados con la utilidad.
//Jorge Rafael Dominguez Roa
// Esta clase contiene 8 líneas de código y dos métodos
/**
 * Clase para manejar datos.
 */
public class Data {
    /**
     * Constructor por defecto de la clase Data.
     */
    public Data() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Método para guardar datos.
     * @param data Cadena de texto con los datos a guardar.
     * @return Arreglo de cadenas con los datos guardados.
     */
    public String[] saveData(String data) {
        // Método para guardar datos, recibe una cadena de texto y devuelve un arreglo de cadenas.
        String[] arrData = data.split("#");                               // Divide la cadena de texto en partes usando "#" como delimitador y guarda los resultados en un arreglo.
                                                                          // Esto se logra mediante el método split() de la clase String.
        for (int i = 0; i < arrData.length; i++) {
            arrData[i] = arrData[i].trim();                                // Itera sobre cada elemento del arreglo y elimina los espacios en blanco al inicio y al final de cada cadena.
                                                                          // Esto se logra mediante el método trim() de la clase String.
        }                                                                       
        return arrData;                                                   // Devuelve el arreglo de cadenas con los datos guardados.
    }
}
