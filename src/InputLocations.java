import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InputLocations extends JFrame  {
   JPanel panel;
   JLabel location_label, destination_label,title_label, message;
   
   JTextField location_text,destination_text;


   JButton submit, cancel;
   InputLocations() {
   
 

           
           title_label = new JLabel("Dijkstra ALGORITHM");
            title_label.setBounds(260,30,600,40);
            title_label.setFont(new Font("Century Gothic", Font.BOLD, 35));
   
   
   
        //Location Label
        location_label = new JLabel("Lokacioni");
        location_label.setBounds(90,165,400,30);
        location_label.setFont(new Font("Century Gothic", Font.PLAIN, 24));
      
      //LOCATION textField
          location_text = new JTextField();
          location_text.setBounds(280,150,380,65);
          location_text.setFont(new Font("Century Gothic", Font.BOLD, 30));
          
          

      
      //Desination Label
         destination_label = new JLabel("Destinacioni");
         destination_label.setBounds(90,250,400,30);
        destination_label.setFont(new Font("Century Gothic", Font.PLAIN, 24));
      
      
       //Desination TextField
      destination_text = new JTextField();
      destination_text.setBounds(280,230,380,65);
       destination_text.setFont(new Font("Century Gothic", Font.BOLD, 30));
      
      
       // Submit 
         submit = new JButton("Kerkoni rrugen me te shkurter");
         submit.setBounds(280,310,380,60);
         submit.setFont(new Font("Century Gothic", Font.BOLD, 15));
      
      
      panel = new JPanel();
      
      panel.setLayout(null);
     
      panel.add(location_label);
      panel.add(location_text);
      panel.add(destination_label);
      panel.add(destination_text);
      panel.add(title_label);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      add(panel, BorderLayout.CENTER);
      setTitle("Aplikacioni per gjetjen e rruges me te shkurte me algoritmin Dijkstra");
      setSize(870,500);
      setVisible(true);
   }
   
       public String getLabel1() {
        return location_text.getText();
         }
    
    
        public String getLabel2() {
        return destination_text.getText();
    }
   
   
   
   
   
   public static void main(String[] args) {
      new InputLocations();
   }
  
}