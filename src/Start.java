import java.util.Random;

public class Start {
    public static void main (String [] args) {
//        int [] drops = new int [1000];
//        int [] stat = new int[21];
//        int dice;

        Dice d20 = new Dice(20);
        Dice d10 = new Dice(10);
        Dice d8 = new Dice(8);
        Dice d6 = new Dice(6);
        int amountDamagemace = 0;
        int amountDamageLight = 0;
        Person player1 = new Person(1,3,2,0,1,2,0,0);
        Person player2 = new Person(1,0,2,0,1,2,0,0);
//        System.out.println("Test");
//        for (int i = 0; i < 21; i++) {
//            stat[i] = 0;
//        }
//
//        for (int i = 0; i < 1000; i++)
//        {
//            drops[i] = d20.nextInt(20) + 1;
//            stat [drops[i]]++;
//        }
//        System.out.println("Here we have some statistic :");
//        for (int i = 1; i < 21; i++) {
//            System.out.println("Result " + i + " is : " + stat[i]);
//        }

        System.out.println("Test 1. ");
        System.out.println("P1 and P2 roll attack|defence versus each other");
        System.out.println("P1 and P2 have equivalent skills and stats");
        System.out.println("Dice : d" + d20.getSide());
        player1.winContestCounter = 0;
        player2.winContestCounter = 0;
        for (int i = 0; i < 1000; i++) {
            int p1Attack = player1.Agl + player1.fight.value + d20.Roll();
            int p1Defence = player1.Perc + player1.fight.value + d20.Roll();
            int p2Attack = player2.Agl + player2.fight.value + d20.Roll();
            int p2Defence = player2.Perc + player2.fight.value + d20.Roll();
            if (p1Attack > p2Defence) player1.winContestCounter++;
            if (p2Attack > p1Defence) player2.winContestCounter++;

        }
        System.out.println("********************************");
        System.out.println("p1 Successful attacks : " + player1.winContestCounter);
        System.out.println("p2 Successful attacks : " + player2.winContestCounter);

        System.out.println("Test 2. ");
        System.out.println("P1 and P2 roll attack|defence versus each other");
        System.out.println("P1 and P2 have equivalent skills and stats");
        System.out.println("Dice : d10");
        player1.winContestCounter = 0;
        player2.winContestCounter = 0;

        for (int i = 0; i < 1000; i++) {
            int p1Attack = player1.Agl + player1.fight.value + d10.Roll();
            int p1Defence = player1.Perc + player1.fight.value + d10.Roll();
            int p2Attack = player2.Agl + player2.fight.value + d10.Roll();
            int p2Defence = player2.Perc + player2.fight.value + d10.Roll();
            if (p1Attack > p2Defence) player1.winContestCounter++;
            if (p2Attack > p1Defence) player2.winContestCounter++;
        }
        System.out.println("********************************");
        System.out.println("p1 Successful attacks : " + player1.winContestCounter);
        System.out.println("p2 Successful attacks : " + player2.winContestCounter);

        System.out.println("Test 3. ");
        System.out.println("P1 and P2 roll attack versus each other");
        System.out.println("Defence calculates like \"take ten\"");
        System.out.println("P1 and P2 have equivalent skills and stats");
        System.out.println("Dice : d20");
        player1.winContestCounter = 0;
        player2.winContestCounter = 0;

        for (int i = 0; i < 1000; i++) {
            int p1Attack = player1.Agl + player1.fight.value + d20.Roll();
            int p1Defence = player1.Perc + player1.fight.value + 10;
            int p2Attack = player2.Agl + player2.fight.value + d20.Roll();
            int p2Defence = player2.Perc + player2.fight.value + 10;
            if (p1Attack > p2Defence) player1.winContestCounter++;
            if (p2Attack > p1Defence) player2.winContestCounter++;
        }
        System.out.println("********************************");
        System.out.println("p1 Successful attacks : " + player1.winContestCounter);
        System.out.println("p2 Successful attacks : " + player2.winContestCounter);

//        System.out.println("Test 4. ");
//        System.out.println("P1 and P2 roll just dice versus each other");
//        System.out.println("P1 and P2 skills and stats did not added");
//        System.out.println("Dice : d20");
//        dice = 20;
//        player1.winContestCounter = 0;
//        player2.winContestCounter = 0;
//        for (int i = 0; i < 1000; i++) {
//            int p1dice =  player1.d20.nextInt(dice) + 1;
//            int p2dice = player2.d20.nextInt(dice) + 1;
//            if (p1dice > p2dice) player1.winContestCounter++;
//            if (p2dice > p1dice) player2.winContestCounter++;
//        }
//        System.out.println("********************************");
//        System.out.println("p1 Successful attacks : " + player1.winContestCounter);
//        System.out.println("p2 Successful attacks : " + player2.winContestCounter);
//        for (int i = 0; i < 1000; i++) {
//            amountDamagemace+= d6.Roll() + 2;
//            amountDamageLight+= d8.Roll() + d8.Roll();
//        }
//        int strmod = 2;
//        int accmod = 3;
//        int ac = 13;
//
//        System.out.println("Total damage by Mace : " + amountDamagemace * (((20.0-ac) + strmod + accmod)/20));
//        System.out.println("Total damage by Light : " + amountDamageLight * (15.0/20));
    }
}
