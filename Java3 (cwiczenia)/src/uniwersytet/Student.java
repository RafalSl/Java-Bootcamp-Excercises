package uniwersytet;

public class Student {
	String name, surname, indexNumber;
	private static int studentCounter;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}

	public static int getStudentCounter() {
		return studentCounter;
	}

	public static void setStudentCounter(int studentCounter) {
		Student.studentCounter = studentCounter;
	}

	public Student(String name, String surname, String indexNumber) {
		this.name = name;
		this.surname = surname;
		this.indexNumber = indexNumber;
		studentCounter++;
	}
}
