package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileOutput implements Member {

@Override
public void execute(ArrayList<MemberDTO> arrayList) throws IOException, ClassNotFoundException, Exception {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
	for(int i=0; i<arrayList.size(); i++) {
		oos.writeObject(arrayList.get(i));

	}
	oos.close();
}

}