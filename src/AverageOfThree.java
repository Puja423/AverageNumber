import java.util.*;
//import java.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {

       // AverageofThreeNumber(int first_num,int sec_num,int third_num,int sum);
        AverageofThreeNumber();
    }
    public static void AverageofThreeNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Tell me Your first Number");
        int first_num= sc.nextInt();
        System.out.println("Tell me your Second Number");
        int sec_num=sc.nextInt();
        System.out.println("Tell me your Third Number");
        int third_num=sc.nextInt();
        int sum =(first_num+sec_num+third_num)/3;
        System.out.println("Average of three Number  "+sum);

    }

}
