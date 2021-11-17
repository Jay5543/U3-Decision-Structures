import javax.swing.*;
import java.text.DecimalFormat;

public class Payroll {

    /*
    This program should calculate an employee's pay
    which includes overtime pay.

    Overtime pay is any hours over 40 gets a wage equal
    to 1.5 times base wage.

    BASE WAGE: 12.50
    OVERTIME WAGE: 18.75

    HOURS WORKED: 50
    HOURS: 40 NORMAl, 10 OVERTIME
    PAY: 40 * 12.50 + 10 * 18.75 = 687.50

    Let's output this in proper currency form.
     */

    public static void main(String[] args) {

        double hours = Double.parseDouble(JOptionPane.showInputDialog("How many hours have you worked"));
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Rate?"));

        if (hours > 40){
            out(overTime(hours, rate));
        }else{
            out(normal(hours, rate));
        }

    }
    public static double normal(double hoursNormal, double wageNormal){
        double normalHours = hoursNormal * wageNormal;
        return normalHours;
    }
    public static double overTime(double hourOverTime, double wageOverTime){
       double overTime = hourOverTime - 40;
        double overTimeHours = overTime * wageOverTime;
       return overTimeHours;
    }
    public static double input(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));

    }
    public static void out(double wage){
        DecimalFormat round = new DecimalFormat("$#,###.00");
        JOptionPane.showMessageDialog(null, "Wage: " + round.format(wage));
    }
}
