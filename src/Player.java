public class Player extends Monster {
    String strName;
    int intHealth, intAtkPower, intWeapon, intArmor, intLevel, intEXP, intSetLevel, intEXPTarget;


    public Player(String name_)
    {
        super(name_);

    }
    public int EXPTarget() {intEXPTarget = intLevel * 100; return intEXPTarget; }

    public void PlayerLevelUp()
    {
        if(intEXP >= intEXPTarget) {
            intMaxHealth += 10;
            intAtkPower += 1;
            intLevel += 1;
            intEXP = intEXP - intEXPTarget;
            EXPTarget();
            intCurrentHealth = intMaxHealth;
        }
    }
}
