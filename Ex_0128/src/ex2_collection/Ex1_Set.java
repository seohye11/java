package ex2_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬렉션 프레임워크(Set, Map, List)
		//배열과 같이 index를 통해 값을 추가하는 구조의 클래스들
		//일반적인 배열과는 달리 index의 갯수가 졍해져 있지 않고,
		//상황에 따라 늘어나거나 줄어들도록 하는 것이 가능
		
		//Set은 값의 중복을 허용하지 않는다
		//HashSet : 정렬기능 x
		//TreeSet : 오름차순 정렬
		
		Random rnd = new Random();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			//1 ~ 45사이의 난수
			int n = rnd.nextInt(45 - 1 + 1) + 1;
			hs.add(n);
			
			//size()메서드는 배열의 length와 같이 방의 갯수를 판단하는 용도로 사용
			if(hs.size() == 6) {
				break;
			}
		}//while
		
		System.out.println(hs);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("홍길동");
		ts.add("홍길동");//중복 자동 검열
		ts.add("박말순");
		ts.add("joy");
		ts.add("apple");
		
		System.out.println(ts);
		
		hs.removeAll(hs);//HashSet 초기화
		
	}//main

}
