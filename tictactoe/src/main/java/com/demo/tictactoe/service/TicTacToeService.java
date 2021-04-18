package com.demo.tictactoe.service;

import com.demo.tictactoe.model.Circle;
import com.demo.tictactoe.model.Cross;
import com.demo.tictactoe.model.Shape;
import com.demo.tictactoe.model.Tictactoe;
import org.springframework.stereotype.Service;

import static java.lang.Integer.valueOf;

@Service
public class TicTacToeService implements ITicTacToeService {

    private Tictactoe tictactoe = new Tictactoe();
    // Turn for cross is always even, turn for circle is always odd
    private int turn = 0;
    private boolean gameEnded = false;

    public String addShapeToPosition(Shape shape, String index){
        String response = "";

        if(gameEnded){
            response += "You can't play anymore, game ended.";
        } else {
            if (index == null) {
                response += "You forgot to indicate the position for your " + shape.getModel() + "\n";
            } else if (isTurnOfThisShape(shape) && tictactoe.addShape(shape, valueOf(index))) {
                turn++;
            } else if(!isTurnOfThisShape(shape)){
                response += "It isn't the turn for " + shape.getModel() + "\n";
            } else {
                response += "The selected cell (" + index + ") is already filled";
            }

            response += tictactoe.toString();

            if (tictactoe.checkForWinner()) {
                response = tictactoe.getEndOfGameMessage(shape);
                gameEnded = true;
            }

            if(tictactoe.checkFullTable()){
                response = tictactoe.getEndOfGameMessage(null);
                gameEnded = true;
            }
        }

        return response;
    }



    public boolean isTurnOfThisShape(Shape shape){
        if(shape instanceof Circle && turn%2 == 1){
            return true;
        } else if(shape instanceof Cross && turn%2 == 0){
            return true;
        }
        return false;
    }

    public String showTictactoe(){
        return tictactoe.toString();
    }

    public String restartTictactoe(){
        tictactoe.removeAllShapes();
        turn = 0;
        gameEnded = false;
        return "TicTacToe restarted.\n\n" + showTictactoe() ;
    }
}
