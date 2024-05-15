package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Siswa siswa1 = new Siswa();
        
        siswa1.setId(1);
        siswa1.setName("Aryo");
        siswa1.setAge(20);
        siswa1.setMajor("IMT");

        session.persist(siswa1);
        

    }
}
