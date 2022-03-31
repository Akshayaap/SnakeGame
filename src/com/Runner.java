package com;

public class Runner extends Thread {

    private Snake snake;

    public Runner(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {
        while (true) {
            snake.stepForward();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
