package com.cemgunduz.marsrover;

/**
 * Created by cgunduz on 2/25/14.
 */
public class App {

    public static void main(String args[])
    {
        MarsRover marsRover = new MarsRover(5,5);

        // Can do it like the way it's done in the example but prefer not to
        marsRover.addRover(1,2,Direction.N);
        marsRover.sendCommand("LMLMLMLMM");
        marsRover.addRover(3, 3, Direction.E);
        marsRover.sendCommand("MMRMMRMRRM");

        marsRover.getFinalPositions();
    }
}
