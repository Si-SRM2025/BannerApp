public class UC3 {
    public static void main(String[] args) {
        // Define the banner lines using String.join for better memory efficiency
        String[] line1 = {" ****", " ****", " ****", " *****"};
        String[] line2 = {"*    *", "*    *", "*    *", "*    "};
        String[] line3 = {"*    *", "*    *", "*    *", "*    "};
        String[] line4 = {"*    *", "*    *", "****", " ****"};
        String[] line5 = {"*    *", "*    *", "*", "    *"};
        String[] line6 = {"*    *", "*    *", "*", "    *"};
        String[] line7 = {" ****", " ****", "*", "*****"};

        // Print each line
        System.out.println(String.join("  ", line1));
        System.out.println(String.join("  ", line2));
        System.out.println(String.join("  ", line3));
        System.out.println(String.join("  ", line4));
        System.out.println(String.join("  ", line5));
        System.out.println(String.join("  ", line6));
        System.out.println(String.join("  ", line7));
    }
}