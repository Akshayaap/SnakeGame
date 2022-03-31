package com;

public class Main {

    public static void main(String[] args) {
        int size = 7;

        try {
            if(args[0].equals("auto")){
                Snake snake=new Snake(size);
                Runner runner=new Runner(snake);
                Direction direction=new Direction(snake);
                runner.start();
                direction.start();
            }
        } catch (IndexOutOfBoundsException e) {
                Snake snake=new Snake(size);
                Runner runner=new Runner(snake);
                runner.start();
        }
    }
}
