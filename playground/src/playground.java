import java.util.*;
public class playground {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of the bill: ");
        String value = input.nextLine();
        double billAmount = Double.parseDouble(value);

        System.out.print("Please enter the amount tendered: ");
        value = input.nextLine();
        double tenderedAmount = Double.parseDouble(value);

        double changeDue = tenderedAmount - billAmount;

        System.out.println("The change required is " + changeDue);

    }


}