package com;

public class Runner extends Thread {


    private int cmd[]={2,3,0,1,2, 3,2,1,2,1, 0,2,3,0,3};
    private int ctr=0;
    private int cmdPtr=0;
    private Snake snake;
    public Runner(Snake snake){
        this.snake=snake;
    }

    @Override
    public void run(){
        while(true){
            ctr++;
            if(ctr>10){
                ctr=0;

                switch (cmd[cmdPtr]){
                    case 0:
                        snake.up();
                        break;
                    case 1:
                        snake.right();
                        break;
                    case 2:
                        snake.down();
                        break;
                    case 3:
                        snake.left();
                        break;
                    default:
                        break;
                }
                cmdPtr++;
                if(cmdPtr>=15){
                    cmdPtr=0;
                }


            }
            snake.stepForward();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
