package com.facebook.urctf.bot;

import java.util.*;

import com.facebook.urctf.protocol.*;

public class Bot implements BotInterface {

    Team myTeam;
    Team enemyTeam;
    boolean[][] obstacles;


    @Override
    public Move getMoveForTurn(int numTurn, int reinforcementCount, World world)
    {
        List<Reinforcement> reinforcements = new ArrayList<Reinforcement>();
        List<Action> actions = new ArrayList<Action>();

        if (numTurn == 0)
            init(world);

        //Calculate army sizes for both teams
        int myArmySize = 0;
        int enemyArmySize = 0;
        List<Cell> allCells = world.getAllCells();
        for (Cell c : allCells)
        {
            if (c.getTeam() == enemyTeam)
                enemyArmySize ++;
            if (c.getTeam() == myTeam)
                myArmySize ++;
        }

        //Simple strategy: parachute 1 soldier at an empty tile far from us and the enemy, and expand to all directions.
        //Expand every square equally to cover as much area as possible, leaving 1 unit behind








        return new Move(reinforcements, actions);
    }

    private void init(World world) {
        myTeam = world.getMyTeam();
        enemyTeam = world.getEnemyTeam();
        List<Cell> allCells = world.getAllCells();
        obstacles = new boolean[6][6];
        for (Cell c : allCells)
            if (c.getTerrain() == Terrain.OBSTACLE)
                obstacles[c.x][c.y] = true;
    }
}


