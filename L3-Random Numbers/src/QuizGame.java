import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class QuizGame {

   static JPanel panel;
    static JButton createProblem, checkAnswer;
    static JLabel showProblem;
    static JTextField answerInput;
    static JRadioButton add, sub, x, div;
    static JLabel ya;
    static ButtonGroup reeee = new ButtonGroup();


    static double userAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {
        new QuizGame();

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
        ya = new JLabel(displayProblem);

        add.setBounds(100, 50, 200, 25 );
        sub.setBounds(100, 75, 200, 25);
        x.setBounds(100, 100, 200, 25);
        div.setBounds(100, 125, 200, 25);

        createProblem.setBounds(50, 250, 200, 25);
        showProblem.setBounds(50, 150, 200, 25);
        answerInput.setBounds(50, 175, 200, 25);
        checkAnswer.setBounds(50, 200, 200, 25);
        ya.setBounds(50, 225,200, 25);


        add.setSelected(true);

        createProblem.addActionListener(new createProblemButton());
        checkAnswer.addActionListener(new checkAnswerButton());

        reeee.add(add);
        reeee.add(sub);
        reeee.add(x);
        reeee.add(div);

        panel.setLayout(null);
        panel.add(add);
        panel.add(sub);
        panel.add(x);
        panel.add(div);
        panel.add(createProblem);
        panel.add(showProblem);
        panel.add(answerInput);
        panel.add(checkAnswer);
        panel.add(ya);



        frame.add(panel);
        frame.setVisible(true);
    }
    public static void check(){
        if (userAnswer == correctAnswer) {
            ya.setText("Yep");
            panel.add(createProblem);
        }else{
            ya.setText("No rip bozo");
        }
    }
    
    public static void getUser(){
        userAnswer = Double.parseDouble(answerInput .getText());
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

    private class createProblemButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            if (add.isSelected()){
                add();
            }
            if (sub.isSelected()){
                sub();
            }
            if (x.isSelected()){
                mult();
            }
            if (div.isSelected()){
                div();
            }
            showProblem.setText(displayProblem);
            panel.remove(createProblem);
            panel.updateUI();
        }

    }
    private class checkAnswerButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            getUser();
            check();
        }
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


