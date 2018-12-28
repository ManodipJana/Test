import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author Manodip Jana
 */

/**
 * @author Machinesence
 *
 */
public class SplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String stest="MC_RegenBlowerSensor_dcm-18-000178";
      String stest1=stest.split("_")[0].replace("MC", "Mano");
      System.out.println("aa="+(stest1+"_"+stest.split("_")[1]+"_"+stest.split("_")[2]));
      
      HashMap<String,String> sensorSerialVsDhHm = new HashMap<String,String>();
      sensorSerialVsDhHm.put("dcm-18-000178", "dh-a-2017-000125");
      sensorSerialVsDhHm.put("dpb-18-000094", "dh-a-2017-000123");
      sensorSerialVsDhHm.put("drb-18-000186", "dh-a-2017-000123");
      sensorSerialVsDhHm.put("dcc-18-000243", "dh-a-2017-000124");
      
      System.out.println("hval="+sensorSerialVsDhHm.get(stest.split("_")[2]));
      
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
      System.out.println(timestamp.toString());
      LocalDateTime now = LocalDateTime.now();

      System.out.println("Before : " + now.toString());
      Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher( now.toString());
		
		if (m.find()) {
			System.out.println("Machine name cannot contain spaces or special characters");
			
		}
      
      String str = "dryer4321_abc_dplc-18-000084";        
      if(str.contains("plc")) {  
          System.out.println("This string contains plc");  
      }
      
   // Creating an ArrayList with elements 
      // {1, 2, 3, 4} 
      ArrayList<Integer> arrL = new ArrayList<Integer>(); 
      arrL.add(1); 
      arrL.add(2); 
      arrL.add(3); 
      arrL.add(4); 

      // Using lambda expression to print all elements 
      // of arrL 
      arrL.forEach(n -> System.out.println(n)); 

      // Using lambda expression to print even elements 
      // of arrL 
      arrL.forEach(n -> { 
    	  if (n%2 == 0) 
    		  System.out.println(n); 
    	  }
      ); 
      
      
      System.out.println(" System.currentTimeMillis()="+ System.currentTimeMillis());
      
      System.out.println(" System.currentTimeMillis()+30="+ (System.currentTimeMillis()+(10*60*1000)));
      
	}
	
	

}
