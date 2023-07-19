package cunstructor;

public class MemberDTO { // Data Transfer Object  여러 데이터들을 한번에 묶어서 보냄
	 private String name;
	 private String age;
	 private String phone;
	 private String address;
	 
	 public MemberDTO(String name, String age, String phone, String address) {
		 this.name = name;
		 this.age = age;
		 this.phone = phone;
		 this.address = address;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public String getAge() {
		 return age;
	 }
	 public String getPhone() {
		 return phone;
	 }
	 public String getAddress() {
		 return address;
	 }
	

}

// MemberVO (Value Object)