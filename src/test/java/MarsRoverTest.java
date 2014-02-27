import com.cemgunduz.marsrover.Direction;
import com.cemgunduz.marsrover.MarsRover;
import org.junit.Test;

/**
 * Created by cgunduz on 2/27/14.
 */

// Örnek olarak yaptım çok detayına girmedim
public class MarsRoverTest {

    @Test(expected = IllegalArgumentException.class)
    public void roverOutsideArea()
    {
        MarsRover marsRover = new MarsRover(10,10);
        marsRover.addRover(-1,5, Direction.E);
    }

    @Test(expected = RuntimeException.class)
    public void noCommand()
    {
        MarsRover marsRover = new MarsRover(10,10);
        marsRover.addRover(5,5,Direction.E);
        marsRover.sendCommand(null);
    }
}
