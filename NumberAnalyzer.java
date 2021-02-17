//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class NumberAnalyzer
{
	 private ArrayList<Number> list;

	 //write a constructor
   public NumberAnalyzer(int[] arr) {
     list = new ArrayList<Number>();
     for(int i = 0; i<arr.length; i++) {
       Number number = new Number(arr[i]);
       list.add(number);
     }
   }
	 //write count odds
   public int countOdds() {
     int count = 0;
     for(int i = 0; i < list.size(); i++) {
       if(list.get(i).isOdd()) {
         count++;
       }
     }
     return count;
   }
	 //write count evens
   public int countEvens() {
     int count = 0;
     for(int i = 0; i < list.size(); i++) {
       if(!list.get(i).isOdd()) {
         count++;
       }
     }
     return count;
   }
	 //write count perfects
	 public int countPerfects() {
     int count = 0;
     for(int i = 0; i < list.size(); i++) {
       if(list.get(i).isPerfect()) {
         count++;
       }
     }
     return count;
   }
	 //write a toString
   public String toString() {
     return ""+list;
   }
}