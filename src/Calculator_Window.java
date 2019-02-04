import java.awt.EventQueue;

import javax.swing.JFrame;




import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator_Window
{

    private JFrame frame;
    private JTextField display;
    private String inspectInput="";

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Calculator_Window window = new Calculator_Window();
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator_Window()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setBounds(100, 100, 288, 467);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        display = new JTextField();
        display.setBackground(Color.WHITE);
        display.setFont(new Font("Tahoma", Font.BOLD, 20));
        display.setBounds(0, 0, 272, 98);
        frame.getContentPane().add(display);
        display.setColumns(10);

        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn1 = new JButton("1");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn1.addActionListener(new ActionListener()
        {


            public void actionPerformed(ActionEvent arg0)
            {

                inspectInput = display.getText()+btn1.getText();
                display.setText(inspectInput);
            }
        });
        btn1.setBounds(0, 109, 50, 50);
        frame.getContentPane().add(btn1);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn2.getText();
                display.setText(inspectInput);

            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn2.setBounds(73, 109, 50, 50);
        frame.getContentPane().add(btn2);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn3.getText();
                display.setText(inspectInput);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn3.setBounds(144, 109, 50, 50);
        frame.getContentPane().add(btn3);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN +~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnPlus.getText();
                display.setText(inspectInput);
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPlus.setBounds(212, 109, 50, 50);
        frame.getContentPane().add(btnPlus);



        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 4~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn4.getText();
                display.setText(inspectInput);

            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn4.setBounds(0, 170, 50, 50);
        frame.getContentPane().add(btn4);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 5~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn5.getText();
                display.setText(inspectInput);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn5.setBounds(73, 170, 50, 50);
        frame.getContentPane().add(btn5);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 6~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn6.getText();
                display.setText(inspectInput);

            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn6.setBounds(144, 170, 50, 50);
        frame.getContentPane().add(btn6);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN (-)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnMinus.getText();
                display.setText(inspectInput);
            }
        });
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnMinus.setBounds(212, 170, 50, 50);
        frame.getContentPane().add(btnMinus);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 7~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn7.getText();
                display.setText(inspectInput);

            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn7.setBounds(0, 231, 50, 50);
        frame.getContentPane().add(btn7);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 8~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn8.getText();
                display.setText(inspectInput);

            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn8.setBounds(73, 231, 50, 50);
        frame.getContentPane().add(btn8);



        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 9~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btn9.getText();
                display.setText(inspectInput);

            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn9.setBounds(144, 231, 50, 50);
        frame.getContentPane().add(btn9);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN (*)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnMultiply.getText();
                display.setText(inspectInput);

            }
        });
        btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnMultiply.setBounds(212, 231, 50, 50);
        frame.getContentPane().add(btnMultiply);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN (.)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnDecimal = new JButton(".");
        btnDecimal.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnDecimal.getText();
                display.setText(inspectInput);
            }
        });
        btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDecimal.setBounds(0, 293, 50, 50);
        frame.getContentPane().add(btnDecimal);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN 0~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnZero = new JButton("0");
        btnZero.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnZero.getText();
                display.setText(inspectInput);
            }
        });
        btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnZero.setBounds(73, 293, 50, 50);
        frame.getContentPane().add(btnZero);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN (=)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener()
        {


            public void actionPerformed(ActionEvent e)
            {

                String test = getResult(inspectInput);
                display.setText(test);

            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnEqual.setBounds(144, 293, 50, 50);
        frame.getContentPane().add(btnEqual);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN (/)~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnDivision = new JButton("/");
        btnDivision.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput = display.getText()+btnDivision.getText();
                display.setText(inspectInput);

            }
        });
        btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDivision.setBounds(212, 293, 50, 50);
        frame.getContentPane().add(btnDivision);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN AC~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnAC = new JButton("AC");
        btnAC.setToolTipText("");
        btnAC.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                ///inspectInput = display.getText()+btn1.getText();
                display.setText("");
            }
        });
        btnAC.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnAC.setBounds(0, 354, 120, 50);
        frame.getContentPane().add(btnAC);


        ///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BTN C~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                inspectInput=inspectInput.substring(0, inspectInput.length()-1);
                display.setText(inspectInput);
            }
        });
        btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnC.setBounds(144, 354, 120, 50);
        frame.getContentPane().add(btnC);
    }





    public static String getResult(String test)
    {
        String result;
        char operator;


        int operatorPosition=0;


        while(test.contains("+")==true || test.contains("-")==true || test.contains("*")==true || test.contains("/")==true)
        {

            if(test.charAt(0)=='-' && checkOtherOperatorsExistence(test)==0)
            {

                break;
            }
            {
                operatorPosition=findOperatorPosition(test);

            }


            operator = test.charAt(operatorPosition);
            test = setNumber(test, operatorPosition,operator);


        }

        return test;

    }


////~~~~~~~~~~~~~~~~~~~~~~~~GET OPERATOR POSITION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int getOperatorPosition(String test,int startingPosition)
    {
        int operatorPosition=0;

        for(int i = startingPosition; i<test.length(); i++)
        {
            char a = test.charAt(i);

            if(a=='+' || a=='-' || a=='*' || a=='/')
            {
                operatorPosition=i;

            }
        }

        return operatorPosition;
    }


///~~~~~~~~~~~~~~~~~~~~~~~~~~~~SET NUMBER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static String setNumber(String test, int operatorPosition,char operator)
    {
        int startingPosition=0,finishingPosition=0;
        double firstNumber,secondNumber;
        String firstNumberSubstring,secondNumberSubstring;
        char a;



        for(int i = operatorPosition+1; i<test.length(); i++)
        {

            a = test.charAt(i);

            if(a=='+' || a=='-' || a=='*' || a=='/' || a==')')
            {
                finishingPosition=i;
                break;

            }
            else
                finishingPosition=test.length();

        }

        for(int i =operatorPosition-1; i>=0; i--)
        {
            a = test.charAt(i);

            if(a=='+' || a=='-' || a=='*' || a=='/' || a=='(' )
            {
                startingPosition=i;
                break;

            }
            else
                startingPosition=0;
        }


        if(startingPosition!=0)
        {
            firstNumberSubstring = test.substring(startingPosition+1, operatorPosition);
        }
        else
            firstNumberSubstring = test.substring(startingPosition, operatorPosition);


        secondNumberSubstring = test.substring(operatorPosition+1, finishingPosition);


        firstNumber = covertToDouble(firstNumberSubstring);
        secondNumber= covertToDouble(secondNumberSubstring);



        double result = calculation(firstNumber, secondNumber, operator);


        String UpdatedString = updateString(test, result, startingPosition,finishingPosition);

        if(result<0.00 && startingPosition !=0)
        {

            UpdatedString=ifResultLessThanZero(UpdatedString, startingPosition);
        }

        return UpdatedString;
    }


///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~CALCULATION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static double calculation(Double firstNumber,Double secondNumber,char operator)
    {
        double result;

        if(operator=='+')
            result= firstNumber+ secondNumber;
        else if(operator=='-')
            result= firstNumber- secondNumber;
        else if(operator=='*')
            result= firstNumber* secondNumber;
        else
            result= firstNumber/ secondNumber;

        return result;
    }


///~~~~~~~~~~~~~~~~~~~~~~~~~~~~UPDATE STRING~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static String updateString(String test,double result, int updatePosition,int finishingPosition)
    {

        String update = Double.toString(result);
        String substring;

        String firstHalfSubstring,lasttHalfSubstring;

        if(updatePosition==0)
        {
            firstHalfSubstring = test.substring(0,updatePosition);
        }
        else
            firstHalfSubstring = test.substring(0,updatePosition+1);



        lasttHalfSubstring = test.substring(finishingPosition,test.length());


        substring = firstHalfSubstring + update + lasttHalfSubstring;


        test = substring;

        return test;
    }



///~~~~~~~~~~~~~~~~~~~~~~~~~FIND OPERATOR POSITION ~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int findOperatorPosition(String test)
    {
        int operatorPosition=0;

        if(test.contains("/") && test.indexOf('/',1)>0)
        {
            operatorPosition = test.indexOf('/',1);
        }
        else if(test.contains("*") && test.indexOf('*',1)>0)
        {
            operatorPosition = test.indexOf('*',1);
        }
        else if(test.contains("-") && test.indexOf('-',1)>0)
        {
            operatorPosition = test.indexOf('-',1);
        }
        else if(test.contains("+")&& test.indexOf('+',1)>0)
        {
            operatorPosition = test.indexOf('+',1);
        }

        return operatorPosition;
    }


    public static double covertToDouble(String numberSubstring)
    {

        double number = Double.parseDouble(numberSubstring);

        return number;
    }

///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~IF RESULT LESS THAN ZERO~~~~~~~~~~~~~~~~~~~~~


    public static String ifResultLessThanZero(String test,int startingPosition)
    {


        char operator = test.charAt(startingPosition);

        if(operator=='-')
        {
            test=test.substring(0,startingPosition)+'+'+test.substring(startingPosition+2,test.length());
        }
        else
            test=test.substring(0,startingPosition)+'-'+test.substring(startingPosition+2,test.length());


        return test;
    }

///~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Check Other operator existence~~~~~~~~~~

    public static int checkOtherOperatorsExistence(String test)
    {
        int checker = 0;

        for(int i=1; i<test.length(); i++)
        {
            char a = test.charAt(i);

            if(a=='+' || a=='-' || a=='*' || a=='/')
            {
                checker=1;
                break;

            }
        }
        return checker;


    }


}


