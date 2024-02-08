package strategyPattern;

public class Dodge implements DefStrategy {
    @Override
    public String def() {
        return "Dodgin to avoid attack!";
    }
}
