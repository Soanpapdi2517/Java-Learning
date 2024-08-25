package in.Equals;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Sonu Yadav", 20, "2517");
        Person person2 = new Person("Sonu Yadav", 20, "1725");

        if (person1.equals(person2)){
            System.out.println("Both Objects are equal");
        }else {
            System.out.println("both Objects are not Judwa");
        }
    }
}
