public class StringTest {
    public static void main(String[] args) {
        StringBuilder stringtest = new StringBuilder();
        stringtest.append("Thinking...");
//        stringtest.insert(5,"CHUP");
        stringtest.delete(0,2);
        stringtest.replace(5,7,"nar");
//        stringtest.replace(9, 10, "Ass");
//        stringtest.deleteCharAt(9);
//        stringtest.deleteCharAt(10);
        System.out.println(stringtest);
    }
}
