package programs;
import java.util.*;

public class InterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,10,10,20,30,50,40,60,20,40,80,70};
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		for(int num: arr) {
			if(map.containsKey(num)) {
				int newValue = map.get(num)+1;
				map.replace(num, newValue);
			}else {
				map.put(num, 1);
			}
		}
		
		System.out.println(map);

	}

}
