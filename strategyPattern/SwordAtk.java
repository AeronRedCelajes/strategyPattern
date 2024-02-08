package strategyPattern;

public class SwordAtk implements AtkStrategy {
    @Override
    public String atk() {
        return "attacks with a sword!";
    }
}
