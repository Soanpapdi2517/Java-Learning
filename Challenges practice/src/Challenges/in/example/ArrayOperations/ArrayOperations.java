package Challenges.in.example.ArrayOperations;

public class ArrayOperations {

    public static int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public static class statistics{
         double mean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum/ numbers.length;
        }
        double median() {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        //swap if jth element is big
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }if (numbers.length % 2 == 0){
                return (double) (numbers[numbers.length/2] + numbers[(numbers.length/2)-1])/2;
            }else {
                return numbers[(numbers.length/2)];
            }
            }
        }

    }
