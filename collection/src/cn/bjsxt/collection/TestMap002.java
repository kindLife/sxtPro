package cn.bjsxt.collection;

import java.util.LinkedList;

/**
 * Map�ĵͲ�ʵ�������������
 * �Զ���Map��������
 * 1.��߲�ѯ��Ч��
 * @author houtingting
 *������ˣ���֪���Ĵ���
 */
public class TestMap002 {
	LinkedList arr[] = new LinkedList[999];
	int size;
	
	public void put(Object key,Object value){
		Entry e = new Entry(key,value);
		
		int a = key.hashCode()%arr.length;
		if(arr[a] == null){
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			LinkedList list = arr[a];
			for(int i = 0;i < list.size();i++){
				Entry e2 = (Entry)list.get(i);
				if(e2.key.equals(key)){
					e2.value = value;
					return;
				}
			}
			arr[a].add(e);
		}
	}
	
	public Object get(Object key){
		int a = key.hashCode()%arr.length;
		if(arr[a] != null){
			LinkedList list = arr[a];
			for(int i = 0;i < list.size();i++){
				Entry e = (Entry)list.get(i);
				if(e.equals(key)){
					return e.value;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		TestMap002 map = new TestMap002();
		map.put("����", new Wife("������"));
		map.put("������", new Wife("����"));
		Wife w = (Wife) map.get("����");
		System.out.println(w.name);
	}

}


