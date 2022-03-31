package com;

public class Runner extends Thread {

    private Snake snake;
    private boolean auto;                           

    public Runner(Snake snake, boolean m) {
        this.snake = snake;
        this.auto = m;
    }

    @Override
    public void run() {
        if(this.auto){
            
        } else {
            int a = 0;
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
}
