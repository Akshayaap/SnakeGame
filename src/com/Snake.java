package com;

import java.util.PrimitiveIterator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Snake {

    private int length;
    private JFrame snake[];
    private int X[];
    private int Y[];
    private int dx = 50;
    private int dy = 0;
    private int lastPtr;
    private int firstPtr = 0;
    private int screenWidth;
    private int screenHeight;

    private Input input;

    public Snake(int length) {
        input = new Input(this);
        this.length = length;
        this.snake = new JFrame[length];
        lastPtr = length - 1;
        this.X = new int[length];
        this.Y = new int[length];
        for (int i = 0; i < length; i++) {
            X[i] = i * 100 + 100;
            Y[i] = 100;
            snake[i] = new JFrame(i + " frame");
            snake[i].setVisible(true);
            snake[i].setSize(40, 100);
            snake[i].setResizable(false);
            snake[i].setLocation(X[i], Y[i]);
            snake[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            snake[i].addKeyListener(input);

            // snake[i].setFocusable(true);
            // snake[i].setFocusTraversalKeysEnabled(true);
        }
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.screenWidth = screenSize.width;
        this.screenHeight = screenSize.height;
    }

    public void stepForward() {
        X[lastPtr] = X[firstPtr] + dx;
        Y[lastPtr] = Y[firstPtr] + dy;

        if (X[lastPtr] > this.screenWidth) {
            X[lastPtr] = 0;
        }
        if (X[lastPtr] < 0) {
            X[lastPtr] = this.screenWidth;
        }

        if (Y[lastPtr] < 0) {
            Y[lastPtr] = this.screenHeight;
        }

        if (Y[lastPtr] > this.screenHeight) {
            Y[lastPtr] = 0;
        }
        this.snake[lastPtr].setLocation(X[lastPtr], Y[lastPtr]);

        // this.snake[firstPtr].setSize(40, 100);
        // this.snake[lastPtr].setSize(40,100);
        // this.snake[lastPtr].getContentPane().setBackground(Color.BLUE);
        // this.snake[firstPtr].getContentPane().setBackground(Color.white);

        firstPtr = lastPtr--;

        if (lastPtr < 0) {
            lastPtr = length - 1;
        }

    }

    public void up() {
        dy = -50;
        dx = 0;
    }

    public void down() {
        dy = 50;
        dx = 0;
    }

    public void left() {
        dx = -100;
        dy = 0;
    }

    public void right() {
        dx = 100;
        dy = 0;
    }
}
