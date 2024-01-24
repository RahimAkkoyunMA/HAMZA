 import java.lang.reflect.Array;
import java.util.Arrays;

 

 public class codewars {
  public static void main(String[] args) 
  {
    // int[] test = new int[]{78,56,232,12,11,43};
    // Arrays.sort(test);
    // System.out.println(test[0]);
  }
    //    /*
    //       * Create a function which answers the question "Are you playing banjo?".
    //      If your name starts with the letter "R" or lower case "r", you are playing banjo!

    //      The function takes a name as its only argument, and returns one of the following strings:

    //      name + " plays banjo" 
    //      name + " does not play banjo"
    //      Names given are always valid strings.
    //       */
    //      public String areYouPlayingBanjo(String name)
    //     {
    //          if(name.toUpperCase().startsWith("R"))
    //          {
    //              return name +" plays banjo";
    //          }
    //          else return name + " does not play banjo";            
    //      }  
         
    //      public static int findSmallestInt(int[] args)
    //       {
    //         int speicher;
    //       int speicherZwei;
    //       for(int zaehler = 0; zaehler > args.length; zaehler++)
    //       {
    //             if(args[zaehler]>args[zaehler++])
    //       {
    //                 speicher = args[zaehler++];
    //       }
    //             else speicher = args[zaehler];
    //       if (speicher > speicherZwei) 
    //       {

    //             } else speicherZwei = speicher;
    //       }
    //         return speicherZwei;
    //       }
         
    //      public static int findSmallestInt(int[] args)
    //      {
    //          int speicher = args[0];
    //          for(int i = 1; i < args.length; i++)
    //          {
    //            if(speicher > args[i])
    //              {
    //                  speicher = args[i];
    //              }
    //          }
    //          return speicher;
    //      }

    //      public static void main(String[] args) {
        
    // int[] test = new int[]{78,56,232,12,11,43};
    // Arrays.sort(test);
    // System.out.println(test[0]);
    // }
    // public class Kata {
       
    //     public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    //            int menge = classPoints.length;
    //       int vergleich = 0;
    //       int i = 0;
    //       for(;i > menge; i++);
    //            {
    //             vergleich = vergleich + classPoints[i];
    //             System.out.println(i);
    //            }
    //            int durchschnitt = vergleich/menge++;
    //            if (durchschnitt<yourPoints) 
    //            {
    //             return true;
               
    //            }
    //             else return false;
    //     }
    //   }

    public static String boolToWord(boolean b) {
     
      if (b == true) {
        return "Yes";
      }
      else return "No";
    }

    public class ThirdAngle {

      public static int otherAngle(int angle1, int angle2) {
          return 180 - (angle1 + angle2);
      }
    }
}
