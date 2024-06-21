package Lesson11.Problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hashMap = new HashMap<>();
		for(Student student : students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			hashMap.put(key, student);
		}
		return hashMap;
	}
}
