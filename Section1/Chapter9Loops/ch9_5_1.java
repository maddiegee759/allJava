public class ch9_5_1 {
    public static void main(String[] args){
        for (int i = 1; i <=20; i++) {
            if (i == 4 || i == 13 || i == 17){
                System.out.println("Skipping unlucky number: " + i);
            }
            else {
                System.out.println("Item #" + i + ": Get this item!");
            }
        }
    }
}
