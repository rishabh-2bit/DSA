import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       System.out.println(divideWatermelon(sc.nextInt()));

    }

    public static String divideWatermelon(int num){

        if(num > 2 && num % 2 == 0){
            return "YES";
        }else return "NO";
    }
    
}
