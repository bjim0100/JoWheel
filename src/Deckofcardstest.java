import java.util.Scanner;

    public class Deckofcardstest {
        static Scanner kybd_inpt = new Scanner(System.in);
        static String kybd_inpt_str;
        static String code_trigger_starter_str = "start";
        static String code_trigger_ender_str = "end";

        public static void main(String[] args) {
            System.out.println("Enter start to run the program");
            // 1. we need a trigger to start the code
            kybd_inpt_str = kybd_inpt.nextLine();
            System.out.println("Program has started.Enter your words");
            //The immediate code above triggers the functionality to start
            //Now its ready to accept the users input
            if (kybd_inpt_str.equalsIgnoreCase(code_trigger_starter_str)) {
                re_run_kybd_inpt();
            } else {
                System.out.println("The program has ended");
                System.exit(0);
            }
        }

        private static void re_run_kybd_inpt() {
            while (kybd_inpt_str.equalsIgnoreCase(code_trigger_starter_str)) {
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                System.out.println(userInput);

                if (userInput.equalsIgnoreCase(code_trigger_ender_str)) {
                    // we need a trigger to end the code.
                    kybd_inpt_str = "end";
                    System.out.println("The program has ended");
                    break;
                } else {
                    re_run_kybd_inpt();
                    //The code above puts the whole function into a while loop until
                    //the user types in end
                }
            }
        }
    }
		
		
		