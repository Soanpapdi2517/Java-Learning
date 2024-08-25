package in.Learning.Polymorphism.PassBy;

public class PassbyValue {
    public static void main(String[] args) {
        int  x = 7;
        int y = 8;
        int sum  = add(x, y);
        System.out.printf("x = %d, y = %d, sum = %d", x,  y, sum);
    }
    public  static int add(int a  ,int  b){
//        a and  b are copies of  x,y but in this passbyvalue x, y are not changing exactly when we change a or b
//        for example we took a glass of two exactly same  cup one inn one  we  are filling coffee and  one is empty
        a =  21;
        return a;
    }
}
