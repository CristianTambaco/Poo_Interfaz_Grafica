import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnSumar;
    private JLabel label1;
    private JLabel label2;
    public JPanel mainPanel;   //***************
    private JLabel lblTotal;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public form1() {
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //***atributos***

                Double num1 =Double.parseDouble(textField1.getText());   //conversion
                Double num2 =Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(num1 + num2));
                System.out.println(num1+num2);


            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 =Double.parseDouble(textField1.getText());   //conversion
                Double num2 =Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(num1 - num2));
                System.out.println(num1-num2);

            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 =Double.parseDouble(textField1.getText());   //conversion
                Double num2 =Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(num1 * num2));
                System.out.println(num1*num2);
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 =Double.parseDouble(textField1.getText());   //conversion
                Double num2 =Double.parseDouble(textField2.getText());
                lblTotal.setText(String.valueOf(num1 / num2));
                System.out.println(num1/num2);
            }
        });
    }
}
