package com;

public class Main {

    public static void main(String[] args) {
        int size = 7;

        try {
            if(args[0].equals("auto")){
                Snake snake=new Snake(size);
                Runner runner=new Runner(snake, true);
                runner.start();
            }
        } catch (IndexOutOfBoundsException e) {
                Snake snake=new Snake(size);
                Runner runner=new Runner(snake, false);
                runner.start();
        }
    }
}
