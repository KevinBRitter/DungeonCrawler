package GameDev;

public class Human extends Monster {

    public Human(String name_)
    {
        super(name_);
        this.intLevel = 1;
        this.intEXP = 0;
        this.intCurrentHealth = 20;
        this.intMaxHealth = 30;
        this.intAttackPower = 20;
    }
    String MonsterName()
    {
        // Abstract method returns name
        return this.strName;
    }
    int MaxHealth()
    {
        // Abstract method returns max health
        return this.intMaxHealth;
    }
    int CurrentHealth()
    {
        // Abstract method returns current health
        return this.intCurrentHealth;
    }
    int AttackPower()
    {
        // Abstract method returns attack power
        return this.intAttackPower;
    }
    int GetLevel()
    {
        // Abstract method returns current level
        return this.intLevel;
    }
    void SetLevel(int level_)
    {
        // Abstract method sets current level
        this.intLevel = level_;
    }
    void TakeDamage(int damage_)
    {
        // Abstract method reduces health by damage number
        this.intCurrentHealth -= damage_;
        // If health drops to zero then death occurs
        if(this.intCurrentHealth <= 0)
        {
            this.isDead = true;
        }
    }
    int GetEXP()
    {
        // Abstract method returns experience value of monster
        return this.intEXP;
    }
    void RaiseEXP(int mobEXP)
    {
        // Abstract method increases the total experience points
        this.intEXP += mobEXP;
    }
    void UpdateLvl()
    {
        // Abstract method checks total experience and updates player level
        int tempExp = this.intLevel * 100;
        if(this.intEXP > tempExp)
        {
            this.intLevel++;
        }
    }

//    public int EXPTarget() {intEXPTarget = intLevel * 100; return intEXPTarget; }
//
//    public void PlayerLevelUp()
//    {
//        if(intEXP >= intEXPTarget) {
//            intMaxHealth += 10;
//            intAttackPower += 1;
//            intLevel += 1;
//            intEXP = intEXP - intEXPTarget;
//            EXPTarget();
//            intCurrentHealth = intMaxHealth;
//        }
//    }
}
