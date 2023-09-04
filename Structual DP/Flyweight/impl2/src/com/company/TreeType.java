package com.company;

import java.awt.*;

/**
The flyweight class contains a portion of the state of a
 tree. These fields store values that are unique for each
 particular tree. For instance, you won't find here the tree
 coordinates. But the texture and colors shared between many
 trees are here. Since this data is usually BIG, you'd waste a
 lot of memory by keeping it in each tree object. Instead, we
 can extract texture, color and other repeating data into a
 separate object which lots of individual tree objects can reference.
*/
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x-1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x-5, y-10, 10, 10);
    }
}
