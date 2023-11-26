package javaBeginnerCourse;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
	public static void main(String[] args) {
		
		//Map<String, Integer> numbers = new HashMap<String, Integer>();
		Map<String, Integer> numbers = new TreeMap<String, Integer>();
		//sorts the keys in order
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("four", 4);
		numbers.put("Five", 5);
		
		numbers.remove("Three");
		
		//if(!numbers.containsKey("Two")){
		//     numbers.put("Two", 23);
		//numbers.putIfAbsent("Two", 23);
		//if we want add element when the key value
		//is empty
		
		for(Map.Entry<String, Integer> e : numbers.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String keys : numbers.keySet()) {
			System.out.println(keys);
		}
		for(int values : numbers.values()) {
			System.out.println(values);
		}
		
		System.out.println(numbers.containsValue(5));
		System.out.println(numbers.containsKey("Two"));
		System.out.println(numbers.isEmpty());
		System.out.println(numbers);
		
	}

}
