import java.util.*;

public class pra7 {

   public static String front_times(String str, int n) {
      int len = 3;//we have 3 charactor to repeat 
      if (len > str.length()) {
         len = str.length();//if string is less than 3 then update
      }

      //find substring 
      String sstr = str.substring(0, len);
      StringBuilder resultstr = new StringBuilder();
      for (int i = 0; i < n; i++) {
         resultstr.append(sstr);//add substring
      }

      return resultstr.toString();//return result
   }

   public static void main(String args[]) {
      //Scanner in = new Scanner(System.in);
System.out.println(front_times("Chocolate",2));
System.out.println(front_times("Chocolate",3));
System.out.println(front_times("Abc",3));
      //System.out.println("ENTER STRING : ");
      //String str = in.nextLine();

      //System.out.println("ENTER NUMBER OF TIMES : ");
      //int n = in.nextInt();

      //System.out.println("RESULT STRING : " + front_times(str, n));

      System.out.println("\n23DCS019 Dhyey Dave ");
   }
}
