
import java.util.List;

class Student {
	private int gpa;
	private int age;
	private String fullName;
	
	public Student(int age, int gpa,  String fullName) {
		super();
		this.gpa = gpa;
		this.age = age;
		this.fullName = fullName;
	}

	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



}

public class TripleSorter {

	public static String sort(List<Student> students) {
		students.sort((o1, o2) -> {
			String surname1 = o1.getFullName().split(" ")[1];
			String surname2 = o2.getFullName().split(" ")[1];
			if (o1.getGpa() != o2.getGpa()) {
				return o2.getGpa()-o1.getGpa();
			} else {
				if (surname1.charAt(0) != surname2.charAt(0)) {
					return surname1.compareTo(surname2);
				} else {
					return o1.getAge() - o2.getAge();
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for (Student student : students) {
			sb.append(student.getFullName() + ",");
		}
		return sb.deleteCharAt(sb.length()-1).toString();
		
	}
}
