package object_oriented_programming.week_07.chapter_03.task_01.dao;

import jakarta.persistence.EntityManager;
import object_oriented_programming.week_07.chapter_03.task_01.datasource.MariaDbJpaConnection;
import object_oriented_programming.week_07.chapter_03.task_01.entity.Currency;

public class CurrencyDao {

    public CurrencyDao() {

    }
    public void persist(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(String iso) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        Currency emp = em.find(Currency.class, iso);
        return emp;
    }

    public void update(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
    }

    public void delete(Currency currency) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }
}
