package strategyPattern;

public class Character {
    private CharacterClass charClass;

    public Character(CharacterClass charClass){
        this.charClass = charClass;
    }

    public String characterAtk(){
        return charClass.characterAtk();
    }

    public String characterDef(){
        return charClass.characterDef();
    }
}
