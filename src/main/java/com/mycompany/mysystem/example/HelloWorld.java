/*
 * $Id: HelloWorld.java 739661 2009-02-01 00:06:00Z davenewton $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.mycompany.mysystem.example;

//import org.hibernate.Session;


////import com.mycompany.mysystem.example.model.Student;
//import com.mycompany.mysystem.example.utils.HibernateUtil;

/**
 * <code>Set welcome message.</code>
 */
public class HelloWorld extends ExampleSupport {

    public String execute() throws Exception {
      /*  Session session = HibernateUtil.getSessionFactory().openSession();
    	//
    	        session.beginTransaction();
    	        Student student = new Student();
    	//
    	        student.setStudentId(1);
    	        student.setStudentName("JavaFun");
    	        student.setStudentAge("19");
    	//
    	        session.save(student);
    	        session.getTransaction().commit();
//    	        System.out.println("Great! Student was saved");
    	        */
        setMessage(getText(MESSAGE));
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "HelloWorld.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
