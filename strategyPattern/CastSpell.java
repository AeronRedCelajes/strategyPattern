package strategyPattern;

public class CastSpell implements AtkStrategy {
    @Override
    public String atk() {
        return "casts a spell!";
    }
}
