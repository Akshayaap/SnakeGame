package com;

public class Main {

    public static void main(String[] args) {
        int size = 7;

        Snake snake=new Snake(size);
        Runner runner=new Runner(snake);
        runner.start();
    }
}
