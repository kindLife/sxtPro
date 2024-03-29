package cn.bjsxt.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {

	public static void main(String[] args) throws ParseException {
		//一个对象对应一行记录
		Employee e1 = new Employee(0301,"brook",3000,"项目部","2007-10");
		Employee e2 = new Employee(0301,"break",3200,"项目部","2007-10");
		Employee e3 = new Employee(0301,"bird",3500,"项目部","2007-10");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Employee> list){
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i).getName());
		}
	}

}
