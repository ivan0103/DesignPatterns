package com.company.command;

import com.company.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String step;

    public RemoveStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}
