import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ActionListener;
//import java.event.*;

public class SimpleCalculator extends Frame implements ActionListener
{
    Button b1,b2,b3,b4,b5;
    TextField tf1,tf2,tf3;
    Label l1,l2,l3,l4;

    SimpleCalculator()
    {
        setLayout(null);
        setBackground(Color.orange);
        l1 = new Label("       Simple Calculator");
        l2 = new Label("Enter 1st Number:");
        l3 = new Label("Enter 2nd Number:");
        l4= new Label("Result:");

        tf1 = new TextField(20);
        tf2 = new TextField(30);
        tf3 = new TextField(30);


        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");
        b5 = new Button("CLEAR");


        l1.setBounds(140, 50, 500, 100);
        l2.setBounds(50, 200, 150, 50);
        l3.setBounds(50, 260, 150, 50);
        l4.setBounds(50, 340, 100, 50);


        tf1.setBounds(300, 200, 100, 40);
        tf2.setBounds(300, 260, 100, 40);
        tf3.setBounds(300,340,100,40);

        b1.setBounds(50, 400, 100, 50);
        b2.setBounds(200, 400, 100, 50);
        b3.setBounds(350, 400, 100, 50);
        b4.setBounds(500, 400, 100, 50);
        b5.setBounds(650, 400, 100, 50);

        Font f1=new Font("Times new Roman",Font.BOLD,40);
        l1.setFont(f1);

        Font f2=new Font("Times new Roman",Font.BOLD,15);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);


       add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        add(tf1);
        add(tf2);
        add(tf3);

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


        setVisible(true);
        setTitle("Simple Calculator");
        setSize(800,700);


    }
    public void actionPerformed(ActionEvent ae)
    {
        int x=Integer.parseInt(tf1.getText());
        int y=Integer.parseInt(tf2.getText());
        int z;

        //EventObject ae;
        if(ae.getSource()==b1)
        {
            z=x+y;
            tf3.setText(" "+z);
        }
        else if(ae.getSource()==b2)
        {
            z=x-y;
            tf3.setText(" "+z);
        }
        else if(ae.getSource()==b3)
        {
            z=x*y;
            tf3.setText(" "+z);
        }
        else if(ae.getSource()==b4)
        {
            z=x/y;
            tf3.setText(" "+z);
        }
        else if(ae.getSource()==b5)
        {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
        }
    }


}


