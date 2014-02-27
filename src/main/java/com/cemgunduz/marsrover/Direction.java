package com.cemgunduz.marsrover;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cgunduz on 2/25/14.
 */
public enum Direction {

    // Clockwork
    N(0),E(1),S(2),W(3);

    private int ordinal;

    private Direction(Integer ordinal)
    {
        this.ordinal = ordinal;
    }

    public Direction getDirectionAfterTurn(TurnType turnType)
    {
        int result;
        if(turnType.equals(TurnType.LEFT))
            result = ordinal-1;
        else if(turnType.equals(TurnType.RIGHT))
            result = ordinal+1;
        else
            throw new IllegalArgumentException();

        result = (result == -1) ? 3 : (result == 4) ? 0 : result ;
        return Arrays.asList(Direction.values()).get(result);
    }
}
