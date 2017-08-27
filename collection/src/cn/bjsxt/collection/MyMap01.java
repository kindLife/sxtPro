package cn.bjsxt.collection;

/**
 * �Զ�������Map����
 * �ݲ�����
 * Map:���ڴ�ż�ֵ�ԣ����ݼ������Ҷ�Ӧ��ֵ����
 * @author houtingting
 *
 */
public class MyMap01 {
	
	Entry arr[] = new Entry[990];
	int size;
	
	public void put(Object key,Object value){
		Entry e = new Entry(key, value);
		arr[size++] = e;
	}
	
	public Object get(Object key){
		for(int i = 0;i < size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyMap01 map = new MyMap01();
		map.put("����", new Wife("������"));
		map.put("������", new Wife("����"));
		Wife w = (Wife) map.get("����");
		System.out.println(w.name);
	}

}

class Entry{
	Object key;
	Object value;
	
	public Entry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}