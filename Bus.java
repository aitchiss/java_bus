class Bus{
  private int routeNumber;
  private Person[] passengers;

  public Bus(int routeNumber){
    this.routeNumber = routeNumber;
    this.passengers = new Person[10];
  }


  public int getRouteNumber(){
    return this.routeNumber;
  }

  public int countPassengers(){
    int count = 0;

    for (Person person : passengers){
      if (person != null){
        count++;
      }
    }
    return count;
  }

  public boolean isFull(){
    return countPassengers() == passengers.length;
  }

  public void pickUpPassenger(Person person){
    if (isFull()){
      return;
    }
    int index = countPassengers();
    passengers[index] = person;
  }

  public void collectFromStop(BusStop busStop){
    Person[] passengersToCollect = busStop.getQueue();
    for (Person person : passengersToCollect){
      pickUpPassenger(person);
    }
    
  }

}