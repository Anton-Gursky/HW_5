package Task_32.dao;

import Task_32.models.City;
import Task_32.models.Group;
import Task_32.models.Student;
import Task_32.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {

    public Student findByID(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public void save(Student student){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.getTransaction();
        session.save(student);
        tx1.commit();
        session.close();
    }

    public void update(Student student){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();
    }

    public void delete(Student student){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }

    public City findCityByID(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(City.class, id);
    }

    public Group findGroupByID(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Group.class, id);
    }

    public List<Student> findAll(){
        List<Student> students = (List<Student>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Student").list();
        return students;
    }
}