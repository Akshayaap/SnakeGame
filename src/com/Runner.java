package com;
import java.util.Random;

public class Runner extends Thread {

    private Snake snake;
    private boolean auto;                           

    public Runner(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {
        // if(this.auto){
        //     Random rand = new Random();
        //     while (true) {
        //         snake.stepForward();
        //         try {
        //             Thread.sleep(100);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // } else {
            while (true) {
                snake.stepForward();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        // }
    }
}
