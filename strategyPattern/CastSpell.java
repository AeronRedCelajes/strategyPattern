package strategyPattern;

public class CastSpell implements AtkStrat{
    @Override
    public String atk() {
        return "casts a spell!";
    }
}
