public class DiceSimulation {

    public int roll(){
        return (int) Math.ceil(Math.random()*6);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to you and see what's your dice number\n");
        DiceSimulation dice = new DiceSimulation();
        for (int i = 0; i < 100; i++) {
            System.out.println(dice.roll());
        }
    }
}
