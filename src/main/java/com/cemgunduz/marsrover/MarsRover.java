package com.cemgunduz.marsrover;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cgunduz on 2/25/14.
 */
public class MarsRover {

    private int width;
    private int height;

    List<Rover> roverList;

    public MarsRover(int x, int y)
    {
        this.width = x;
        this.height = y;

        roverList = new ArrayList<Rover>();
    }

    public void addRover(int x, int y, Direction direction)
    {
        Rover rover = new Rover(x,y,direction);
        roverList.add(rover);
    }

    public void sendCommand(String commandBatch)
    {
        for(int i = 0; i< commandBatch.length(); i++)
            sendSingleCommand(roverList.get(roverList.size()-1),commandBatch.substring(i,i+1));

    }

    public void getFinalPositions()
    {
        for(Rover r : roverList)
            System.out.println(r);
    }

    private void sendSingleCommand(Rover rover, String s)
    {
        if(s.length() > 1)
            throw new IllegalArgumentException();

        if(s.equals("M"))
            rover.moveRoverForward();
        else if(s.equals("L"))
            rover.turnRover(TurnType.LEFT);
        else if(s.equals("R"))
            rover.turnRover(TurnType.RIGHT);
    }
}
