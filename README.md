# JLAObective4
Coding Portion of Interview 

Objective

The following four questions are designed to get a feel for your understanding of the Java programming language, basic object-oriented design, good programming practices, and ability to learn new material. It is oriented towards server-side development. All of your answers must be compatible with the JDK 1.7. This test is graded on technical merit, attention to detail, and style. 

Your responses to the coding questions must be submitted as .java files which can be compiled. All classes must be placed in the com.componentwise.eval package.

Question 1:
Describe how to implement a simple parser that does well-formedness checking on XML, such as the following: 
<BackgroundCheck>
        <CriminalHistory>
                <HistoryCode>x</HistoryCode>
                < HistoryCode>y</HistoryCode>
                < HistoryCode>z</HistoryCode>
        </CriminalHistory>
</BackgroundCheck>

Please note that using a a parser like Xerces is not acceptable.  You can either describe the algorithm, write pseudo code or optionally implement the solution.

Question 2:
Instances of the following class must be placed into the session of a Servlet and used as a key for a Hashtable of other objects. Make the necessary modifications to the UserKey so that it meets the minimal requirements for an object which can be placed into the HttpSession and ensure the test code following the class definition below produces the indicated results. Fully document the revised UserKey class using standard javadoc comments.

public class UserKey {

	private String name;
	private String userid;

	public UserKey(String name, String userid) {
		this.name = name;
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public String getUserID() {
		return userid;
	}
}
	
Test Code (ensure the results are as indicated in the comments):

UserKey b1 = new UserKey(“Bill Smith”, “BSMITH”);
UserKey b2 = new UserKey(“Bill Smith”, “BSMITH”);
UserKey b3 = new UserKey(“Susan Smith”, “SSMITH”);
UserKey b4 = new UserKey(null,null);

System.out.println( b1.equals(b1) );  // prints true
System.out.println( b1.equals(b2) );  // prints true
System.out.println( b1.equals(b3) );  // prints false
System.out.println( b1.equals(null) ); // prints false
System.out.println( b1.equals(“Some String”) ); // prints false
System.out.println( b4.equals(b1) ); // prints false

java.util.Hashtable ht = new java.util.Hashtable();

ht.put(b1,”Some Data”);

String s = (String) ht.get(b2);

System.out.println( s.equals(“Some Data”) );  // prints true

Question 3:
You have been tasked to modify a human resources application. The current Employee class looks like this:

Currently everyone is an Employee and some of those are Managers, which is determined by calling the isManager() method. The company has now started hiring part-time employees, so the system must be modified to keep track of them.
Create a new implementation of the Employee class which provides the flexibility required to support the new part-time employee notion. You are free to refactor this class as required and add additional classes if needed. Describe your rationale for making the changes in the javadoc of the new Employee class. If you create any new classes, include your reasons for creating the class in its javadoc.

Question 4:
When you used the test code in Question 2 above, you probably placed it in the main() method of the same class. A more efficient approach is to make use of a testing framework so the tests are repeatable and can be integrated into a larger test plan. JUnit is our preferred tool for this task. If you are not familiar with JUnit, go to www.junit.org for information and download the library. 

Write a TestCase for the UserKey class. Include a test for each public method in the class, the suite() method, and a main() method which runs the test using the junit.textui.TestRunner. Also test to ensure the UserKey can be safely serialized.

Answer: I did a good deal of research to get the very last part to work, “Also test to ensure the UserKey can be safely serialized.”

	I tried what I found at: https://gist.github.com/Arci/334b2f7d8def772e1b26/revisions but the tests kept failing. After a long look I found another method of “truly” testing if an object is serialized using outputStream vs. byteStream. I was then able to use code I found, modify it and make a test out of it rather than have it as a standalone class with its own main() method. I redesigned it as a test and made the proper assertions after serializing and deserializing the UserKey object. 

	My biggest issue was that I have only become more intimate with creating tests in JUnit over the past 2 years. However, executing and creating are often different, especially when the previously created tests, do not require fixes, or re-coding. 

	I was attempting to use JUnit5 which has its own issues, especially in IntelliJ. I ended up rolling every test back to JUnit4, because of the plethora of information available and even code I could evaluate and re-use.

	My code for Question 4 will be attached to the reply, or it will be available in my personal GitHub Repository
