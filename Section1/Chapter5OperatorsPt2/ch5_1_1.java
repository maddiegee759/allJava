public class ch5_1_1 {
    public static void main(String[] args) {
        // Initial status conditions - don't modify these!
        boolean hasShield = true;
        boolean hasWeapon = true;
        boolean isInjured = false;
        boolean hasPotion = false;
        
        // Create your boolean conditions below
        boolean canFight = hasWeapon && !isInjured;
        boolean needsHealing = isInjured || !hasShield;
        boolean isVulnerable = !(hasShield || !hasWeapon);
        boolean shouldUsePotion = hasPotion && isInjured;
        boolean isReadyForBattle = hasWeapon && hasShield && !isInjured;
        
        // Don't modify the code below
        System.out.println("Character Status Check:");
        System.out.println("---------------------");
        System.out.println("Can Fight: " + canFight);
        System.out.println("Needs Healing: " + needsHealing);
        System.out.println("Is Vulnerable: " + isVulnerable);
        System.out.println("Should Use Potion: " + shouldUsePotion);
        System.out.println("Ready for Battle: " + isReadyForBattle);
    }
}
