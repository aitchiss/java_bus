import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;

  @Before
  public void before(){
    busStop = new BusStop();
  }

  @Test
  public void busStopStartsWithNoQueue(){
    assertEquals(0, busStop.countQueue());
  }


}