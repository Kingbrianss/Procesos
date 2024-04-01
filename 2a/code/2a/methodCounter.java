import java.util.*;
// Importa el paquete java.util.* para acceder a las clases y métodos relacionados con la utilidad.
//Jorge Rafael Dominguez Roa
//
//En esta clase se lleva a cabo el conteo de métodos en la clase seleccionada en el Logic2a.java
// Comentario que describe el propósito de la clase.
/**
 * Clase para contar métodos en la clase seleccionada.
 */
public class methodCounter {
    /**
     * Constructor por defecto de la clase methodCounter.
     */
    public methodCounter() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Variable para almacenar el total de métodos contados.
     */
    private int totalMethods;
    /**
     * Método para contar los métodos en la clase seleccionada.
     * @param arrData Arreglo de cadenas que contiene las líneas de texto de la clase.
     * @return El total de métodos contados en la clase.
     */
    public int countString(String[] arrData) {
        // Método para contar los métodos en la clase seleccionada, recibe un arreglo de cadenas y devuelve el total de métodos contados.
        for (String line : arrData) {                            // Itera sobre cada línea del arreglo de cadenas.
            if (!line.isEmpty() && line.trim().contains("public")) {
                // Verifica si la línea no está vacía y contiene la palabra clave "public".
                // Esto indica que puede ser una declaración de método.       
                if (!line.trim().contains("class")) {  
                    // Verifica si la línea no contiene la palabra clave "class".
                    // Esto significa que la línea no es una declaración de clase, lo que sugiere que es una declaración de método.               
                    totalMethods++;                                // Incrementa el contador de métodos.
                }
            }
        }
        return totalMethods;                                       // Devuelve el total de métodos contados.
    }
}
