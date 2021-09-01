import java.util.Random;

public class Start {
    public static void main (String [] args) {
        int [] drops = new int [1000];
        int [] stat = new int[21];
        Random d20 = new Random();
        Person player1 = new Person(1,0,2,0,1,1,0,1);
        Person player2 = new Person(1,2,2,0,1,2,0,3);
        System.out.println("Test");
        for (int i = 0; i < 21; i++) {
            stat[i] = 0;
        }

        for (int i = 0; i < 1000; i++)
        {
            drops[i] = d20.nextInt(20) + 1;
            stat [drops[i]]++;
            System.out.println(drops[i]);
        }
        System.out.println("Here we have some statistic :");
        for (int i = 1; i < 21; i++) {
            System.out.println("Result " + i + " is : " + stat[i]);
        }
    }
}
