package org.example.game;

import org.example.player.Enemy;

import java.util.ArrayList;

public class Location {

    public int currentLocation = 1;
    public int currentEnemyNumber = 0;
    ArrayList<Enemy> currentEnemiesList = new ArrayList<>();
    Enemy[] fullEnemiesList = null;
    public int locationSize;

    public void setFullEnemiesList(Enemy[] list) {
        fullEnemiesList = list;
    }

    public ArrayList<Enemy> getEnemiesAtLocation() {
        return currentEnemiesList;
    }

    public void setEnemiesAtLocation(int i) {
        currentEnemiesList = new ArrayList<>();
        Enemy enemy = null;
        locationSize = 1 + (int) (Math.random() * i);
        for (int j = 0; j < locationSize; j++) {
            int k = (int) (Math.random() * 4);
            switch (k) {
                case 0:
                    enemy = fullEnemiesList[0];
                    enemy.setIcon("Baraka.png");
                    break;
                case 1:
                    enemy = fullEnemiesList[1];
                    enemy.setIcon("SubZero.png");
                    break;
                case 2:
                    enemy = fullEnemiesList[2];
                    enemy.setIcon("Liu_Kang.png");
                    break;
                case 3:
                    enemy = fullEnemiesList[3];
                    enemy.setIcon("SonyaBlade.jpg");
                    break;
                default:
                    enemy = null;
                    break;
            }
            currentEnemiesList.add(enemy);
        }
    }

    public void resetLocation(boolean a, int i) {
        if (a) {
            currentLocation += 1 ;
            currentEnemyNumber = 0;
            setEnemiesAtLocation(i);
        }
        else {
            currentLocation = 1;
            currentEnemyNumber = 0;
            setEnemiesAtLocation(0);
        }
    }
    public void newGameLocation(){
        currentLocation=1;
        currentEnemyNumber = 0;
        setEnemiesAtLocation(0);
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public int getCurrentEnemyNumber() {
        return currentEnemyNumber;
    }

    public Enemy getCurrentEnemy() {
        Enemy enemy = null;
        if (currentEnemyNumber != locationSize) {
            currentEnemyNumber += 1;
            return currentEnemiesList.get(currentEnemyNumber - 1);
        } else {
            currentEnemyNumber = 0;
            enemy = fullEnemiesList[4];
            enemy.setIcon("Boss.jpg");
            return enemy;
        }
    }
}

