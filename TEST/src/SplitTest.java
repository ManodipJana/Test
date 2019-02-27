import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
		String ab="CDA05_cs_cdab-19-000005,Mano2PODR_RegenBlowerSensor_drb-19-000010,Mano2PODR_ProcessBlowerSensor_dpb-19-000010";
		String v[]=ab.split(",");
		for (String m : v) {
			System.out.println("Machine Name="+m);
			if(m.startsWith("C")) {
				System.out.println("if valid="+m);
			}
		}
		
		/*List valid = Arrays.asList(ab);
		if (valid.contains("Ma")) {
		    // is valid
			System.out.println("is valid");
		} else {
		    // not valid
			System.out.println("not valid");
		}*/
		String abc="pas-19-a00252";
		String abc1=abc.split("-")[0];
		abc1= abc1.replaceAll("[^\\d]", "");
		abc1= abc1.replaceFirst("^0+(?!$)", "");
		System.out.println("hi abc1="+abc1);
		if(abc1.equals("4")) {
			System.out.println("hi 4=");
		}else if(abc1.equals("2")) {
			System.out.println("hi 2=");
		}else {
			System.out.println("hi 1=");
		}
//		String machineName="CDA05_cs_cdab-19-000077";
		String machineName="pas4_cs_cdab-19-000077";
		if(machineName.contains("pf")||machineName.contains("pas")) {
			System.out.println("pf55555");
		}else {
			System.out.println("cs");
		}
		String ste="041ec11fb4b5_PLC_04";
		String s="CdaPLC39";
	    System.out.println(s);
	    /* You don't need the + because you are using the replaceAll method */
	    s = s.replaceAll("[^\\d]", "");  // or you can also use [0-9]
	   s= s.replaceFirst("^0+(?!$)", "");
	    System.out.println("hi="+s);
	    System.out.println("himmmm="+(Integer.valueOf(s)+1));
	    
//	    String ste1=ste.split("_")[0]+"_"+ste.split("_")[1]+"_"+s;
	    String ste1=ste.split("_")[0]+"_"+ste.split("_")[1]+"_"+String.valueOf((Integer.valueOf(s)+1));
	    System.out.println("look ste1="+ste1);
		
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
