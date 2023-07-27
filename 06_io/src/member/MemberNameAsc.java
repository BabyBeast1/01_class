package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MemberNameAsc implements Member {

    @Override
    public void execute(ArrayList<MemberDTO> arrayList) {
       System.out.println();
       
       Comparator<MemberDTO> com = new Comparator<MemberDTO>() {
    	   @Override
    	   public int compare(MemberDTO m1, MemberDTO m2) {
    		   return m1.getName().compareTo(m2.getName());
    	   }
    	};

        System.out.println("이름으로 오름차순 정렬 결과:");
        Collections.sort(arrayList, com); // 오름차순
        
        for(MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO.getNo()+"\t"
									+memberDTO.getName()+"\t"
									+memberDTO.getAge()+"\t"
									+memberDTO.getPhone()+"\t"
									+memberDTO.getAddress()+"\t");
		}
     }
 }
