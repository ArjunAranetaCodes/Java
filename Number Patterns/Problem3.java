/*
Problem 3: Write a program to print the number pattern of ones and zeros using loop.
01010
01010
01010
01010
01010
*/
public class Problem{
 public static void main(String[] args){
  for(int y = 0; y < 5; y++){
   for(int x = 0; x < 5; x++){
    if(x % 2 == 0){
     System.out.print("0");
    }else{
     System.out.print("1");
    }			
   }
   System.out.print("\n");
  }
 }
}