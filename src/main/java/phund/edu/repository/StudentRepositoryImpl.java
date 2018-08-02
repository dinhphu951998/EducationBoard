package phund.edu.repository;

import java.util.ArrayList;
import java.util.List;

import phund.edu.Student;

public class StudentRepositoryImpl implements StudentRepository {
	
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Dinh Phu", "Binh Duong"));
		return list;
	}
}
