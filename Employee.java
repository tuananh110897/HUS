class Employee{

	String id;
	String name;
	int yearBirthday;
	int salary;

	Employee(String id, String name, int yearBirthday, int salary){
	
		this.id = id;
		this.name = name;
		this.yearBirthday = yearBirthday;
		this.salary = salary;
	}
	
	Employee(){

	}

	void printInfo(){
		
		System.out.println(this.id + "\n" + this.name + "\n" + this.yearBirthday + "\n" + salary);
	}


}
