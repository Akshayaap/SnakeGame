package com;

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

    public Snake(int length) {
        this.length = length;
        this.snake = new JFrame[length];
        lastPtr = length - 1;
        this.X = new int[length];
        this.Y = new int[length];
        for (int i = 0; i < length; i++) {
            X[i] = i * 50 + 200;
            Y[i] = 100;
            snake[i] = new JFrame(i + " frame");
            snake[i].setVisible(true);
            snake[i].setSize(80, 80);
            snake[i].setResizable(false);
            snake[i].setLocation(X[i], Y[i]);
            snake[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        snake[0].setSize(80, 80);


    }

    public void stepForward() {

        X[lastPtr] = X[firstPtr] + dx;
        Y[lastPtr] = Y[firstPtr] + dy;

        if (X[lastPtr] > 1200) {
            X[lastPtr] = 200;
        }
        if (X[lastPtr] < 200) {
            X[lastPtr] = 1200;
        }

        if (Y[lastPtr] < 100) {
            Y[lastPtr] = 600;
        }

        if (Y[lastPtr] > 600) {
            Y[lastPtr] = 100;
        }
        this.snake[lastPtr].setLocation(X[lastPtr], Y[lastPtr]);
        firstPtr = lastPtr--;

        if (lastPtr < 0) {
            lastPtr = length - 1;
        }


    }

    public void up() {
        dy = 50;
        dx = 0;
    }

    public void down() {
        dy = -50;
        dx = 0;
    }

    public void left() {
        dx = -50;
        dy = 0;
    }

    public void right() {
        dx = 50;
        dy = 0;
    }
}
