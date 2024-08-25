import java.util.Scanner;

public class IfelseUse {
    public static void main(String[] args) {
        System.out.println("if else statement understanding java program");
        boolean ismale = false;
        String name = "Santhosh" ;
        if (ismale){
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        boolean isSeniorCitizen = true;
        boolean isAdult = false;
        if (isSeniorCitizen){
            System.out.println("He is a senior citizen");
        } else if (isAdult) {
            System.out.println("He is adult citizen");
        } else {
            System.out.println("He is child");
        }
    }
}
