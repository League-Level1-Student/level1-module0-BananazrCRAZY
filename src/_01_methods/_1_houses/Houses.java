package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	public void run(String a) {
		// Check the recipe to find out what code to put here
		int x = 120;
		Robot bot = new Robot();
		bot.penDown();
		bot.setSpeed(100);
		bot.setX(100);

		for (int i = 0; i < 9; i++) {
			String h = JOptionPane.showInputDialog("Input s, m, or l.");
			if (h.equalsIgnoreCase("s")) {
				x = 60;
			} else if (h.equalsIgnoreCase("m")) {
				x = 120;
			} else if (h.equalsIgnoreCase("l")) {
				x = 250;
			} else {
				Random ran = new Random();
				x = ran.nextInt(250 - 60);
			}
			
			if (a.equalsIgnoreCase("y")) {
				String rr = JOptionPane.showInputDialog("Input red value.");
				int r = Integer.parseInt(rr);
				String gg = JOptionPane.showInputDialog("Input green value.");
				int g = Integer.parseInt(gg);
				String bb = JOptionPane.showInputDialog("Input blue value.");
				int b = Integer.parseInt(bb);
				bot.setPenColor(r, g, b);
			} else {
				bot.setRandomPenColor();
			}

			String roof = JOptionPane.showInputDialog("Input t or f. Triangle roof or flat roof.");
			if (roof.equalsIgnoreCase("t")) {
				bot.move(x);
				bot.turn(45);
				bot.move(20);
				bot.turn(90);
				bot.move(20);
				bot.turn(45);
				bot.move(x);
			} else if (roof.equalsIgnoreCase("f")) {
				bot.move(x);
				bot.turn(90);
				bot.move(20);
				bot.turn(90);
				bot.move(x);
			} else {
				bot.move(x);
				bot.turn(90);
				bot.move(20);
				bot.turn(90);
				bot.move(x);
			}
			
			bot.setPenColor(Color.GREEN);
			bot.turn(270);
			bot.move(20);
			bot.turn(270);

		}
	}
}
