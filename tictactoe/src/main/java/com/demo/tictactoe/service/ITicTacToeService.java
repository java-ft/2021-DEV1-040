package com.demo.tictactoe.service;

import com.demo.tictactoe.model.Shape;

public interface ITicTacToeService {

    String addShapeToPosition(Shape shape, String index);

    String showTictactoe();

    String restartTictactoe();

    boolean isTurnOfThisShape(Shape shape);
}
