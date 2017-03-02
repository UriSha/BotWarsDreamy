package com.facebook.urctf.bot;

import java.util.*;

import com.facebook.urctf.protocol.*;

public class Bot implements BotInterface {
    @Override
    public Move getMoveForTurn(int numTurn, int reinforcementCount, World world) {
        return new Move();
    }
    public static void main(String[] args){
        System.out.println("hii");
    }
}
