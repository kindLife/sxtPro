package cn.bjsxt.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����Set�ĳ��÷���
 * @author houtingting
 *
 */
public class TestSet {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));//�������aaa�ǵȼ۵ģ�����˵size��2������
		System.out.println(set.size());
		boolean isa =set.contains("aaa");
		System.out.println(isa);
		set.remove("aaa");
	}

}