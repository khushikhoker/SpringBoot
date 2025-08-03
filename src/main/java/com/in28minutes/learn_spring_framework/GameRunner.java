package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.MarioGame;

public class GameRunner {
    MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }


    public void run() {
        System.out.println(marioGame.getName() + "is started");
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
