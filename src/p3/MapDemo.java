package p3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MapDemo {
     public static void main(String[] args){
    	 Map<String, List<Electronics>> DevMap = new HashMap<>();
    	 Electronics e1= new Computer(20,1243,4321,"ASUS",80000,9);
    	 Electronics e2= new Computer(40,1631,4322,"ACER",50000,5);
    	 Electronics e3= new Computer(50,1172,4320,"HP",65000,6);
    	
    	 
    	 List<Electronics> compList = new ArrayList<>();
    	 compList.add(e1);
    	 compList.add(e2);
    	 compList.add(e3);    	 
    	 DevMap.put("Camera", camList);
    	 
    	 Electronics a1= new Laptop(30,223,4421,"DELL",60000,9);
    	 Electronics a2= new Laptop(60,163,4422,"LENOVO",80000,5);
    	 Electronics a3= new Laptop(50,112,4420,"HP",65000,6);
    	
    	 
    	 List<Electronics> lapList = new ArrayList<>();
    	 lapList.add(a1);
    	 lapList.add(a2);
    	 lapList.add(a3);    	 
    	 DevMap.put("Laptop", lapList);
    	 
    	 Electronics b1= new AC(20,1243,4321,"Panasonic",80000,9);
    	 Electronics b2= new AC(40,1631,4322,"LG",50000,5);
    	 Electronics b3= new AC(50,1172,4320,"Voltas",65000,6);
    	
    	 
    	 List<Electronics> acList = new ArrayList<>();
    	 acList.add(b1);
    	 acList.add(b2);
    	 acList.add(b3);    	 
    	 DevMap.put("AC", acList);
    	 
    	 Iterator<String> itr = DevMap.keySet().iterator();
    	 while(itr.hasNext())
    	 {
    		 String deviceName = itr.next();
    		   if(deviceName.equals("Computer"))
    		   {
    			   List<Electronics> devices = DevMap.get(deviceName);
    			   for(Electronics device : devices) {
    				   if(device.getPrice()>=50000 && device.getPrice()<=8000)
    				   {
    					   System.out.println(device.brandname);
    				   }
    			   }
    		   }
    	 }
    	 
 System.out.println("        ");
 Collections.sort(compList,new SortBasedonRating());
 doPrint(compList,"Sort Based On Rating");
 System.out.println("        ");
 Collections.sort(compList,new SortBasedonPrice());
 doPrint(compList,"Sort Based On Price");
     }  
     
     public static void doPrint(Collection<Electronics> collection,String tagline)
     {
    	 System.out.println("      ");
    	 for(Electronics device : collection){
    		 System.out.println(device.brandname);
    	 }
     }



     }
    	
