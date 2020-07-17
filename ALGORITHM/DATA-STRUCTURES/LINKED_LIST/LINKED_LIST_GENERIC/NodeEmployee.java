public class NodeEmployee {
	private int id;
	private String firstName;
	private String lastName;

	NodeEmployee next;

	public NodeEmployee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void displayAll() {
		System.out.print("[id=" + id + "firstName=" + firstName + ", lastName=" + lastName + "]");
	}

	@Override
	public String toString() {
		return "[id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "] ";
	}

	
}
