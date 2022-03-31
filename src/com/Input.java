package com;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

    private Snake snake;

    public Input(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                snake.up();

                break;
            case KeyEvent.VK_S:
                snake.down();

                break;
            case KeyEvent.VK_A:
                snake.left();

                break;
            case KeyEvent.VK_D:
                snake.right();
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
