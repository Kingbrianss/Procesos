import java.util.*;
// Importa el paquete java.util.* para acceder a las clases y métodos relacionados con la utilidad.
//Jorge Rafael Dominguez Roa
//
//En esta clase se lleva a cabo el conteo de líneas y se verifica línea por línea lo que contiene cada una
// Comentario que describe el propósito de la clase.
/**
 * Clase para contar líneas y verificar su contenido.
 */
public class lineCounter {
    /**
     * Constructor por defecto de la clase lineCounter.
     */
    public lineCounter() {
        // Constructor vacío. No realiza ninguna operación.
    }
    /**
     * Variable para almacenar el total de líneas contadas.
     */
    private int totalLines;
    /**
     * Método para contar líneas y verificar su contenido.
     * @param arrData Arreglo de cadenas que contiene las líneas de texto.
     * @return El total de líneas contadas.
     */
    public int count(String[] arrData) {
        // Método para contar líneas y verificar su contenido, recibe un arreglo de cadenas y devuelve el total de líneas contadas.
        for (String line : arrData) {                            // Itera sobre cada línea del arreglo de cadenas.
            if (!line.isEmpty()){                                // Verifica si la línea no está vacía.
                if (line.trim().startsWith("/") || line.trim().startsWith("*") || line.trim().startsWith("}")) {
                    // Verifica si la línea comienza con "//", "/*", "*" o "}". Estos son indicadores de comentarios o delimitadores de bloques.
                    // Si la línea cumple alguna de estas condiciones, no se cuenta como una línea de código y no se incrementa el contador.
                }
                else {
                    totalLines++;                                // Si la línea no es un comentario ni un delimitador de bloque, se cuenta como una línea de código y se incrementa el contador.
                }
            }
        }        
        return totalLines;                                       // Devuelve el total de líneas contadas.
    }
}
