public class recursions
{
   public static void main(String[] args)
   {
      change(75);
      change(42);
      change(1);
      change(5);
      change(93);
      change(17);
   }
   public static void change(int input)
   {
      int[] usa = {25, 10, 5, 1};
      if(input >= usa[0])
         speak(input, usa[0]);
      else if(input >= usa[1])
         speak(input, usa[1]);
      else if(input >= usa[2])
         speak(input, usa[2]);
      else if(input >= usa[3])
         speak(input, usa[3]);
      else if (input == 0)
         System.out.println();
    }
    public static void speak(int input, int country)
    {
      System.out.println(country);
      change(input - country);    
    }  
}