# Large-Scale-Programming---HW3
Phone Directory Assignment (3/5/16)

HOWARD UNIVERSITY
DEPARTMENT OF SYSTEMS AND COMPUTER SCIENCE
SPRING 2016

Large Scale Programming
Phone Directory Assignment – Due: 3/5/16

												

Problem Description

A PhoneDirectory holds a list of names and associated phone numbers. But a phone directory is pretty useless unless the data in the directory can be saved permanently -- that is, in a file. Write a phone directory program that keeps its list of names and phone numbers in a file. The user of the program should be able to look up a name in the directory to find the associated phone number. The user should also be able to make changes to the data in the directory. For simplicity, assume each person can have only (1) phone number.  

In summary, your application should be able to:
1.	Add an entry to the directory
2.	Delete an entry from the directory
3.	Look up a phone number
4.	Change someone’s entry in the phone directory

As a starter, everyone should have a PhoneDirectory class definition with the following behaviors (i.e., methods):
1.	void addEntry(String name, String number)
2.	void deleteEntry(String name)
3.	String getNumber(String name)
4.	void changeEntry(String name, String number)

In addition, your program must read the location of your phone directory file using Java property files.  The property file should be called “phone.properties” and should exist under “src/main/resources” of your eclipse project.  I expect you to research their use, look at examples and incorporate into your code base.  

Once the directory location is obtained via your property file, you will have to figure out how to execute I/O (i.e., read and write files) in Java.  There are plenty of examples on the internet of reading and writing files.

In lieu of developing a user interface for this assignment, a “driver program” is required to test your program.  The classes for your program should be developed under “src/main/java” and your driver program should be created under “src/test/java”.  Note, this will require you to create (2) source folders under your project directory.

This assignment in essence is not difficult but it involves some things that many have not had exposure to yet.  Some of the requirements in this assignment are intentionally vague to inspire questions and communication on the class wiki.  Recommendation is to start early!!

To submit, everyone is to create a Java project in Git and send me a link so that I can pull it into my eclipse project for validation.
