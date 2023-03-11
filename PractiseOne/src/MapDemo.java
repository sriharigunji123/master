import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	//Map<String,Integer> m = new HashMap<>();
	//Map<String,Integer> m = new LinkedHashMap<>();
		Map<String,Integer> m = new TreeMap<>();
	
	
	m.put("sai",20);
	m.put("venkat",65);
	m.put("anjali",18);
	m.put("gopi",11);
	m.put("threen",96);
	m.put("sai",null);
	
	Set<String> keys = m.keySet();
	
	for(String key :keys) {
		System.out.println(m.get(key));
	}
	
	
	
	
		
	}

}
