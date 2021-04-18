package com.demo.tictactoe.model;

public class Tictactoe {

    Shape table[] = new Shape[9];

    public Tictactoe() {

    }

    public void addShape(Shape shape, int index){
        if(0 <= index && index < 9) {
            table[index] = shape;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void removeShape(int index){
        if(0 <= index && index < 9) {
            table[index] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void removeAllShapes(){
        for(int i = 0 ; i < table.length ; i++){
            table[i] = null;
        }
    }

}
