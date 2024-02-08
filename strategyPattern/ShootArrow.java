package strategyPattern;

public class ShootArrow implements AtkStrategy {
    @Override
    public String atk() {
        return "shoots an arrow!";
    }
}
