package com.example.projek;

public class SnakePoints {
    private int positionX; // Removed 'final' to allow modification
    private int positionY; // Removed 'final' to allow modification

    public SnakePoints(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Corrected setter name and logic
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
