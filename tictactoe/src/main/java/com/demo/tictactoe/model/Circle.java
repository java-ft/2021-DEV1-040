package com.demo.tictactoe.model;

public class Circle extends Shape {

    public Circle(){
        super();
    }

    @Override
    public String getModel() {
      return "O";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle))
            return false;

        return true;
    }
}
