import javax.swing.*;

public class Validation {

    /*
    Let's create a simple program that validates
    a user's input.

    Let's say a user must enter a number greater than 10.
     */
    public static void main(String[] args) {
        int validation = Integer.parseInt(JOptionPane.showInputDialog("please enter number greater then ten"));

        if (validation > 10 ){
            JOptionPane.showMessageDialog(null, "You entered a correct number");
        }else{
            JOptionPane.showMessageDialog(null, "WRONG NUMBER");
        }
    }



}
