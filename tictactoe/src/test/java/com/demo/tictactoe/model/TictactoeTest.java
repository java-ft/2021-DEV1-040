package com.demo.tictactoe.model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TictactoeTest {

    @Test
    @DisplayName("Adding a shape to a tictactoe")
    public void addShape(){
        Shape shape = new Shape();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(shape, 0);

        assertEquals(shape, tictactoe.table[0]);
    }

    @Test
    @DisplayName("Adding a shape to a tictactoe")
    public void addShape_whenAlreadyExist(){
        Shape shape = new Shape();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(shape, 0);

        assertEquals(shape, tictactoe.table[0]);
    }

    @Test
    @DisplayName("Remove a shape from a tictactoe")
    public void removeShape(){
        Shape shape = new Shape();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(shape, 0);
        tictactoe.removeShape(0);

        assertEquals(null, tictactoe.table[0]);
    }

    @Test
    @DisplayName("Remove all shapes from a tictactoe")
    public void removeAllShapes(){
        Shape shape = new Shape();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(shape, 0);
        tictactoe.addShape(shape, 6);
        tictactoe.removeAllShapes();
        
        for(Shape index: tictactoe.table){
            assertEquals(null, index);
        }
    }
}
