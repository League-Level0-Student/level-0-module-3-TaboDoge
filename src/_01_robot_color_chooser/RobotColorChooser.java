
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
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do  you want to draw with?(red, green, blue, purple)");
		//5. Use an if/else statement to set the pen color that the user requested
		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		 hi.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
			hi.penDown();
			hi.setSpeed(4958698);
			for(int i = 0; i < 4; i++) {
				hi.move(200);
				hi.turn(90);
			}
	}
}