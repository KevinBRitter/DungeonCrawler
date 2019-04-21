package GameDev;

public class Encounter
{
    public Encounter()
    {
        // Create a new Encounter instance
    }

    public void Attack(Monster attacker, Monster defender)
    {
        // Attack method takes two entities and evaluates a single
        // attack / defence aggression
        defender.TakeDamage(attacker.AttackPower());
    }

    public boolean CheckHealth(Monster one, Monster two)
    {
        // Return false if either combatant has died
        // Otherwise return true, as in "good to continue"
        if(one.isDead || two.isDead)
        {
            return false;
        }
        else
            return true;
    }
    public void UpdateStatus(Monster player, Monster mob)
    {
        UpdateEXP(player, mob);
        UpdateLvl(player);
    }
    private void UpdateEXP(Monster player, Monster mob)
    {
        // Raises the player experience by the monster's experience value
        player.RaiseEXP(mob.GetEXP());
    }
    private void UpdateLvl(Monster player)
    {
        // Checks if a level update is warranted and implements it
        player.UpdateLvl();
    }

}
