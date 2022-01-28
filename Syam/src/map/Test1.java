package map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("syam", "100");
		m.put("kumar", "200");
		m.put("paide", "300");
		m.put("diwakar", "300");
		m.put("syam", "20");
		m.put("paide","10");
		System.out.println(m);
		System.out.println(m.get("syam"));
		System.out.println(m.get("syam"));
		System.out.println(m.get("paide"));
		System.out.println(m.get("Syam"));
		
		
		
	}
}
