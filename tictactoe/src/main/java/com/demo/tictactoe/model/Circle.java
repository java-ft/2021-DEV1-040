package com.demo.tictactoe.model;

public class Circle extends Shape {

    private Circle(){
        super();
    }

    @Override
    public String getModel() {
      return "O";
    }
}
