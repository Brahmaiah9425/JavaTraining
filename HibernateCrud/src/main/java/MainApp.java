import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {
        // Create
        Student student = new Student("Brahmaiah", "Brahmaiah@gmail.com");
        saveStudent(student);

        // Read
        Student retrieved = getStudentById(student.getId());
        System.out.println("Retrieved: " + retrieved.getName());

        // Update
        retrieved.setEmail("Brahmaiah@gmail.com");
        updateStudent(retrieved);

        // Delete
        deleteStudent(retrieved.getId());

        HibernateUtil.getSessionFactory().close();
    }

    public static void saveStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public static Student getStudentById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Student.class, id);
        }
    }

    public static void updateStudent(Student student) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.update(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Student student = session.get(Student.class, id);
            if (student != null) {
                tx = session.beginTransaction();
                session.delete(student);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
