interface Car{
    public void sound();
  }
  interface Bike{
    public void sound();
  }
  class Interface1 implements Car, Bike{
    @Override
    public void sound(){
      System.out.println("I can hear the sound.");
    }
    public static void main(String args[]){
      Interface1 interface1 = new Interface1();
      ((Car) interface1).sound();
      ((Bike) interface1).sound();
    }
  }
