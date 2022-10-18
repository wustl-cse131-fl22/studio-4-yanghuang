package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.2,0.2,0.2,0.2);
		///StdDraw.setPenColor(Color.white);
		///StdDraw.filledRectangle(0.1,0.3,0.1,0.1);
		StdDraw.filledRectangle(0.8,0.2,0.2,0.2);
		StdDraw.filledRectangle(0.2,0.8,0.2,0.2);
		StdDraw.filledRectangle(0.8,0.8,0.2,0.2);
		StdDraw.filledRectangle(0.1,0.5,0.1,0.1);
		StdDraw.filledRectangle(0.9,0.5,0.1,0.1);
		StdDraw.filledRectangle(0.5,0.9,0.1,0.1);
		StdDraw.filledRectangle(0.5,0.1,0.1,0.1);
	}
}