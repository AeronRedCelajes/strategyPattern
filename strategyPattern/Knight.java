package strategyPattern;

public class Knight implements CharacterClass {
    SwordAtk swordAtk = new SwordAtk();
    ShieldDef shieldDef = new ShieldDef();
    Dodge dodge = new Dodge();
    MagicBarrier magicBarrier = new MagicBarrier();

    @Override
    public String characterAtk() {
        return "Knight " + swordAtk.atk();
    }

    @Override
    public String characterDef() {
        return shieldDef.def() + "\n" + dodge.def() + "\n" + magicBarrier.def();
    }
}
