

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;


public class Main {

	public static void main(String[] args) {
		System.out.println(top3("a a a  b  c c  d d d d  e e e e e"));

	}
	
	public static List<String> top3(String s) {
        String[] arr = s.toLowerCase().split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        
        for (String string : arr) {
        	if (string.matches(".*[a-zA-Z].*")) {
        		map.put(string, map.getOrDefault(string, 0)+1);
    			if (map.get(string)>arr.length/2) break;
        	}
		}
        
        List<Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        List<String> finalList = new LinkedList<>();
        list.sort((o1, o2) -> o2.getValue()-o1.getValue());
        
        for (int i = 0; i<3; ++i) {
        	finalList.add(list.get(i).getKey());
        }
        
        
        return finalList;
        
    }
}
