public class Test {
    public static void main(String[] args) {
        StringBuilder stringLearn = new StringBuilder();
        stringLearn.append("This ");
        stringLearn.append(" learning");
        stringLearn.append(" is ");
        stringLearn.append("important.");
        stringLearn.insert(5,"mean");
        stringLearn.delete(0,5);
        stringLearn.replace(14,16,"is very");
        System.out.println(stringLearn);


    }
}
