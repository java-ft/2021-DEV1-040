package com.demo.tictactoe.model;

public class Cross extends Shape {

    private Cross(){
        super();
    }

    @Override
    public String getModel() {
        return "X";
    }
}
