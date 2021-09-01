import java.util.Random;

public class Person {
    int Str;
    int Perc;
    int End;
    int Cha;
    int Intl;
    int Agl;
    int Wis;
    Skill fight;
    Random d20 = new Random();
    int winContestCounter;

    public Person (int str, int perc, int end, int cha, int intl, int agl, int wis, int fight) {
        this.Str = str;
        this.Perc = perc;
        this.End = end;
        this.Cha = cha;
        this.Intl = intl;
        this.Agl = agl;
        this.Wis = wis;
        this.fight = new Skill(fight, "Swords");
        this.winContestCounter = 0;
    }
}
