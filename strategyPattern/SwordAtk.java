package strategyPattern;

public class SwordAtk implements AtkStrat{
    @Override
    public String atk() {
        return "attacks with a sword!";
    }
}
