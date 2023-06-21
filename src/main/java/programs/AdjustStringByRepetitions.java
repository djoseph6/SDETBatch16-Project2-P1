package programs;
import java.util.*;
public class AdjustStringByRepetitions {
	/*
	 * Count the number of repetations of words in an ArrayList append that count and return that list.
		You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList 

		input ["switch","tv","switch","tv","switch","tv"]

		output [switch, tv, switch1, tv1, switch2, tv2]

		In this example as word switch is repeated we pick the next entry
		where it is repeated and append the count i.e how many times that
		word was present previously 
	 * 
	 */
	
	public static void main(String[] args) {
	    List<String> test1 = Arrays.asList("switch","tv","switch","tv","switch","tv","radio");
	    List<String> test2 = Arrays.asList("switch","tv","switch","tv");
	     List<String> test3 = Arrays.asList("switch","tv");

	    System.out.println(countDeviceNames(test1));
	    System.out.println(countDeviceNames(test2));
	    System.out.println(countDeviceNames(test3));
	   
	  }



	  public static List<String> countDeviceNames(List<String> deviceNames) {
	  Map<String,Integer> map = new HashMap<String,Integer>();
	    for(int x=0;x<deviceNames.size();x++){
	      if(map.containsKey(deviceNames.get(x))){
	        String device = deviceNames.get(x);
	        Integer newValue = map.get(device)+1;
	        map.replace(device, newValue);
	      }else{
	        map.put(deviceNames.get(x), 0);
	      }
	      
	      if(map.get(deviceNames.get(x))>=1){
	        String orgString = deviceNames.get(x);
	        Integer numToAppend = map.get(orgString);
	        String newString = orgString + numToAppend.toString();
	       // System.out.println(newString);
	        deviceNames.set(x, newString);
	      }
	    }

	    return deviceNames;


	}

}
