package com.csc205.project1;

/*
I used GitHub Copilot ( I was able to set it up! Thank you!)

What I asked the AI to do:
I wish to create a class named Point code that represents a location in the Cartesian plane.
I want to have the following:
- a constructor with x and y coordinates as double arguments
- standard setters of setX(double x), setY(double y) and standard getters of getX(), getY()
- set the coordinates of the point with setPoint(double x, double y)
- shift a point by a given amount along one of the axes with shiftX(double n), shiftY(double n)
- find the distance to point p2 with distance(Point p2)
- rotates the point by a specified (radian) angle around the origin with rotate(double angle)
 - For rotate(double angle) The formula for rotation is as follows:
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)
- toString method

 */

public class Point
{

    private double x;
    private double y;

    // Default constructor
    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with arguments
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Standard setters
    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // Standard getters
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Shift the point by a given amount along the x-axis
    public void shiftX(double n)
    {
        this.x += n;
    }

    // Shift the point by a given amount along the y-axis
    public void shiftY(double n)
    {
        this.y += n;
    }

    // Find the distance to another point
    public double distance(Point p2)
    {
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    // Rotate the point by a specified (radian) angle around the origin
    public void rotate(double angle)
    {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // toString method
    @Override
    public String toString()
    {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }

}