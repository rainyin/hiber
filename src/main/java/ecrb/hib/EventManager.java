package ecrb.hib;

import org.hibernate.Session;

import java.util.*;

public class EventManager {

    public static void main(String[] args) {
        EventManager mgr = new EventManager();
                    mgr.createAndStoreEvent("My Event", new Date());

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreEvent(String title, Date theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Event theEvent = new Event();
        theEvent.setTitle(title);
        theEvent.setDate(theDate);
        session.save(theEvent);

        session.getTransaction().commit();
    }

}