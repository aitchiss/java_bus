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


}