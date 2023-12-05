package in.sp.beans;

public class Student {

	private String name;
	private int rno;
	private String  email;
	public Student() {
		
	}
	public Student(String name,int rno,String email) {
		super();
		this.name=name;
		this.rno=rno;
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rno: "+rno);
		System.out.println("emial: "+email);
		
		
	}
}
