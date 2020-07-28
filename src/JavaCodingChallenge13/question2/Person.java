package JavaCodingChallenge13.question2;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstname, String lastName) {
		this.firstName = firstname;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person a = (Person)obj;
			if(a.getFirstName().toLowerCase().equals(this.getFirstName().toLowerCase())) {
				return true;
			}
			
			
//			String name1 = a.firstName.toLowerCase();
//			String name2 = this.firstName.toLowerCase();
//			String lastName1 = a.lastName.toLowerCase();
//			String lastName2 = this.lastName.toLowerCase();
//			boolean result = (name1 == name2 && lastName1 == lastName2);
//			return result;
		}
		return false;
	}
}