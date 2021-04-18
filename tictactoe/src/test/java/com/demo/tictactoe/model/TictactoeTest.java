package com.demo.tictactoe.model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Adding a shape to a tictactoe when there is already a shape")
    public void addShape_whenAlreadyExist(){
        Circle circle = new Circle();
        Cross cross = new Cross();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(circle, 0);
        tictactoe.addShape(cross, 0);

        assertEquals(circle, tictactoe.table[0]);
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

    @Test
    @DisplayName("Check if someone won a tictactoe due to a line")
    public void checkWinnerInRow(){
        Circle circle = new Circle();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(circle, 0);
        tictactoe.addShape(circle, 1);
        tictactoe.addShape(circle, 2);

        assertTrue(tictactoe.checkWinnerInRow(0));
    }

    @Test
    @DisplayName("Check if someone won a tictactoe due to a column")
    public void checkWinnerInColumn(){
        Cross cross = new Cross();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(cross, 0);
        tictactoe.addShape(cross, 3);
        tictactoe.addShape(cross, 6);

        assertTrue(tictactoe.checkWinnerInColumn(0));
    }

    @Test
    @DisplayName("Check if someone won a tictactoe due to a diagonal")
    public void checkWinnerInDiagonal(){
        Circle circle = new Circle();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(circle, 0);
        tictactoe.addShape(circle, 4);
        tictactoe.addShape(circle, 8);

        assertTrue(tictactoe.checkWinnerInDiagonal(0));
    }

    @Test
    @DisplayName("Check if tictactoe is fully completed")
    public void checkFullTable(){
        Circle circle = new Circle();
        Tictactoe tictactoe = new Tictactoe();

        assertFalse(tictactoe.checkFullTable());

        for(int i = 0; i < tictactoe.getTable().length; i++){
            tictactoe.addShape(circle, i);
        }

        assertTrue(tictactoe.checkFullTable());
    }
    
    @Test
    @DisplayName("Check if someone won a tictactoe")
    public void checkForWinner(){
        Circle circle = new Circle();
        Cross cross = new Cross();
        Tictactoe tictactoe = new Tictactoe();

        tictactoe.addShape(circle, 0);
        tictactoe.addShape(cross, 1);
        tictactoe.addShape(cross, 2);
        tictactoe.addShape(circle, 4);
        tictactoe.addShape(circle, 8);

        assertTrue(tictactoe.checkForWinner());
    }
}
