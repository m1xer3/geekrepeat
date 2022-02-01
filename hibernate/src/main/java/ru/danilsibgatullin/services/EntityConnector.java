package ru.danilsibgatullin.services;

import org.hibernate.cfg.Configuration;
import javax.persistence.EntityManagerFactory;

public class EntityConnector {

    public static EntityManagerFactory getEmFactory(){
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
