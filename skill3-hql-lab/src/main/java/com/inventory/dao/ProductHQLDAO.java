package com.inventory.dao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;
import java.util.List;
public class ProductHQLDAO {
    public List<Product> getProductsSortedByPrice() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Product> list = session.createQuery("FROM Product ORDER BY price ASC", Product.class).list();
        session.close(); return list;
    }
    public List<Product> getProductsWithPagination(int page, int pageSize) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Product> q = session.createQuery("FROM Product", Product.class);
        q.setFirstResult((page - 1) * pageSize); q.setMaxResults(pageSize);
        List<Product> list = q.list(); session.close(); return list;
    }
    public List<Product> getProductsAbovePrice(double minPrice) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Product> q = session.createQuery("FROM Product WHERE price > :minPrice", Product.class);
        q.setParameter("minPrice", minPrice);
        List<Product> list = q.list(); session.close(); return list;
    }
    public void getAggregates() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Count: " + session.createQuery("SELECT COUNT(p) FROM Product p").uniqueResult());
        System.out.println("Avg: " + session.createQuery("SELECT AVG(p.price) FROM Product p").uniqueResult());
        System.out.println("Max: " + session.createQuery("SELECT MAX(p.price) FROM Product p").uniqueResult());
        System.out.println("Min: " + session.createQuery("SELECT MIN(p.price) FROM Product p").uniqueResult());
        session.close();
    }
}
