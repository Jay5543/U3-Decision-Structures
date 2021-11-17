import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddORMultiply {


    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the second number"));
        double answer = 0;

        if (num1 > num2){
            answer = x(num1, num2);
        }
        if (num1 <= num2){
            answer = add(num1, num2);
        }
        JOptionPane.showMessageDialog(null, answer);
    }
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double x (double num1, double num2){
        return num1 * num2;
    }
}
