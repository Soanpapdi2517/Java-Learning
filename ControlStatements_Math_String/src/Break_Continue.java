public class Break_Continue {
    public static void main(String[] args) {
//        System.out.println("Before the loop");
//        for (int i = 0; i <= 1000; i++){
//            if (i > 101){
//                break; --- breaks the loop and start doing other things which are outside of the loop
//            }
//            System.out.println(i);
//        }
//        System.out.println("Out of the loop");
        System.out.println("Before the loop");
        for (int i = 0; i <= 10; i++){
            if (i == 5 ){
                continue; // ye direct chle jata hai wapas loop ke pass niche ke statement ko execute hone ka mauka ni deta
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");
    }
}
