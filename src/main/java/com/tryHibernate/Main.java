package com.tryHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Employee employee = new Employee();
//        employee.setE_id(10);
//        employee.setE_name("Alice");
//        employee.setBranch("IT");
//        employee.setSalary(1000);
        employee.setE_id(20);
        employee.setE_name("Bob");
        employee.setBranch("CSE");
        employee.setSalary(43000);

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.tryHibernate.Employee.class);
//        config.configure("hibernate.cfg.xml");
//        SessionFactory factory = config.buildSessionFactory();
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.tryHibernate.Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        //Alien a1= session.byId(Alien.class).getReference (10); // lazy fetching
//
//        Alien a1= session.find(employee.class, o: 10); // eager
//        System.out.println(a1);

        Transaction transaction = session.beginTransaction();
        session.persist(employee);
        transaction.commit();

        session.close();
        factory.close();

    }
}

