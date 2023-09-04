package com.company;

//Represents our abstract reusable
//All images are poolable.
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}
