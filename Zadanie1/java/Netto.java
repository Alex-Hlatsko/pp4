import java.util.Scanner;

public class Netto {

    //FUnction to calculate net
    static double calcNet(double gross, double tax){
        return gross/(1+(tax/100));
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter gross");
        double gross = myObj.nextDouble();
        System.out.println("Enter tax");
        double tax = myObj.nextDouble();
        System.out.println("Your Net");
        System.out.println(String.format("%.3f", calcNet(gross, tax)));
    } 
}