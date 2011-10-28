package com.beck.RectangleProject;

import java.util.Random;

public class RectangleProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random taco = new Random();
		int height = taco.nextInt(101);
		int width = taco.nextInt(101);
		
RectangleTemplate rectangle1 = new RectangleTemplate(width,height);
System.out.println(rectangle1.width);
System.out.println(rectangle1.height);
int area1 = rectangle1.rectanglearea();
System.out.println(area1);



	}

}
