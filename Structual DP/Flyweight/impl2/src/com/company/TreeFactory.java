package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 Flyweight factory decides whether to re-use existing
 flyweight or to create a new object.
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;

    }
}
