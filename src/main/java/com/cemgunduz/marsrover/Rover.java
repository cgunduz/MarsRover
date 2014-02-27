package com.cemgunduz.marsrover;

/**
 * Created by cgunduz on 2/25/14.
 */
public class Rover {

    private int x_pos;
    private int y_pos;
    private Direction direction;

    public Rover(int x_pos, int y_pos, Direction direction) {

        if(x_pos < 0 || y_pos < 0)
            throw new IllegalArgumentException();

        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.direction = direction;
    }

    public void moveRoverForward()
    {
        if(direction.equals(Direction.E))
            x_pos++;
        else if(direction.equals(Direction.N))
            y_pos++;
        else if(direction.equals(Direction.W))
            x_pos--;
        else if(direction.equals(Direction.S))
            y_pos--;
    }

    public void turnRover(TurnType turnType)
    {
        direction =  direction.getDirectionAfterTurn(turnType);
    }

    @Override
    public String toString()
    {
        return String.valueOf(x_pos) + " " + String.valueOf(y_pos) + " " + String.valueOf(direction);
    }
}
