import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Person person;

  @Before
  public void before(){
    busStop = new BusStop();
    person = new Person();
  }

  @Test
  public void busStopStartsWithNoQueue(){
    assertEquals(0, busStop.countQueue());
  }

  @Test
  public void newCommuterIncrementsQueue(){
    busStop.newCommuter(person);
    assertEquals(1, busStop.countQueue());
  }

  @Test
  public void queueFullWhenTwelveCommuters(){
    for (int i = 0; i < 12; i++){
      busStop.newCommuter(person);
    }
    assertEquals(true, busStop.isQueueFull());
  }

  @Test
  public void newCommuterStopsIncrementingQueueWhenFull(){
    for (int i = 0; i < 20; i++){
      busStop.newCommuter(person);
    }
    assertEquals(12, busStop.countQueue());
  }

  @Test
  public void clearQueueClearsAllCommuters(){
    busStop.newCommuter(person);
    busStop.clearQueue();
    assertEquals(0, busStop.countQueue());
  }


}