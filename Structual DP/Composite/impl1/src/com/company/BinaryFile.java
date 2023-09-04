package com.company;

//Leaf node in composite pattern
public class BinaryFile extends File {
    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(this.getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support add operations");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesn't support get operations");

    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node doesn't support remove operations");
    }
}
