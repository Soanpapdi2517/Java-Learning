import java.util.Scanner;

public class LineMaker {
    public static void main(String[] args) {
        System.out.println("Welcome to word maker using array String");
        String[] lineOfWords = new String[]{"We ", "are ","learning ", "java ", "which ", "i ",
                "like ", "so ", "much ","thank ", "you ", "for ", "making ", "me ", "understand."
        };
        StringBuilder linemaker = new StringBuilder();
        for (String words : lineOfWords){
            linemaker.append(words);
        }
        System.out.println(linemaker);
    }
}
