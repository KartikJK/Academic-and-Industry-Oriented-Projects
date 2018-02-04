import  java.util.Arrays;
import  java.util.List;
/**
   <P>{@code java FindMissingNumInSequence}</P>
 **/
public class FindMissingNumInSequence  {
   public static final void main(String[] ignored)  {
      List<Integer> ascUnqIntList = Arrays.asList(11,12,13,15,17);

      int num = ascUnqIntList.get(0);  //Initialize to the first one
      for(int i : ascUnqIntList)  {
         if(num != i)  {
            System.out.println("First missing number in sequence: " + num);
            break;
         }
         System.out.println(i);
         num++;
      }
   }
}
