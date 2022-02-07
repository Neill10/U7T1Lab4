public class Animations{

    final static String CYAN = "\u001B[36m";//5 (lengths)
    final static String RED = "\u001B[31m";//5
    final static String YELLOW = "\u001B[33m";//5
    final static String WHITE = "\u001B[37m";//5
    final static String BLACK = "\u001B[30m";//5
    final static String BLUE = "\033[0;34m";//7
    final static String BLUE_BRIGHT = "\033[0;94m";//7
    final static String PURPLE = "\033[0;35m";//7
    final static String GREEN = "\u001B[32m";//5

    //no constructors

    /**
     * Prints out a moving "WELCOME TO THE GAME" message that travels from left to right
     *
     */
    public static void welcome() throws InterruptedException
    {//welcome animation
        String h1 = WHITE + "\\          /       |                                                                                                 ";
        String h2 = WHITE + " \\        /   ___  |   ___   ___     _    _     ___   _____   ___   _____         ___   ____    _     _    _    ___  ";
        String h3 = WHITE + "  \\  /\\  /   |___  |  |     |   |   / \\  / \\   |___     |    |   |    |    |___| |___  | ___   / \\   / \\  / \\  |___  ";
        String h4 = WHITE + "   \\/  \\/    |___  |  |___  |___|  /   \\/   \\  |___     |    |___|    |    |   | |___  |____| /---\\ /   \\/   \\ |___  ";

        for (int i = 0; i < 115; i++)
        {
            if (i == 0)
            {
                clearScreen();
                System.out.println(h1);
                System.out.println(h2);
                System.out.println(h3);
                System.out.println(h4);
                Thread.sleep(1000);
            }
            else if (h1.length() >= 10 )
            {
                h1 = h1.substring(0,h1.length()-1);
                h2 = h2.substring(0,h2.length()-1);
                h3 = h3.substring(0,h3.length()-1);
                h4 = h4.substring(0,h4.length()-1);
            }
            else
                System.out.println(h1 =" " + h1);
            System.out.println(h2 =" " + h2);
            System.out.println(h3 =" " + h3);
            System.out.println(h4 =" " + h4);
            Thread.sleep(75);
            clearScreen();
        }
        System.out.flush();
    }

    /**
     * Prints out a moving "THANKS FOR PLAYING" message that travels from left to right.
     *
     */
    public static void ending() throws InterruptedException
    {//thanks for playing animation (moves across the screen and ends at a certain point)
        String h1 = WHITE + "_______                                                                         ";
        String h2 = WHITE + "   |                         __    __  __   __    __               o       ___  ";
        String h3 = WHITE + "   |    |___|  /\\  |\\ | |_/ |__   |__ |  | |__|  |__| |    /\\  \\ / | |\\ | | __  ";
        String h4 = WHITE + "   |    |   | /--\\ | \\| | \\  __|  |   |__| |  \\  |    |__ /--\\  |  | | \\| |___| ";

        for (int i = 0; i < 100; i++)
        {
            if (i == 0)
            {
                clearScreen();
                System.out.println(h1);
                System.out.println(h2);
                System.out.println(h3);
                System.out.println(h4);
                Thread.sleep(1000);
            }
            else if (h1.length() >= 50 )
            {
                h1 = h1.substring(0,h1.length()-1);
                h2 = h2.substring(0,h2.length()-1);
                h3 = h3.substring(0,h3.length()-1);
                h4 = h4.substring(0,h4.length()-1);
            }
            System.out.println(h1 =" " + h1);
            System.out.println(h2 =" " + h2);
            System.out.println(h3 =" " + h3);
            System.out.println(h4 =" " + h4);
            Thread.sleep(75);
            clearScreen();
        }
        System.out.flush();
    }

    /**
     * Prints out a blinking check mark for when user guesses correctly
     *
     */
    public static void correct() throws InterruptedException
    {  //correct animation (blinks)
        String h1 = GREEN + "                         ___ \n";
        String h2 = "                        /  /\n";
        String h3 = "                       /  / \n";
        String h4 = "                      /  / \n";
        String h5 = "                     /  /\n";
        String h6 = "                    /  /  \n";
        String h7 = "          ___      /  /  \n";
        String h8 = "          \\  \\    /  / \n";
        String h9 = "           \\  \\  /  /  \n";
        String h10 = "            \\  \\/  / \n";
        String h11 = "             \\    /   \n";
        String h12 = "              \\__/   \n" + WHITE;

        for (int i = 0; i < 4; i++)
        {
            System.out.println(h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8 + h9 + h10 + h11 + h12);
            Thread.sleep(400);
            clearScreen();
            Thread.sleep(150);

        }
        System.out.flush();

    }

    /**
     * Prints out a blinking X mark for when user guesses incorrectly
     *
     */
    public static void wrong() throws InterruptedException
    {  //wrong animation (blinks)
        String h1 = RED + "          ___        ___\n";
        String h2 = "          \\  \\      /  /\n";
        String h3 = "           \\  \\    /  /\n";
        String h4 = "            \\  \\  /  /\n";
        String h5 = "             \\  \\/  /\n";
        String h6 = "              \\    / \n";
        String h7 = "              /    \\ \n";
        String h8 = "             /  /\\  \\\n";
        String h9 = "            /  /  \\  \\\n";
        String h10 = "           /  /    \\  \\\n";
        String h11 = "          /__/      \\__\\\n"+ WHITE;

        for (int i = 0; i < 4; i++)
        {
            System.out.println(h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8 + h9 + h10 + h11);
            Thread.sleep(400);
            clearScreen();
            Thread.sleep(150);

        }
        System.out.flush();
    }

    /**
     * Prints out a blinking X mark for when user guesses incorrectly
     *
     */
    public static void clearScreen()
    {   //clearing
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    //continents

}