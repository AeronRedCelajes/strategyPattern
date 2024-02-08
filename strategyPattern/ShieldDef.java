package strategyPattern;

public class ShieldDef implements DefStrategy {
    @Override
    public String def() {
        return "Using a shield to defend!";
    }
}
