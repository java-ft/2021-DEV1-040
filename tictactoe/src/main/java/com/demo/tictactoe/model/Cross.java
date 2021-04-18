package com.demo.tictactoe.model;

public class Cross extends Shape {

    public Cross(){
        super();
    }

    @Override
    public String getModel() {
        return "X";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cross))
            return false;

        return true;
    }
}
