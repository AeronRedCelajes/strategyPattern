package strategyPattern;

public class ShootArrow implements AtkStrat{
    @Override
    public String atk() {
        return "shoots an arrow!";
    }
}
