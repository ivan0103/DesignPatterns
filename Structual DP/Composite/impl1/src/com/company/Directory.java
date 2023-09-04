package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File{
    private List<File> children = new ArrayList<>();

    public Directory(String name, List<File> children) {
        super(name);
        this.children = children;
    }
    public Directory(String name) {
        super(name);
    }
    @Override
    public void ls() {
        System.out.println(this.getName());
        children.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }
}
