package Task_32;

import Task_32.models.City;
import Task_32.models.Group;
import Task_32.models.Student;
import Task_32.services.StudentService;

public class Main {

    public static void main(String[] args){

        StudentService studentService = new StudentService();
        Student firstStudent = new Student("Mike", "Ran", 25);
        studentService.saveStudent(firstStudent);
        City minsk = new City("Minsk");
        minsk.setStudent(firstStudent);
        firstStudent.addCity(minsk);
        Group firstGroup = new Group("Main Group");
        firstGroup.setStudent(firstStudent);
        firstStudent.addGroup(firstGroup);
        studentService.updateStudent(firstStudent);
    }
}
