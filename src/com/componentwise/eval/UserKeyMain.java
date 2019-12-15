/*
 Java Language Assessment-Objective 2
 UserKeyMain Class

 @https://github.com/krazykaigh/JLAObective4/tree/master

 */

package com.componentwise.eval;

import java.util.Hashtable;

public class UserKeyMain {
    public static void main(String[] args) {
        /*
          Userkey
          @Param String name, String userId
         */
        UserKey b1 = new UserKey("Bill Smith", "BSMITH");
        UserKey b2 = new UserKey("Bill Smith", "BSMITH");
        UserKey b3 = new UserKey("Susan Smith", "SSMITH");
        UserKey b4 = new UserKey(null,null);

        //noinspection EqualsWithItself
        System.out.println( b1.equals(b1) ); // prints true
        System.out.println( b1.equals(b2) ); // prints true
        System.out.println( b1.equals(b3) ); // prints false
        //noinspection ConstantConditions
        System.out.println( b1.equals(null) ); // prints false
        System.out.println( b1.equals("Some String") ); // prints false
        System.out.println( b4.equals(b1) ); // prints false

        @SuppressWarnings("rawtypes") Hashtable<UserKey, String> ht = new Hashtable<>();
        ht.put(b2,"Some Data");
        String s = ht.get(b2);
        System.out.println(s.equals("Some Data") ); // prints true

    }

}
