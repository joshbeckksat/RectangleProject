package com.beck.RectangleProject;

public class RectangleTemplate {
int width=0;
int height=0;
	public RectangleTemplate(int x, int y) {
	// TODO Auto-generated constructor stub
		width = x;
		height = y;
}
	public int rectanglearea()
	{
		int area = width * height;
		return area;
	}
	
}
