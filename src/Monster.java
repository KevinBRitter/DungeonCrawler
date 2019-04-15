public abstract class Monster
{

    String strName;
    int intCurrentHealth, intMaxHealth, intAtkPower, intLevel, intEXP;


    public Monster(String name_)
    {
    this.strName = name_;
    }

    public Monster()
    {
    this("Potted Plant");
    }

    public String MonsterName()
    {
        return strName;
    }

    public int MaxHealth() {return intMaxHealth; }

    public int CurrentHealth()
    {
        return intCurrentHealth;
    }

    public int AtkPower()
    {
        return intAtkPower;
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
        this.intCurrentHealth += intHealthChange_;
    }

    public void ChangeAtkDamage(int intAtkChange_)
    {
        this.intAtkPower += intAtkChange_;
    }


}