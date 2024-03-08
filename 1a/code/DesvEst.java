
/**
 * @author King 
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }

    /**
     * @param media 
     * @param dataList 
     * @param n
     */
    public double getDesvEst(double media, String[] dataList, int n) {
       
        double desv = 0;
        double [] arrData = new double[n];

        for(int i=0;i<n;i++){
            arrData[i]=Double.parseDouble(dataList[i]);
        }
        for(int j=0;j<n;j++){
            desv+=(Math.pow(arrData[j]-media, 2));
        } 
        desv/=(n-1);
        desv=Math.sqrt(desv);

        double desv2 = Math.round(desv*100.0)/100.0;
        
	return desv2;
    }

}
