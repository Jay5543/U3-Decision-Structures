import javax.swing.*;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.


    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Whats is the weight"));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("How long is the trip"));

        if (21 >= weight || 100 > distance){
            JOptionPane.showMessageDialog(null, "price is $1.10");
        }
        if (weight >= 21 && 61 > weight || distance >= 100 && 200 > distance){
            JOptionPane.showMessageDialog(null, "price is $2.20");
        }
        if (weight >= 61 && 101 > weight || distance >= 200 && 300 > distance){
            JOptionPane.showMessageDialog(null, "price is $3.70");
        }
        if (weight >= 101 || distance >= 300){
            JOptionPane.showMessageDialog(null, "price is $4.80");
        }
    }*/

    public static void main(String[] args) {
        double iWeight = Double.parseDouble(JOptionPane.showInputDialog("what is weight"));
        int mShip = Integer.parseInt(JOptionPane.showInputDialog("Diststance"));
        double shipCost;
        double cost;

        if (iWeight >= 10){
            shipCost = 4.40;

        }else{
            if (iWeight >=6){
                shipCost = 3.70;
            }else{
                if (iWeight>=2){
                    shipCost= 2.20;
                }else{
                    shipCost = 1.10;
                }
            }
        }

        cost = cost()
    }
    public static double cost (double rate, int miles){
         int costX = miles/100;

         if (costX == 0){
             costX =1;
         }
         return rate * costX;
    }
}



