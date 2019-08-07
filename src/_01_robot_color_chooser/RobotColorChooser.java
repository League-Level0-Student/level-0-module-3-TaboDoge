
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot hi = new Robot();
		String color;
		int i;
		for (int l = 0; l < 4; l++) {
		//3. Ask the user what color they would like the robot to draw
		color = JOptionPane.showInputDialog("What color do  you want to draw with?(red, green, blue)");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
	hi.setPenColor(Color.red);
		}
		else if (color.equals("blue")) {
	hi.setPenColor(Color.blue);
		}
		
		else{
	hi.setPenColor(Color.green);
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		 hi.setPenWidth(20);
	    //2. Make the robot draw a shape (this will take more than one line of code)
			hi.penDown();
			hi.setSpeed(4958698);
			for(i = 0; i < 4; i++) {
				hi.move(200);
				hi.turn(90);
			}
			}
	}
}