package uniwersytet;

public class University {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", "Kowalski", "AAA");
		Student s2 = new Student("Anna", "Kowalska", "XXX");
		System.out.print(Student.getStudentCounter());
	}

}
