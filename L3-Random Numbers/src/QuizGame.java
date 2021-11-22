import javax.swing.*;
import java.util.Random;


public class QuizGame {

    JPanel panel;
    JButton createProblem, checkAnswer;
    JLabel showProblem;
    JTextField answerInput;
    JRadioButton add, sub, x, div;
    ButtonGroup reeee = new ButtonGroup();

    static double userAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {
        new QuizGame();
        //createProblem();
       // getUser();
       // check();
    }
    public QuizGame(){
        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel= new JPanel();

        add = new JRadioButton("+");
        sub = new JRadioButton("-");
        x = new JRadioButton("x");
        div = new JRadioButton("/");
        createProblem = new JButton("New Probelm");
        showProblem = new JLabel("PLACE HOLDER");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("Check anser");

        add.setBounds(100, 50, 200, 25 );
        sub.setBounds(100, 75, 200, 25);
        x.setBounds(100, 100, 200, 25);
        div.setBounds(100, 125, 200, 25);

        reeee.add(add);
        reeee.add(sub);
        reeee.add(x);
        reeee.add(div);

        panel.setLayout(null);
        panel.add(add);
        panel.add(sub);
        panel.add(x);
        panel.add(div);

        frame.add(panel);
        frame.setVisible(true);
    }
    public static void check(){
        if (userAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "nice");
        }
    }
    public static void getUser(){
        userAnswer = input(displayProblem);
    }


    public static void createProblem() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose addition(1), Subtraction(2), Multiplication(3), Division(4)"));


        if(choice >= 1){;
            if(choice<5){
                if(choice ==1){
                    add();
                }
                if (choice == 2){
                    sub();
                }
                if(choice == 3){
                    mult();
                }
                if(choice==4){
                    div();
                }
            }else {System.out.println("Wrong input, restart program, try again");
                System.exit(0);
            }
        }else{
            System.out.println("Wrong input, restart program, try again");
            System.exit(0);
        }

        System.out.println(displayProblem);
        System.out.println(correctAnswer);
    }


    public static void add(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 + num2;

        displayProblem = num1 + " + " + num2;
    }

    public static void sub(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 - num2;
        displayProblem = num1 + " - " + num2;
    }


    public static void mult(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 * num2;
        displayProblem = num1 + " X " + num2;
    }


    public static void div(){
        int num1 = random();
        int num2 = random();

        correctAnswer = (num1 / num2);

        correctAnswer = Math.round(correctAnswer * 100) / 100;
        displayProblem = num1 + " / " + num2;
    }


    //HELPER METHOD


    public static int random() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }


    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
}


