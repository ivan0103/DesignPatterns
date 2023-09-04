package com.company.components;

import com.company.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
