package HR;

public class Person {
	private String name,age,gender,address;
	Person(){
		// this is a default constructor
	}
	Person(String name, String age, String gender, String address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}



	public String getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Employee name is "+ getName() +"\nAge"+getAge()+"\nGender"+
				getGender()+"\nAddress"+getAddress();
	}


}
