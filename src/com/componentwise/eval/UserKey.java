/*
 Java Language Assessment-Objective 2
 UserKey Class

 @https://github.com/krazykaigh/JLAObective4/tree/master
 *
 * This class uses serializable and has
 * JavaDoc annotations
 */
package com.componentwise.eval;

import java.io.Serializable;

public class UserKey implements Serializable {
    private String name;
    private String userId;


    /**
     * @param name hashtable key
     * @param userId hashtable value
     */
    public UserKey(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    /**
     * @return - name
     */
    public String getName() {
        return name;
    }

    /**
     * @return - userId
     */
    public String getuserId() {
        return userId;
    }
}