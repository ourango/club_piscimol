import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
//Hola Homer 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Login extends JFrame
{
     
    private JLabel label, label2;
    private JTextField user;
    private JPasswordField pass;
    private JButton boton1;
    private JButton boton2;
         
    public Login()
    {       
        super("LOGIN");      //(user: admin pass)
        getContentPane().setLayout(null);
         
        //CREAR ETIQUETA Y CAMBIAR ATRIBUTOS
        label=new JLabel("ID DE USUARIO");
        label.setForeground(Color.red);
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(20,10,150,30);
        getContentPane().add(label);
        //CREAR CAMPO DE TEXTO Y COLOCAR EN POSICION
        user=new JTextField(15);
        user.setBounds(150,10,150,30);
        getContentPane().add(user); 
         
        //CREAR ETIQUETA Y CAMBIAR ATRIBUTOS
        label2=new JLabel("PASSWORD");
        label2.setForeground(Color.red);
        label2.setFont(new Font("Arial",Font.BOLD,16));
        label2.setBounds(20,60,150,30);
        getContentPane().add(label2);
        //CREAR CAMPO DE TEXTO Y COLOCAR EN POSICION
        pass=new JPasswordField(15);
        pass.setBounds(150,60,150,30);
        getContentPane().add(pass);     
         
        //CREAR BOTON Y CAMBIAR ATRIBUTOS
        boton1  =  new JButton ("INGRESAR");        
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("Arial",Font.BOLD,18));
        boton1.setBounds(150,90,150,30);   
        
        //AQUI SE AGREGA EL EVENTO DEL BOTON DIRECTAMENTE
        boton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evento)
                {               
                    if( user.getText().equals("admin") && pass.getText().equals("123") )
                        JOptionPane.showMessageDialog(null,"INGRESO CORRECTO");
                     
                    else{
                                         
                     
                    if( !user.getText().equals("admin") )
                        JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO");
                    else           
                    if( !pass.getText().equals("123") )
                        JOptionPane.showMessageDialog(null,"PASSWORD INCORRECTO");
                    }
                         
                }               
        });                     
         
        getContentPane().add(boton1);
         
        setSize(350,180);
        setLocation(200,200);
        setVisible(true);   
                 
    }
    public static void main(String[] args) {
        new Login();
    }
}