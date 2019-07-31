/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo1.entitymanagerfactory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dipak.P
 */
public class EntityManagerUtility {
    
    
      
      
    public static EntityManagerFactory entityManagerFactory;
    public static EntityManagerFactory getEntity() {

        if (entityManagerFactory == null) {
            entityManagerFactory = (EntityManagerFactory) Persistence.createEntityManagerFactory("DEMO_TEST");
        }
        return entityManagerFactory;

    }


}
