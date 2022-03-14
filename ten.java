import java.awt.*;
import java.awt.event.*;
  class Main extends Frame implements ActionListener{
  TextField tf1, tf2;
  Label l;
  Button b;

  Main(){
     tf1 = new TextField();
     tf1.setBounds(50, 50, 200, 25);
     
     tf2 = new TextField();
     tf2.setBounds(50, 100, 200, 25);

     l= new Label();
     l.setBounds(50, 150, 200, 50);

     b = new Button("Divide");
     b.setBounds(50, 200, 100, 50);
     b.addActionListener(this);

     add(b);
     add(tf1);
     add(tf2);
     add(l);
     setSize(800, 800);
   
     setLayout(null);
     setVisible(true);
  }

   public void actionPerformed(ActionEvent e){
      try {
         String n1 = tf1.getText();
         String n2 = tf2.getText();
         l.setText("Quotient:"+ (Integer.parseInt(n1)/Integer.parseInt(n2)));
        }
    
      catch(NumberFormatException ze)
      {
        l.setText("Cannot divide non-numerical/ non-integer values");
      }

       catch(ArithmeticException ze)
      {
        l.setText("Cannot divide by zero");
      }
      
       catch(Exception ex)

       {
         System.out.println(ex);
       }

     }

    public static void main(String args[])
    {
       new Main();
    }
  }


     
     