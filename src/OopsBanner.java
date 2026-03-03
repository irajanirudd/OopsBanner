public class OopsBanner {

    // Main method to run the banner display
    public static void main(String[] args) {

        // String array holding OOPS banner lines
        String[] banner = {
                "  ***     ***     *****    **** ",
                " *   *   *   *    *   *    *    ",
                " *   *   *   *    *   *     *** ",
                " *   *   *   *    *****        *",
                " *   *   *   *    *        *   *",
                " *   *   *   *    *        *   *",
                "  ***     ***     *         *** "
        };

        // Loop through array and print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}