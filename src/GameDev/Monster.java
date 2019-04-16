package GameDev;

import java.util.Random;

public abstract class Monster
{
    // Attribute Declarations
    String strName;
    int intCurrentHealth, intMaxHealth, intAttackPower, intLevel, intEXP, intCurrentLevel, intArmor;
    boolean isDead = false;
    Random randNum;

    public Monster(String name_)
    {
    this.strName = name_;
    }

    public Monster()
    {
    this("Potted Plant");
    }

    abstract String MonsterName();
    abstract int MaxHealth();
    abstract int CurrentHealth();
    abstract int AttackPower();
    abstract int GetLevel();
    abstract void SetLevel(int level_);
    abstract void TakeDamage(int damage_);
    abstract int GetEXP();
    abstract void RaiseEXP(int mobEXP_);

//    public void ChangeMonsterHealth(int intHealthChange_)
//    {
//        this.intCurrentHealth += intHealthChange_;
//    }
//
//    public void ChangeAttackDamage(int intAttackChange_)
//    {
//        this.intAttackPower += intAttackChange_;
//    }


}