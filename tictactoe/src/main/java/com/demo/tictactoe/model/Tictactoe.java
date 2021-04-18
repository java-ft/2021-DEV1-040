package com.demo.tictactoe.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tictactoe {

    Shape table[] = new Shape[9];
    Logger logger = Logger.getLogger(Tictactoe.class.getName());

    public Tictactoe() {

    }
    
    public Shape[] getTable(){
        return table;
    }

    public boolean addShape(Shape shape, int index){
        if(0 <= index && index < 9 && table[index] == null) {
            table[index] = shape;
            return true;
        } else {
            logger.log(Level.WARNING, "Couldn't add shape to tictactoe at index : " + index);
            return false;
        }
    }

    public boolean removeShape(int index){
        if(0 <= index && index < 9) {
            table[index] = null;
            return true;
        } else {
            logger.log(Level.WARNING, "Couldn't remove shape to tictactoe at index : " + index);
            return false;
        }
    }

    public void removeAllShapes(){
        for(int i = 0 ; i < table.length ; i++){
            removeShape(i);
        }
    }
    
    public boolean checkFullTable(){
        for(Shape index: table){
            if(index == null)
                return false;
        }
        return true;
    }

    public boolean checkForWinner(){
        for(int i = 0; i < table.length; i++){
            if(table[i] != null) {
                if(checkWinnerInRow(i) || checkWinnerInColumn(i) || checkWinnerInDiagonal(i))
                    return true;
            }
        }

        return false;
    }

    public boolean checkWinnerInRow(int index){
        if(index < 7 && table[index].equals(table[index+1]) && table[index].equals(table[index+2])){
            return true;
        }
        return false;
    }

    public boolean checkWinnerInColumn(int index){
        if(index < 3 && table[index].equals(table[index+3]) && table[index].equals(table[index+6])){
            return true;
        }
        return false;
    }

    public boolean checkWinnerInDiagonal(int index){
        if(index == 0 && table[index].equals(table[index+4]) && table[index].equals(table[index+8])){
            return true;
        } else if(index == 2 && table[index].equals(table[index+4]) && table[index].equals(table[index+6])){
            return true;
        }
        return false;
    }

    public String getEndOfGameMessage(Shape shape){
        if(shape instanceof Circle){
            return "O won!";
        } else if(shape instanceof Cross){
            return "X won!";
        }
        return "Nobody won";
    }
}
