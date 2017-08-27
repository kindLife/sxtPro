package cn.bjsxt.collection;

/**
 * 自定义类似Map的类
 * 暂不完美
 * Map:用于存放键值对，根据键对象找对应的值对象
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
		map.put("高琪", new Wife("张曼玉"));
		map.put("刘恺威", new Wife("杨幂"));
		Wife w = (Wife) map.get("高琪");
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