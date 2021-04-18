package com.demo.tictactoe.controller;


import com.demo.tictactoe.model.Circle;
import com.demo.tictactoe.model.Cross;
import com.demo.tictactoe.model.Shape;
import com.demo.tictactoe.model.Tictactoe;
import com.demo.tictactoe.service.ITicTacToeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.valueOf;

@RestController
public class TictactoeController {

    @Autowired
    private ITicTacToeService ticTacToeService;

    @GetMapping("/")
    public String index(Model model) {
        return "This is a tictactoe game! To start it, use /cross followed by the position!";
    }

    @GetMapping("/cross")
    public String addCrossToPosition (@RequestParam String index) {
        return ticTacToeService.addShapeToPosition(new Cross(), index);
    }

    @GetMapping("/circle")
    public String addCircleToPosition (@RequestParam String index) {
        return ticTacToeService.addShapeToPosition(new Circle(), index);
    }

    @GetMapping("/view")
    public String showView () {
        return ticTacToeService.showTictactoe();
    }

    @GetMapping("/restart")
    public String restartGame (Model model) {
        return ticTacToeService.restartTictactoe();
    }
}
