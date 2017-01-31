package maksim_ya;


import maksim_ya.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {


    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            User user = new User();
            user.setAge(30);
            user.setFirstname("Maksim");
            user.setLastname("Yakimets");

            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}