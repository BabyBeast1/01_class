package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MemberFileInput implements Member, Serializable{
   
@Override
public void execute(ArrayList<MemberDTO> arrayList) throws IOException, ClassNotFoundException, Exception {
	 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt")); 
     
     try {
        while(true) {
        MemberDTO memberDTO = (MemberDTO)ois.readObject();
        arrayList.add(memberDTO);
        }
     }catch(EOFException e) {
     }
     ois.close();
     System.out.println("파일을 정상적으로 읽어들였습니다.");
     
     
}
   
   
}