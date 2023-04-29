package Task_32.services;

import Task_32.dao.StudentDao;
import Task_32.models.City;
import Task_32.models.Group;
import Task_32.models.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentsDao = new StudentDao();

    public Student findStudent(int id){
        return studentsDao.findByID(id);
    }

    public void saveStudent(Student student){
        studentsDao.save(student);
    }

    public void deleteStudent(Student student) {
        studentsDao.delete(student);
    }

    public void updateStudent(Student student) {
        studentsDao.update(student);
    }

    public List<Student> findAllStudents(){
        return studentsDao.findAll();
    }

    public City findCItyByID(int id){
        return studentsDao.findCityByID(id);
    }

    public Group findGroupByID(int id){
        return studentsDao.findGroupByID(id);
    }
}