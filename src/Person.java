import java.util.Random;

public class Person {
    int Str;
    int Perc;
    int End;
    int Cha;
    int Intl;
    int Agl;
    int Wil;
    Skill fight;
    int winContestCounter;

    public Person (int str, int perc, int end, int cha, int intl, int agl, int wil, int fight) {
        this.Str = str;
        this.Perc = perc;
        this.End = end;
        this.Cha = cha;
        this.Intl = intl;
        this.Agl = agl;
        this.Wil = wil;
        this.fight = new Skill(fight, "Swords");
        this.winContestCounter = 0;
    }
}
