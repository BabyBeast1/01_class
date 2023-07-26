package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO);
		}

	}

}
