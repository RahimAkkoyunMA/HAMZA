import java.util.Arrays;

public class codewars {

        /*
         * Create a function which answers the question "Are you playing banjo?".
        If your name starts with the letter "R" or lower case "r", you are playing banjo!

        The function takes a name as its only argument, and returns one of the following strings:

        name + " plays banjo" 
        name + " does not play banjo"
        Names given are always valid strings.
         */
        public String areYouPlayingBanjo(String name)
        {
            if(name.toUpperCase().startsWith("R"))
            {
                return name +" plays banjo";
            }
            else return name + " does not play banjo";            
        }

        /*
         * Given an array of integers your solution should find the smallest integer.

        For example:

        Given [34, 15, 88, 2] your solution will return 2
        Given [34, -345, -1, 100] your solution will return -345
        You can assume, for the purpose of this kata, that the supplied array will not be empty.
         */

         /*
         public static int findSmallestInt(int[] args)
         {
            int speicher;
            int speicherZwei;
            for(int zaehler = 0; zaehler > args.length; zaehler++)
            {
                if(args[zaehler]>args[zaehler++])
                {
                    speicher = args[zaehler++];
                }
                else speicher = args[zaehler];
                if (speicher > speicherZwei) 
                {

                } else speicherZwei = speicher;
            }
            return speicherZwei;
         }
         */
        public static int findSmallestInt(int[] args)
        {
            int speicher = args[0];
            for(int i = 1; i < args.length; i++)
            {
                if(speicher > args[i])
                {
                    speicher = args[i];
                }
            }
            return speicher;
        }

    public static void main(String[] args) {

    int[] test = new int[]{78,56,232,12,11,43};
    Arrays.sort(test);
    System.out.println(test[0]);
    }
    
}
