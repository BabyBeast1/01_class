package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonSort {
	
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println("정렬 전 = ");
		for(String data : ar) {
			System.out.println(data + "  ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		System.out.println("정렬 후 = ");
		for(String data : ar) {
			System.out.println(data + "  ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("어피치", 35);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("정렬 전");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		System.out.println("나이로 오름차순");
		Collections.sort(list);
		
		System.out.println("정렬 후");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
	}

}
