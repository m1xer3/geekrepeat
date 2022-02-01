package ru.danilsibgatullin;

import ru.danilsibgatullin.models.Student;
import ru.danilsibgatullin.services.EntityConnector;
import ru.danilsibgatullin.services.StudentService;

import java.util.List;

public class AppStart {
    public static void main(String[] args) {

        StudentService service = new StudentService(EntityConnector.getEmFactory());

//        for(int i=1;i<=1001;i++){
//            service.addStudent(new Student(null,"Student-"+i,"Mark - "+i));
//        }

        System.out.println(service.getOneStudent(55L));

        List<Student> listOut = service.getAllStudents();

        service.removeStudent(service.getOneStudent(55L));


    }
}
