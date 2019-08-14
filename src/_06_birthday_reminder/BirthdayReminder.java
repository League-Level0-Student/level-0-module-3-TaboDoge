
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 13th";
		String dadsBirthday = "August 8th";
		String myBirthday = "March 14th";
		String sisBirthday = "October 21st";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String Birthday = JOptionPane.showInputDialog("Who's birthday do you want?(mom's, dad's, sister's, mine");
	System.out.println(Birthday + ":");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
	if(Birthday.equals("mom")) {
		System.out.println(momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	else if (Birthday.equals("dad")) {
		System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
	else if (Birthday.equals("yours")) {
		System.out.println(myBirthday);
		}
	else if(Birthday.equals("sister")) {
		System.out.println(sisBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		System.out.println("Sorry, i don't remember that person's birthday");
	}
	} 
}
