package cn.bjsxt.collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {

	public static void main(String[] args) {
		Map map1 = new HashMap();
		map1.put("id", 0301);
		map1.put("name", "����");
		map1.put("salary", 3050);
		map1.put("department", "��Ŀ��");
		map1.put("hireDate", "2007-10");
		
		Map map2 = new HashMap();
		map2.put("id", 0302);
		map2.put("name", "mama");
		map2.put("salary", 3010);
		map2.put("department", "��Ŀ��");
		map2.put("hireDate", "2007-10");
		
		Map map3 = new HashMap();
		map3.put("id", 0303);
		map3.put("name", "dda");
		map3.put("salary", 3020);
		map3.put("department", "��Ŀ��");
		map3.put("hireDate", "2007-10");
		
		List<Map> list = new ArrayList<Map>();
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		printEmpName(list);
	}
	
	public static void printEmpName(List<Map> list){
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i).get("name"));
		}
	}

}