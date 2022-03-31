package com;
import java.util.Random;

public class Direction extends Thread {

    private Snake snake;                         

    public Direction(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            try {
                Thread.sleep(rand.nextInt(10)*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int dir = rand.nextInt(4);

            switch(dir){
                case 0: this.snake.up(); break;
                case 1: this.snake.left(); break;
                case 2: this.snake.down(); break;
                case 3: this.snake.right() break;
                default:;break;
            }
        }
    }
}
