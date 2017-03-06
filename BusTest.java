import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  BusStop busStop;

  @Before
  public void before(){
    bus = new Bus(44);
    person = new Person();
    busStop = new BusStop();
  }

  @Test
  public void busHasRouteNumber(){
    assertEquals(44, bus.getRouteNumber());
  }

  @Test
  public void busStartsWithNoPassengers(){
    assertEquals(0, bus.countPassengers());
  }

  @Test
  public void busAddsPassenger(){
    bus.pickUpPassenger(person);
    assertEquals(1, bus.countPassengers());
  }

  @Test
  public void busFullWhenTenPassengers(){
    for (int i = 0; i < 10; i++){
      bus.pickUpPassenger(person);
    }
    assertEquals(true, bus.isFull());
  }

  @Test
  public void busStopsPickingUpWhenFull(){
    for (int i = 0; i < 15; i++){
      bus.pickUpPassenger(person);
    }
    assertEquals(10, bus.countPassengers());
  }

  @Test
  public void busPicksUpFromBusStop(){
    busStop.newCommuter(person);
    bus.collectFromStop(busStop);
    assertEquals(1, bus.countPassengers());
  }

  public void busPicksUpMultipleCommutersFromStop(){
    for (int i = 0; i < 6; i++){
      busStop.newCommuter(person);
    }
    bus.collectFromStop(busStop);
    assertEquals(6, bus.countPassengers());
  }

}