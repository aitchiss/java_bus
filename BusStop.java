class BusStop{
  private Person[] queue;

  public BusStop(){
    this.queue = new Person[12];
  }

  public int countQueue(){
    int count = 0;

    for (Person person : queue){
      if (person != null){
        count++;
      }
    }
    return count;
  }

}