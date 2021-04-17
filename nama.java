import javax.swing.*;
import java.awt.event.*;

public class nama
{
public static void main(String[] args)
{
JFrame frame = new JFrame();
frame.setTitle("Input Nama");

//frame layout
frame.setSize(280, 160);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

//label nama
JLabel label = new JLabel("Nama");
frame.setLayout(null);
frame.add(label);
label.setBounds(20, 20, 150, 30);

//text nama
JTextField textfield = new JTextField();
frame.add(textfield);
textfield.setBounds(70, 20, 160, 30);

//Button submit
JButton login = new JButton("Submit");
frame.add(login);
login.setBounds(100, 70, 90, 20);

login.addActionListener((ActionEvent e) -> {
    String nama = textfield.getText();
    
    if(nama.length()<6)
    {
        JOptionPane.showMessageDialog(frame,
                "Nama minimal 6 karakter",
                "Message",
                JOptionPane.WARNING_MESSAGE);
    }
    else
        JOptionPane.showMessageDialog(frame,
                "Halo " +nama,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
});
}
}