<b>Interface Programming Interview Questions</b>
1. What is the output of following program?
```java
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
```
````
Output: 
I can hear the sound.
I can hear the sound.
````
<b>Explanation</b>
As both the interface has defined identical methods, then it is considered as only one method.
