/*Q2. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2*/

package com.app.geometry;
import java.util.Scanner;

public class Point2D {
	private double xaxis;
	private double yaxis;
	
	Point2D(){
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
	
	// Method to calculate distance between two points
    public double calculateDistance(Point2D p) {
        double dx = this.xaxis - p.xaxis;
        double dy = this.yaxis - p.yaxis;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}
