package strategyPattern;

public class Dodge implements DefStrat{
    @Override
    public String def() {
        return "Dodgin to avoid attack!";
    }
}
