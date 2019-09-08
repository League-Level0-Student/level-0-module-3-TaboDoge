package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
private static final int Color = 0;
public static void main(String[] args) {
	for (int i = 0; i < 100; i ++) {
	String shape = JOptionPane.showInputDialog("What shape do you want: Square, Triangle or circle?");
	//shapes
	if (shape.equals("square")) {
		drawSquare();
	}
	else if (shape.equals("triangle")) {
		drawTriangle();
	}
	else{
		drawCircle();
	}
	}
}
static void drawSquare(){
	Robot square = new Robot();
	String color = JOptionPane.showInputDialog("What color: red, blue or black?");
	// colors section
		Color red = new Color(255, 0, 0);
		Color blue = new Color(20 , 0, 255);
		Color black = new Color(0, 0, 5);
		if (color.equals("red")) {
			square.setPenColor(red);
		}
		else if (color.equals("blue")) {
			square.setPenColor(blue);
		}
		else {
			square.setPenColor(black);
		}
	square.setSpeed(100);
	square.move(-300);
	square.penDown();
square.move(200);
square.turn(90);
square.move(200);
square.turn(90);
square.move(200);
square.turn(90);
square.move(200);
square.turn(90);
square.penUp();
square.move(800);
}
static void drawTriangle() {
	Robot triangle = new Robot();
	String color = JOptionPane.showInputDialog("What color: red, blue or black?");
	// colors section
		Color red = new Color(255, 0, 0);
		Color blue = new Color(20 , 0, 255);
		Color black = new Color(0, 0, 5);
		if (color.equals("red")) {
			triangle.setPenColor(red);
		}
		else if (color.equals("blue")) {
			triangle.setPenColor(blue);
		}
		else {
			triangle.setPenColor(black);
		}
	triangle.setSpeed(100);
	triangle.turn(270);
	triangle.move(300);
	triangle.penDown();

	for(int i = 0; i < 3; i++) {
	triangle.turn(120);
	triangle.move(200);
	}
	triangle.penUp();
	triangle.move(600);
}
static void drawCircle() {
	Robot circle = new Robot();
	circle.setSpeed(1000);
	String color = JOptionPane.showInputDialog("What color: red, blue or black?");
	// colors section
		Color red = new Color(255, 0, 0);
		Color blue = new Color(20 , 0, 255);
		Color black = new Color(0, 0, 5);
		if (color.equals("red")) {
			circle.setPenColor(red);
		}
		else if (color.equals("blue")) {
			circle.setPenColor(blue);
		}
		else {
			circle.setPenColor(black);
		}
		
	circle.move(90);
	circle.penDown();
	
	for(int y = 0; y < 180; y++) {
	circle.turn(2);
	circle.move(3);
	
	}
	circle.penUp();
	circle.move(600);
}
}

