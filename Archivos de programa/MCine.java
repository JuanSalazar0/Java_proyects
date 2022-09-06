//Version 1.0 
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
public class MCine extends JFrame implements ActionListener{
    public JLabel lugar, hora, fecha;
    public JLabel M2,M22,iconoM2; //EVENTO
    public JLabel c2,c22,iconoc2; //carritos
    public JTextArea textareaDescri,textarea,textarea1;
    public JButton compra;
   
	public MCine(){
        //Inicio//
        setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Pelicula:Overlord");
        //fin de inicio//
        Font fuente = new Font("Helvetica Neue", Font.ITALIC,16);

        compra = new JButton("Realizar pedido");
		compra.setBounds(370,260,130,25);
		add(compra);
        compra.addActionListener(this);

        lugar = new JLabel("->Lugar:Cinepolis Villa nueva");
        lugar.setBounds(30,260,400,30);//x,y, ancho y altura
        lugar.setFont(fuente);
        lugar.setForeground(new Color(0, 0, 0));
        add(lugar);

        hora = new JLabel("->Hora: 20:30 HRS");
        hora.setBounds(30,290,400,30);//x,y, ancho y altura
        hora.setFont(fuente);
        hora.setForeground(new Color(0, 0, 0));
        add(hora);

        fecha = new JLabel("->Fecha: 20/11/2020");
        fecha.setBounds(30,320,400,30);//x,y, ancho y altura
        fecha.setFont(fuente);
        fecha.setForeground(new Color(0, 0, 0));
        add(fecha);

        ///////////////////////////////////////textarea/////////////
        textarea = new JTextArea();
        textarea.setBounds(120,0,350,200);
        textarea.setEditable(false);
        textarea.setBackground(Color.BLUE);
        add(textarea);

        textarea1 = new JTextArea();
        textarea1.setBounds(390,290, 80, 80);
        textarea1.setEditable(false);
        textarea1.setBackground(Color.BLUE);
        add(textarea1);

        textareaDescri = new JTextArea("Descripcion:Este gran cortometraje es el exito del verano\naltamente recomendado para los amantes del thriller");
        textareaDescri.setBounds(90,210,450,150);
        textareaDescri.setEditable(false);
        textareaDescri.setFont(fuente);
        add(textareaDescri);
      
        /////////////////////////tuneado/////////////////
        ImageIcon M2 = new ImageIcon("LOL.jpg");
		M22 = new JLabel(M2);
		M22.setBounds(0,0, 350, 200);//x,y, ancho y altura
		Icon iconoM2 = new ImageIcon(M2.getImage().getScaledInstance(M22.getWidth(), M22.getHeight(), Image.SCALE_DEFAULT));
		M22.setIcon(iconoM2);
        textarea.add(M22);

        ImageIcon c2 = new ImageIcon("carritos.png");
		c22 = new JLabel(c2);
		c22.setBounds(0,0, 80, 80);//x,y, ancho y altura
		Icon iconoc2 = new ImageIcon(c2.getImage().getScaledInstance(c22.getWidth(), c22.getHeight(), Image.SCALE_DEFAULT));
		c22.setIcon(iconoc2);
        textarea1.add(c22);

        getContentPane().setBackground(new Color(255,255,255));

    }//Fin del constructor
    

	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == compra){
           CompraMCine gold = new CompraMCine();
            gold.setBounds(100, 100, 700, 500);
            gold.setVisible(true);	
            gold.setResizable(false);
		}
    }//Fin del metodo action event 
    

	public static void main(String args[]){
		MCine jojo = new MCine();
		jojo.setBounds(10,10,600,420); //x, y
		jojo.setVisible(true);
		jojo.setResizable(false);
		
    }//Fin del main
}//fin de la clase