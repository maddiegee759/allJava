public class ch5_5_0 {
    public static void main(String[] args) {
        // Initialize variables
        boolean hasLicense = true;
        boolean hasSpace = false;
        boolean hasExperience = true;

        // Calculate conditions
        boolean canSellRegularPet = (hasLicense || hasExperience) && hasSpace;
        boolean canSellExoticPet = hasLicense && hasExperience && hasSpace;
        boolean cannotSellAnyPet = !(hasLicense || hasExperience) || !hasSpace;
        boolean result = canSellRegularPet || canSellExoticPet || cannotSellAnyPet;

        // Don't delete the lines below
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + result);
    }
}
