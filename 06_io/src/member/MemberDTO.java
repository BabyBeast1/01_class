package member;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
	private int no;
	private String name;
	private int age;
	private String phone;
	private String address;
	public MemberDTO(int no, String name, int age, String phone, String address) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return no + "\t" + name + "\t" + age +"\t" + phone + "\t" + address;
	}
}
	