package com;

public class Runner extends Thread {

    private Snake snake;

    public Runner(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {
        int a = 0;
        while (true) {
            a = (a+1)%7;
            snake.stepForward(a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
