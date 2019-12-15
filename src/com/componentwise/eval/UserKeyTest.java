package com.componentwise.eval;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;


public class UserKeyTest1 {

    private UserKey someUserKey;


    @Before
    public void setUp() {
        someUserKey = new UserKey("me", "MOI");
    }

    @Test
    public void testGetName() {
        System.out.println("Inside testGetName()");
        Assert.assertEquals("me", someUserKey.getName());
    }

    @Test
    public void testGetUserId() {
        System.out.println("Inside testGetUserId()");
        Assert.assertEquals("MOI", someUserKey.getuserId());
    }

    @Test
    public void testSeriai2Deserial(){
        System.out.println("Inside testSerialization()");

        /**
         * This class is a test of the
         * Serialization and Deserialization
         * of the UserKey Object.
         *
         * JUnit tests did not properly run this test.
         */

        String filename = "file.ser";

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(someUserKey);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        UserKey object1 = null;
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (UserKey) in.readObject();

            in.close();
            file.close();

            System.out.println("UserKeyTest has been deserialized ");
            System.out.println("UserKey.getName() = " + object1.getName());
            System.out.println("UserKey.getId() = " + object1.getuserId());

            Assert.assertEquals(someUserKey.getName(), object1.getName());
            Assert.assertEquals(someUserKey.getuserId(), object1.getuserId());

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }

}