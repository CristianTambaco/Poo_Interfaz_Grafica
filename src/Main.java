import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!, mensaje en consola");
        //
        JFrame frame = new JFrame("Aplicación para sumar dos números");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //que es lo que pasa cuando cierro el formulario
        frame.setSize(800,600);    //seteo del tamaño
        frame.setPreferredSize(new Dimension(800,600));     //seteo del tamaño preferido
        frame.pack();
        frame.setVisible(true);


    }
}