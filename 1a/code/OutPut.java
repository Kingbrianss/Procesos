import java.util.*;
/**
 * @author King
 */
public class OutPut {

    /**
     * Default constructor
     */
    public OutPut() {
    }

    /**
     * @param outFile 
     * @param outText
     */
    public void writeData(String outFile, String outText) {
        
        Formatter file = null;
        try{
            file = new Formatter("C:\\Users\\brall\\Desktop\\proces\\1a\\code"+outFile);
            file.format("%s", outText);
        }catch(Exception e){
            System.out.println("No se ha podido guardar el archivo");
        }finally{
            file.close();
        }
        }
    }
