package phund.edu.service;

import java.util.List;

import phund.edu.Student;
import phund.edu.repository.StudentRepository;
import phund.edu.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImpl() {
		studentRepository = new StudentRepositoryImpl();
	}

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

}
