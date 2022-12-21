package id.ac.undiksha.siak.entities;

public class Lecture extends Person {
	private String nip;
//	private String name;
//	private String address;
//	private boolean gender;
	private String department;
	private String faculty;
	
//	public Lecture(String nip, String name, String address, boolean gender, String department,
//			String faculty) {
//		super();
//		this.nip = nip;
////		this.name = name;
////		this.address = address;
////		this.gender = gender;
//		this.department = department;
//		this.faculty = faculty;
//	}
	
//	public Lecture() {
//		this.nip 			= "<invalid nip>";
//		this.name 			= "<invalid name>";
//		this.address 		= "<invalid address>";
//		this.department 	= "<invalid department>";
//		this.faculty 		= "<invalid faculty>";
//	}
	public Lecture() {
		super();
		this.nip 			= "<invalid nip>";
		this.department 	= "<invalid department>";
		this.faculty 		= "<invalid faculty>";
	}

	public void printAllInfo() {
		System.out.println("NIP: "			+ this.getNip());
		System.out.println("Name: "			+ this.getName());
		System.out.println("Address: "		+ this.getAddress());
		System.out.println("Gender: "		+ (getGender()? "Male":"Female"));	
		System.out.println("Department: "	+ this.department);
		System.out.println("Faculty: "		+ this.faculty);
		System.out.println("\n");
	}
	public Lecture(String nip, String department,
			String faculty) {
		super();
		this.nip = nip;
		this.department = department;
		this.faculty = faculty;
	}
	public Lecture( String nip, String name, String address, boolean gender, String department,
			String faculty) {
		super(name, address, gender);
		this.nip = nip;
		this.department = department;
		this.faculty = faculty;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
}
