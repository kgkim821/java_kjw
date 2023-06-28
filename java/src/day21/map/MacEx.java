package day21.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MacEx {

	public static void main(String[] args) {

		/*
		 * map을 배열 처럼사용는 예제
		 */
		
		HashMap<Integer, Integer> map = new HashMap<>();
		//배열 0 번지 1, 1번지에 2 , .... 번지에 5를 저장
		for (int i =0 ; i <5 ;i++) {
			map.put(i, i+1);
		}
		System.out.println(map);
		
		HashMap<String, String> map2 =new HashMap<>();
		map2.put("abc123", "1234567");
		map2.put("qwe1", "qwe123123");
		map2.put("abc123", "abc"); //Key 값이 중복된 정보를 추가
		map2.put("zxc", "abc");
		System.out.println(map2);
		
		
		/* keySet을 이용한 반복문 key 값들을 set 으로 만들어서 반복 */
		Set<String> keySet =map2.keySet();
		Iterator<String> it = keySet.iterator();
			while (it.hasNext()) {
				String id = it.next();//key 값을 가져옴
				String pw = map2.get(id); //key값(id)를 이용해서 value 값을 가져옴
				System.out.println("id : " + id + " ,pw" + pw);
			}
			/* 멤버로 key 와 value 를 가지는 Entry를 이용하여 map 에 있는 key ,value 값을 
			 * Entry 객체 하나에 넣어 Set으로 만듬
			 * */
			Set<Entry<String, String>> entrySet = map2.entrySet();

			Iterator<Entry<String,String>> it2 =entrySet.iterator();
			while(it2.hasNext()) {
				Entry<String, String> tmp = it2.next();
				String id = tmp.getKey();
				String pw = tmp.getValue();
				System.out.println("id : " + id + " ,pw" + pw);
			}
	}
}
