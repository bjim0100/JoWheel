import java.util.Scanner;

public class Recap {
	 static Scanner kybd_inpt = new Scanner(System.in);
	   static String kybd_inpt_str;
	   static String code_trigger_starter_str="start";
	   static String code_trigger_ender_str="end";

	    public static void main(String[] args) {
	        re_run_if_wrong();
	    }

	    private static void re_run_if_wrong() {
	        System.out.println("Enter start to run the program");
	        kybd_inpt_str = kybd_inpt.nextLine();
	        // 1. we need a trigger to start the code
	        if (kybd_inpt_str.equalsIgnoreCase(code_trigger_starter_str)) {
	            re_run_kybd_inpt();
	        }else if(kybd_inpt_str.equalsIgnoreCase(code_trigger_ender_str)){
	            System.out.println("The program has ended");
	            System.exit(0);
	        }else{
	            System.out.println("Wrong input, enter start to run the program");
	            re_run_if_wrong();
	        }
	    }


	    private static void re_run_kybd_inpt() {
	        while (kybd_inpt_str.equalsIgnoreCase(code_trigger_starter_str)) {
	            Scanner scanner = new Scanner(System.in);
	            String userInput = scanner.nextLine();
	            System.out.println(userInput);

	            if (userInput.equalsIgnoreCase(code_trigger_ender_str)){
	                kybd_inpt_str = "end";
	                System.out.println("The program has ended");
	                break;
	            }else{
	                re_run_kybd_inpt();
	            }
	        }
	    }
	}
