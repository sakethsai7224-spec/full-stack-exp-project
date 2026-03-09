package com.inventory.main;
import com.inventory.dao.ProductHQLDAO;
import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(new Product("Laptop", 75000.0, 10, "Gaming Laptop"));
        session.save(new Product("Mouse", 1200.0, 50, "Wireless Mouse"));
        session.save(new Product("Keyboard", 800.0, 30, "Mechanical Keyboard"));
        session.save(new Product("Monitor", 15000.0, 5, "4K Monitor"));
        tx.commit(); session.close();
        ProductHQLDAO dao = new ProductHQLDAO();
        System.out.println("=== Sorted by Price ===");
        dao.getProductsSortedByPrice().forEach(System.out::println);
        System.out.println("\n=== Page 1 (3 records) ===");
        dao.getProductsWithPagination(1, 3).forEach(System.out::println);
        System.out.println("\n=== Price > 500 ===");
        dao.getProductsAbovePrice(500).forEach(System.out::println);
        System.out.println("\n=== Aggregates ===");
        dao.getAggregates();
    }
}
