import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {

        if (args.length > 0) {
            
        	switch(args[0]) {
        		case "-h":
        			System.out.println("Help!");
        			break;
        		case "-p":
        			System.out.println("Path");
        			break;
        		case "add":
        			System.out.println("Add");
        			if (args.length == 2) {
        				if (args[1].equals("-r")) {
        				System.out.println(args[1]);
        			} else {
        				System.out.println(args[1] + "does not work with add");
        			}
        			}
        			break;
        		default:
        			System.out.println("Invalid Argument");
        			break;
        	        				
        	}
            	


        } else {
            System.out.println("No Arguments Found!");
        }
    }
}
