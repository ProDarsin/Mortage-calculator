import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR=12;
        final  int PERCENT=100;
        int principal= 0;
        float monthlyInterest=0;
        int numberOfPayement=0;
        Scanner scanners= new Scanner(System.in);

        while(true){
            System.out.print("principal($1k-$1M):");
            principal= scanners.nextInt();
            if (principal >=1000 && principal <=1_000_000){
                break;
            }
            System.out.println("please enter value between 1k and 1M");

        }
        while (true){
            System.out.print("Annual Interest Rate:");
            float annualInterest= scanners.nextFloat();
            if (annualInterest >=1 && annualInterest<=30){
                 monthlyInterest= annualInterest/PERCENT/MONTHS_IN_YEAR;
                 break;
            }
            System.out.println("please enter value between 1 and 30");
        }
       while(true){
           System.out.print("Period(year):");
           byte year= scanners.nextByte();
           if(year >=1 && year <=30){
               numberOfPayement= year * MONTHS_IN_YEAR;
               break;
           }
           System.out.println("please enter value between 1 and 30");
       }

        double mortage= principal*(monthlyInterest* Math.pow(1+monthlyInterest,numberOfPayement))/(Math.pow(1+monthlyInterest,numberOfPayement)-1);
        String mortageFormated= NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("mortage:"+ mortageFormated);
        }
    }
