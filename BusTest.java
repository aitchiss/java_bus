import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;

  @Before
  public void before(){
    bus = new Bus(44);
  }

  @Test
  public void busHasRouteNumber(){
    assertEquals(44, bus.getRouteNumber());
  }



}