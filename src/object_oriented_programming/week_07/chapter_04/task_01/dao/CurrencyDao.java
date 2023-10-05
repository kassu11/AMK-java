package object_oriented_programming.week_07.chapter_04.task_01.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import object_oriented_programming.week_07.chapter_04.task_01.datasource.MariaDbJpaConnection;
import object_oriented_programming.week_07.chapter_04.task_01.entity.Currency1;

import java.util.List;

public class CurrencyDao {

    public CurrencyDao() {

    }
    public void persist(Currency1 currency1) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency1);
        em.getTransaction().commit();
    }

    public Currency1 find(String iso) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        Currency1 emp = em.find(Currency1.class, iso);
        return emp;
    }

    public void update(Currency1 currency1) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency1);
        em.getTransaction().commit();
    }

    public void delete(Currency1 currency1) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency1);
        em.getTransaction().commit();
    }

    public List<Currency1> getAll() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        TypedQuery<Currency1> query = em.createQuery("SELECT c FROM Currency1 c", Currency1.class);
        List<Currency1> currencies = query.getResultList();
        return currencies;
    }
}
