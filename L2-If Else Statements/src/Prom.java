import javax.swing.*;

public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */
    public static void main(String[] args) {
        int money = Integer.parseInt(JOptionPane.showInputDialog("How much money do you have"));
        int grade = Integer.parseInt(JOptionPane.showInputDialog("What is your garde level"));
        int badKid = Integer.parseInt(JOptionPane.showInputDialog("How many referals you have"));

        if (money >= 40){
            if (grade >= 11){
                if (badKid <= 0){
                    JOptionPane.showMessageDialog(null, "Nice yeah sure my guy you can come");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "LMAOOOOOOO you can't go rip *Death skull*");
        }
    }

}
