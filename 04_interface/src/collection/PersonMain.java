package collection;

import java.util.ArrayList;

public class PersonMain {

	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("어피치", 28);
		PersonDTO cc = new PersonDTO("프로드", 33);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		PersonMain pm = new PersonMain();
		
		ArrayList<PersonDTO> list = pm.init();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println();
		
		System.out.println(list.get(0).getName() + "\t" + list.get(0).getAge());
		System.out.println(list.get(1).getName() + "\t" + list.get(1).getAge());
		System.out.println(list.get(2).getName() + "\t" + list.get(2).getAge());
		
		System.out.println("------------------------------------------");
		for(PersonDTO dto : list) {
			System.out.println(dto.getName() + "\t" + dto.getAge());
		}

	}

}
