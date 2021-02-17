import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

//header for Number class
public class Number {
   //private instance variable (must be an Integer)
   private Integer num; 
   //constructor
   public Number(Integer x) {
     num = x;
   }

   //getter method
   public int getInt() {
     return num;
   }
   //setter method
   public void setInt(Integer x) {
      num = x;
   }
   //method header isPerfect()
   public Boolean isPerfect() {
     //declare empty ArrayList<Integer> divisors
     ArrayList<Integer> divisors = new ArrayList<Integer>();
     //for loop from 2 to this.getInt() (i as control variable)
     for(int i = 2; i <= this.getInt(); i++) {
       //if statement, if the remainder of this.getInt() divided by i equals 0
       if(this.getInt() % i == 0) {
         //add the value of this.get() divided by i to divisors
         divisors.add(this.getInt()/i);
       }
     }
     //declare int total
     int total = 0;
     //for loop from 0 to the size of divisors - 1 (i as control variable)
     for(int i = 0; i<divisors.size(); i++) {
       //add divisors at index i to total
       total += divisors.get(i);
     }
     //if statement, if total is equal to this.getInt()
     if(total == this.getInt()) {
       //return true
       return true;
     }
     //return false
     return false;
   }

   //method header for isOdd()
   public Boolean isOdd() {
     //if statement, if the remainder of this.getInt() divided by 2 is equal to 1
     if(this.getInt() % 2 == 1) {
       //return true
       return true;
     }
     //return false
     return false;
   }



   //toString
   public String toString() {
     return ""+this.getInt();
   }
}