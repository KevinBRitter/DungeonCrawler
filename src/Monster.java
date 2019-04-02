public class Monster
{

    String strName;
    int intHealth, intAtkPower, intWeapon, intArmor, intLevel, intEXP, intSetLevel;


    public Monster(String name_, int health_, int atkPower_, int weapon_, int armor_, int level_, int exp_)
    {
    this.strName = name_;
    this.intHealth = health_;
    this.intAtkPower = atkPower_;
    this.intWeapon = weapon_;
    this.intArmor = armor_;
    this.intEXP = exp_;
    }

    public Monster()
    {
    this("Potted Plant", 10, 1, 0, 0, 1, 100);
    }

    public String MonsterName()
    {
        return strName;
    }

    public int MonsterHealth()
    {
        return intHealth;
    }

    public int AtkPower()
    {
        return intAtkPower;
    }

    public int WeaponDamage()
    {
        return intWeapon;
    }

    public int AmtArmor()
    {
        return intArmor;
    }

    public int getLevel()
    {
        return intLevel;
    }

    public void setLevel(int intSetLevel_)
    {
        this.intLevel = intSetLevel_;
    }

    public void ChangeMonsterHealth(int intHealthChange_)
    {
        this.intHealth += intHealthChange_;
    }

    public void ChangeAtkDamage(int intAtkChange_)
    {
        this.intAtkPower += intAtkChange_;
    }


}