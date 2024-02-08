package strategyPattern;

public class Wizard implements CharacterClass {
    CastSpell castSpell = new CastSpell();
    MagicBarrier magicBarrier = new MagicBarrier();

    @Override
    public String characterAtk() {
        return "Wizard " + castSpell.atk();
    }

    @Override
    public String characterDef() {
        return magicBarrier.def();
    }
}
