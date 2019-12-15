package com.componentwise.eval;

import org.junit.jupiter.api.BeforeEach;

import java.util.Hashtable;

public class UserKeyMain {
    public static void main(String[] args) {
        UserKey b1 = new UserKey("Bill Smith", "BSMITH");
        UserKey b2 = new UserKey("Bill Smith", "BSMITH");
        UserKey b3 = new UserKey("Susan Smith", "SSMITH");
        UserKey b4 = new UserKey(null,null);

        System.out.println( b1.equals(b1) ); // prints true
        System.out.println( b1.equals(b2) ); // prints true
        System.out.println( b1.equals(b3) ); // prints false
        System.out.println( b1.equals(null) ); // prints false
        System.out.println( b1.equals("Some String") ); // prints false
        System.out.println( b4.equals(b1) ); // prints false

        Hashtable ht = new Hashtable();
        ht.put(b2,"Some Data");
        String s = (String) ht.get(b2);
        System.out.println(s.equals("Some Data") ); // prints true

    }

}
