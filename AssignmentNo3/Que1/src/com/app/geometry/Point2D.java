/*Q1. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following*/

package com.app.geometry;
import java.util.Scanner;
import java.math.*;

public class Point2D {

	private double xaxis;
	private double yaxis;
	
	Scanner sc = new Scanner(System.in);
	
	public Point2D(){
		System.out.println("Inside Parameterless ctor");
	}
	
	public Point2D(double xaxis, double yaxis){
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}
	
	//method to return string form of point's
	public String getDetails() {
		return("Point = ("+xaxis+","+yaxis+")");
	}
	
	public void setXaxis(double xaxis) {
		this.xaxis = xaxis;
	}
	
	public double getXaxis() {
		return xaxis;
	}
	
	public void setYaxis(double yaxis) {
		this.yaxis = yaxis;
	}
	
	public double getYaxis() {
		return yaxis;
	}
	
	public boolean isEqual(Point2D p) {
		return this.xaxis == p.xaxis && this.yaxis == p.yaxis;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Point: ");
		System.out.println("Enter X Co-ordinate: ");
		xaxis = sc.nextInt();
		System.out.println("Enter Y Co-ordinate:");
		yaxis = sc.nextInt();
	}
	
	// Method to calculate distance between two points
    public double calculateDistance(Point2D p) {
        double dx = this.xaxis - p.xaxis;
        double dy = this.yaxis - p.yaxis;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        
    }
}

