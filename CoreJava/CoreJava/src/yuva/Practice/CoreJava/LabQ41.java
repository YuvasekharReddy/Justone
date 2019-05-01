// Perfect Number
package yuva.Practice.CoreJava;
import java.util.Scanner;
class LabQ41 {
    public static void main(String[] args) {

        // take numbers from user
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        for ( int i = 1;  i <= num/2 ; i ++) {
          if ( num % i == 0 ) {
               sum += i;
          }
        }
        if ( sum == num)
              System.out.println("Perfect Number");
        else
              System.out.println("Not Perfect Number");
    }
}