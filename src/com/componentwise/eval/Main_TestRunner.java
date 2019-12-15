/*
  Java Language Assessment - Objective 4
  Test Runner

  @See README.md Question 4
 * @https://github.com/krazykaigh/JLAObective4/tree/master
 */

package com.componentwise.eval;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main_TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(SuiteTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }
}

