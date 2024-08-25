
public class ForTypeLoops {
    public static void main(String[] args) {
        System.out.println("welcome to learn for type loops");
        String[] studentsName = new String[]{
                "Raja", "Aarav", "Kuldeep", "Vanshika","Reshma", "" +
                "Sonu", "Sumit", "Sugandha"
        };
        foreachloop(studentsName);
        forloop();
    }
    public static void foreachloop(String[] studentsName){
        for(String name : studentsName){
            //to use for each loop
            // we should have for(type of reference int,string value to print name, number : Array name)
            System.out.print(name + "  ");
        }
    }
    public static void forloop(){
        for(int i = 0; i <=100; i += 2){ //To use for loop it have syntax :- for (initializer- int i = 0; condition- i<=100; updation - i++)
            System.out.print(i + " ");
        }
    }
}
