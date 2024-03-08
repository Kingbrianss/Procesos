
/**
 * @author King 
 */
public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * @param data
     */
    
    public String[] saveData(String data) {
   
	String[] arrData = data.split(",");
    for(int i=0;i<arrData.length;i++){
        System.out.println(arrData[i]);
    }
	return arrData;
    }

}
