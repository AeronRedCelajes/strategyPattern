package strategyPattern;

public class Archer implements CharacterClass {
    ShootArrow shootArrow = new ShootArrow();
    ShieldDef shieldDef = new ShieldDef();

    @Override
    public String characterAtk() {
        return "Archer " + shootArrow.atk();
    }

    @Override
    public String characterDef() {
        return shieldDef.def();
    }
}