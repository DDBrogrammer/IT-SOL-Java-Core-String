import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {
          for (int i=100000;i<=999999;i++){
              if(checkReversible(i)){
                  System.out.println(i);

              }          }

    }

    static boolean checkReversible(int number){
        String s_num= String.valueOf(number);
        int size = s_num.length();
        for (int i = 0; i < (size/2); i++) {
            if (s_num.charAt(i) != s_num.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
