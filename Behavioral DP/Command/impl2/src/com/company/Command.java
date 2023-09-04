package com.company;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void saveBackup() {
        this.backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
