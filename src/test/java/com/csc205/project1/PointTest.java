package com.csc205.project1;

/*
I decided to try the extra credit! Here is what I asked GitHub Copilot.

Generate custom unit tests for a Java class called Point that represents a location in the Cartesian plane.
The Point class includes the following methods:
a constructor with x and y coordinates as double arguments
- standard setters of setX(double x), setY(double y) and standard getters of getX(), getY()
- set the coordinates of the point with setPoint(double x, double y)
- shift a point by a given amount along one of the axes with shiftX(double n), shiftY(double n)
- find the distance to point p2 with distance(Point p2)
- rotates the point by a specified (radian) angle around the origin with rotate(double angle)
- toString() method

Include tests for common edge cases.

*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest
{

    @Test
    public void testConstructorAndGetters()
    {
        Point p = new Point(3.0, 4.0);
        assertEquals(3.0, p.getX());
        assertEquals(4.0, p.getY());
    }

    @Test
    public void testNoArgumentConstructor()
    {
        Point p = new Point();
        assertEquals(0.0, p.getX());
        assertEquals(0.0, p.getY());
    }

    @Test
    public void testSetters()
    {
        Point p = new Point();
        p.setX(5.0);
        p.setY(6.0);
        assertEquals(5.0, p.getX());
        assertEquals(6.0, p.getY());
    }

    @Test
    public void testSetPoint()
    {
        Point p = new Point();
        p.setPoint(7.0, 8.0);
        assertEquals(7.0, p.getX());
        assertEquals(8.0, p.getY());
    }

    @Test
    public void testShiftX()
    {
        Point p = new Point(1.0, 2.0);
        p.shiftX(3.0);
        assertEquals(4.0, p.getX());
        assertEquals(2.0, p.getY());
    }

    @Test
    public void testShiftY()
    {
        Point p = new Point(1.0, 2.0);
        p.shiftY(3.0);
        assertEquals(1.0, p.getX());
        assertEquals(5.0, p.getY());
    }

    @Test
    public void testDistance()
    {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);
        assertEquals(5.0, p1.distance(p2));
    }

    @Test
    public void testRotate()
    {
        Point p = new Point(1.0, 0.0);
        p.rotate(Math.PI / 2); // 90 degrees
        assertEquals(0.0, p.getX(), 1e-10);
        assertEquals(1.0, p.getY(), 1e-10);
    }

    @Test
    public void testToString()
    {
        Point p = new Point(1.0, 2.0);
        assertEquals("Point(x=1.0, y=2.0)", p.toString());
    }

    // Edge case tests
    @Test
    public void testNegativeCoordinates()
    {
        Point p = new Point(-1.0, -2.0);
        assertEquals(-1.0, p.getX());
        assertEquals(-2.0, p.getY());
    }

    @Test
    public void testZeroDistance()
    {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(1.0, 1.0);
        assertEquals(0.0, p1.distance(p2));
    }

    @Test
    public void testRotateFullCircle()
    {
        Point p = new Point(1.0, 0.0);
        p.rotate(2 * Math.PI); // 360 degrees
        assertEquals(1.0, p.getX(), 1e-10);
        assertEquals(0.0, p.getY(), 1e-10);
    }
}