package EducationBoard.EducationBoard;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import phund.edu.Student;
import phund.edu.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	StudentService serivce = (StudentService) context.getBean("studentService");
        List<Student> list = serivce.getAllStudent();
        System.out.println(list.size());
        for (Student student : list) {
			System.out.println(student.toString());
		}
    }
}
