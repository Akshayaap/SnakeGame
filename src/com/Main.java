package com;

public class Main {

    public static void main(String[] args) {
        Snake snake=new Snake(7);
        Runner runner=new Runner(snake);
        runner.start();
    }
}
