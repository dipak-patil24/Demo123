/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo1.controller;

import com.mycompany.demo1.entity.Student;
import com.mycompany.demo1.entitymanagerfactory.EntityManagerUtility;
import com.mycompany.demo1.jpacontroller.StudentJpaController;
import javax.persistence.EntityManagerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dipak.P
 */
@Controller
public class WebController {

    EntityManagerFactory emf = EntityManagerUtility.getEntity();

   }
