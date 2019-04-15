public class Goblin extends Monster
{
    //Attributes
    String strName;
    int intCurrentHealth, intMaxHealth, intAttackPower, intArmor, intCurrentLevel, intEXP;
    public Goblin(String name_, int level_) {
        super(name_);
    }
    public Goblin()
    {
        this("Goblin",1);
    }



}
