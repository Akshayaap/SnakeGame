package com;

public class Runner extends Thread {

    private int cmd[] = { 2, 3, 0, 1, 2, 3, 2, 1, 2, 1, 0, 2, 3, 0, 3 };
    private int ctr = 0;
    private int cmdPtr = 0;
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
