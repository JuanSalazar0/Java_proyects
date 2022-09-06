//Version 3.0 
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;

public class Proyecto extends JFrame implements ActionListener, KeyListener{
    JPanel miPanel;
    JScrollPane scroll;
    //menu arriba 
    public JMenuBar menubar;
    public JMenu submenu;
    public JMenu menu1;
    public JMenuItem itemAyuda, itemInicio, itemContacto, itemConsejos; 
    //fin menu arriba

    //Vista 
    public JLabel Musica, Teatro, Cine, Deporte,Eventos;
    //Fin 
    public JLabel  logo, icono,i1,i2,icono2;
    public JLabel M1,M11,iconoM1; 
    public JLabel M2,M22,iconoM2;
    public JLabel T1,T11,iconoT1;
    public JLabel C1,C11,iconoC1;
    public JLabel D1,D11,iconoD1;
    public JTextArea textarea,textarea1,textarea2,textarea22,textarea3,textarea33,textarea4,textarea44,textareaI;
    public JTextArea textareaR,textareaR1,textareaM,textarea0,textarea5,textarea55;
    public JButton VM1,VM2,VT1,VC1,VD1;

	public Proyecto(){
        //Inicio//
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("The Velvet ROOM");
        //fin de inicio//
       
        ///////////////////////////////Barra de arriba con menus/////////
		 //Declaracion de la barra 
		 menubar = new JMenuBar();
         setJMenuBar(menubar);
         //menu
		 menu1 = new JMenu("Inicio");
		 menubar.add(menu1);
		 itemInicio = new JMenuItem("Sobre nosotros");
         menu1.add(itemInicio);
         //submenu 
		 submenu = new JMenu("Ayuda");
		 menu1.add(submenu);
		 itemContacto = new JMenuItem("Contactos");
		 itemConsejos = new JMenuItem("Covid");
		 submenu.add(itemContacto);
         submenu.add(itemConsejos);
		 itemInicio.addActionListener(this);
		 itemConsejos.addActionListener(this);
         itemContacto.addActionListener(this);
        ///////////////////////////////Fin Barra de arriba con menus/////////
        /////////////////////////////////////////////////////////////////////////
        miPanel=new JPanel();
        miPanel.setLayout(null);
        scroll=new JScrollPane(miPanel);
        miPanel.setPreferredSize(new Dimension(499,1700));
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        add(scroll);
        miPanel.setForeground(new Color(255, 255, 255));
        miPanel.setBackground(new Color(255, 255, 255));

        ////////////////////////////////////////////////////////////////////
        textareaI = new JTextArea();
        textareaI.setBounds(0,0,1000,120);//x,y, ancho y altura
		textareaI.setEditable(false);
		miPanel.add(textareaI);
        textareaI.setForeground(Color.BLUE);
        textareaI.setBackground(Color.BLUE);

        Font fuente1 = new Font("Helvetica Neue", Font.ITALIC,34);
        Eventos = new JLabel("->La mejor pagina para comprar tus boletos<-");
        Eventos.setBounds(90,30,800,60);//x,y, ancho y altura
        Eventos.setForeground(new Color(0, 0, 0));
        Eventos.setFont(fuente1);
        textareaI.add(Eventos);
        /////////////////////////////////////////////////MUSICA///////////////////
        Font fuente = new Font("Helvetica Neue", Font.ITALIC,26);
        Musica = new JLabel("->Los mejores conciertos:");
        Musica.setBounds(30,160,400,30);//x,y, ancho y altura
        Musica.setFont(fuente);
        Musica.setForeground(new Color(0, 0, 0));
        miPanel.add(Musica);

        textarea = new JTextArea();
        textarea.setBounds(90,200,350,320);//x,y, ancho y altura
		textarea.setEditable(false);
		miPanel.add(textarea);
        textarea.setForeground(Color.BLUE);
		textarea.setBackground(Color.BLUE);

        ImageIcon M1 = new ImageIcon("M1.png");
		M11 = new JLabel(M1);
		M11.setBounds(25,10, 300, 150);//x,y, ancho y altura
		Icon iconoM1 = new ImageIcon(M1.getImage().getScaledInstance(M11.getWidth(), M11.getHeight(), Image.SCALE_DEFAULT));
		M11.setIcon(iconoM1);
        textarea.add(M11);
        
        textarea1 = new JTextArea("La orquesta presentara la cancion Allegro con Fucco\nen donde el director Kojima nos honrara con su\n habilidad inata  ");
        textarea1.setBounds(30,160,350,100);//x,y, ancho y altura
		textarea1.setEditable(false);
		textarea.add(textarea1);
        textarea1.setForeground(new Color(255, 255, 255));
        textarea1.setBackground(Color.BLUE);

        VM1 = new JButton("Ver mas");
		VM1.setBounds(30,250,100,30);
		textarea.add(VM1);
        VM1.addActionListener(this);
        
        ////////////////
        textarea2 = new JTextArea();
        textarea2.setBounds(530,200,350,320);//x,y, ancho y altura
		textarea2.setEditable(false);
		miPanel.add(textarea2);
        textarea2.setForeground(Color.BLUE);
        textarea2.setBackground(Color.BLUE);
        
        ImageIcon M2 = new ImageIcon("Green.jpg");
		M22 = new JLabel(M2);
		M22.setBounds(25,10, 300, 150);//x,y, ancho y altura
		Icon iconoM2 = new ImageIcon(M2.getImage().getScaledInstance(M22.getWidth(), M22.getHeight(), Image.SCALE_DEFAULT));
		M22.setIcon(iconoM2);
        textarea2.add(M22);
        
        textarea22 = new JTextArea("Green Day se presenta en Guadalajara\ndonde mostraran su nuevo\ndisco en exclusiva  ");
        textarea22.setBounds(30,160,350,100);//x,y, ancho y altura
		textarea22.setEditable(false);
		textarea2.add(textarea22);
        textarea22.setForeground(new Color(255, 255, 255));
        textarea22.setBackground(Color.BLUE);

        VM2 = new JButton("Ver mas");
		VM2.setBounds(30,250,100,30);
		textarea2.add(VM2);
        VM2.addActionListener(this);
        /////////////////////////////////////////////////FIN MUSICA//////////////////////
        /////////////////////////////////////////////////Teatro///////////////////
        Teatro = new JLabel("->La mejor actuacion:");
        Teatro.setBounds(30,550,400,30);//x,y, ancho y altura
        Teatro.setFont(fuente);
        Teatro.setForeground(new Color(0, 0, 0));
        miPanel.add(Teatro);

        textarea3 = new JTextArea();
        textarea3.setBounds(90,590,350,320);//x,y, ancho y altura
		textarea3.setEditable(false);
		miPanel.add(textarea3);
        textarea3.setForeground(Color.BLUE);
        textarea3.setBackground(Color.BLUE);

        ImageIcon T1 = new ImageIcon("g.png");
		T11 = new JLabel(T1);
		T11.setBounds(25,10, 300, 150);//x,y, ancho y altura
		Icon iconoT1 = new ImageIcon(T1.getImage().getScaledInstance(T11.getWidth(), T11.getHeight(), Image.SCALE_DEFAULT));
		T11.setIcon(iconoT1);
        textarea3.add(T11);

        textarea33 = new JTextArea("Esta gran obra, esta basada en la aclamada obra\nliteraria Diarios de una pasion de 100 primaveras\nEsta historia esta llena de trama y triller\n");
        textarea33.setBounds(30,160,350,100);//x,y, ancho y altura
		textarea33.setEditable(false);
		textarea3.add(textarea33);
        textarea33.setForeground(new Color(255, 255, 255));
        textarea33.setBackground(Color.BLUE);

        VT1 = new JButton("Ver mas");
		VT1.setBounds(30,250,100,30);
		textarea3.add(VT1);
        VT1.addActionListener(this);
        /////////////////////////////////////////////////FIN MUSICA//////////////////////

        ///////////////////////////////////////////////////CINE////////////////////////////
        Cine = new JLabel("->Obras cinematograficas:");
        Cine.setBounds(30,920,400,30);//x,y, ancho y altura
        Cine.setFont(fuente);
        Cine.setForeground(new Color(0, 0, 0));
        miPanel.add(Cine);

        textarea4 = new JTextArea();
        textarea4.setBounds(90,960,350,320);//x,y, ancho y altura
		textarea4.setEditable(false);
		miPanel.add(textarea4);
        textarea4.setForeground(Color.BLUE);
        textarea4.setBackground(Color.BLUE);

        
        VC1 = new JButton("Ver mas");
		VC1.setBounds(30,250,100,30);
		textarea4.add(VC1);
        VC1.addActionListener(this);

        ImageIcon C1 = new ImageIcon("LOL.jpg");
		C11 = new JLabel(C1);
		C11.setBounds(25,10, 300, 150);//x,y, ancho y altura
		Icon iconoC1 = new ImageIcon(C1.getImage().getScaledInstance(C11.getWidth(), C11.getHeight(), Image.SCALE_DEFAULT));
		C11.setIcon(iconoC1);
        textarea4.add(C11);

        textarea44 = new JTextArea("Este gran cotometraje ha sido galardonado como \nganador en el teatro de canes aqui se nos cuenta\n las tristes y sombrias desventuras de la protagonista\nGenero:Historia de la vida\n");
        textarea44.setBounds(30,160,350,100);//x,y, ancho y altura
		textarea44.setEditable(false);
		textarea4.add(textarea44);
        textarea44.setForeground(new Color(255, 255, 255));
        textarea44.setBackground(Color.BLUE);
        /////////////////////////////////////////////////FIN CINE//////////////////////
        /////////////////////////////////////////////////Deporte//////////////////////
        Deporte = new JLabel("->Para los amantes del deporte:");
        Deporte.setBounds(30,1320,400,30);//x,y, ancho y altura
        Deporte.setFont(fuente);
        Deporte.setForeground(new Color(0, 0, 0));
        miPanel.add(Deporte);

        textarea5 = new JTextArea();
        textarea5.setBounds(90,1360,350,320);//x,y, ancho y altura
		textarea5.setEditable(false);
		miPanel.add(textarea5);
        textarea5.setForeground(Color.BLUE);
        textarea5.setBackground(Color.BLUE);

        
        VD1 = new JButton("Ver mas");
		VD1.setBounds(30,250,100,30);
		textarea5.add(VD1);
        VD1.addActionListener(this);

        ImageIcon D1 = new ImageIcon("Dep.jpg");
		D11 = new JLabel(D1);
		D11.setBounds(25,10, 300, 150);//x,y, ancho y altura
		Icon iconoD1 = new ImageIcon(D1.getImage().getScaledInstance(D11.getWidth(), D11.getHeight(), Image.SCALE_DEFAULT));
		D11.setIcon(iconoD1);
        textarea5.add(D11);

        textarea55 = new JTextArea("Este pago por evento muestra el combate\nmas esperado de la temporada");
        textarea55.setBounds(30,160,350,100);//x,y, ancho y altura
		textarea55.setEditable(false);
		textarea5.add(textarea55);
        textarea55.setForeground(new Color(255, 255, 255));
        textarea55.setBackground(Color.BLUE);
        /////////////////////////////////////////////////Fin Deporte//////////////////////

        ////////////////////////Tuneado////////////////////////////
        setIconImage(new ImageIcon(getClass().getResource("logo1.png")).getImage());
		//ImageIcon imagen = new ImageIcon("logo.png");
        
        ImageIcon i1 = new ImageIcon("y.png");
		i2 = new JLabel(i1);
		i2.setBounds(850, 0, 110,110);//x,y, ancho y altura
		Icon icono2 = new ImageIcon(i1.getImage().getScaledInstance(i2.getWidth(), i2.getHeight(), Image.SCALE_DEFAULT));
		i2.setIcon(icono2);
        textareaI.add(i2);
        
        setFocusable(true);
        addKeyListener(this);
    }//Fin del constructor
    
    //Tecladito 
    public void focusLost(FocusEvent e){ }
    public void focusGained(FocusEvent e){ }
    public void keyPressed(KeyEvent k){
    System.out.println(k);
      if(k.getKeyCode()==10){
          System.exit(0);
        }
    }
    public void keyReleased(KeyEvent k){}
    public void keyTyped(KeyEvent k){}
    //fin tecladito

    ///////////////////////////////Barra de arriba con menus/////////
	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == itemInicio){
            JOptionPane.showMessageDialog(null, "Nosotros somos una empresa que se preocupa por nuestros clientes de manera muy seria\nNuestra mision es hacer que la experiencia de comprar boletos sea sencilla y rapida");   
		}
		if(accion.getSource() == itemContacto){ 
			JOptionPane.showMessageDialog(null, "Si tiene problemas favor de comunicarse al (+52)3317112020");
		}
		if(accion.getSource() == itemConsejos){
            JOptionPane.showMessageDialog(null, "Por la situacion actual el equipo de Albedo productions tendra que retirar filas y asientos de las salas,\n esperamos volver a la normalidad lo antes posible");
        }
        if(accion.getSource() == VM1){
            MC1 M1 = new MC1();
			M1.setBounds(100, 100, 600, 400);
			M1.setVisible(true);	
			M1.setResizable(false);
            }
        if(accion.getSource() == VM2){
             MC2 M2 = new MC2();
             M2.setBounds(100, 100, 600, 400);
             M2.setVisible(true);	
             M2.setResizable(false);
            }
        
        if(accion.getSource() == VT1){
            MT1 T1 = new MT1();
            T1.setBounds(100, 100, 600, 400);
            T1.setVisible(true);	
            T1.setResizable(false);
            }
        
         if(accion.getSource() == VC1){
             MCine C1 = new MCine();
             C1.setBounds(100, 100, 600, 400);
             C1.setVisible(true);	
             C1.setResizable(false);
             }

        if(accion.getSource() == VD1){
            MDep D1 = new MDep();
            D1.setBounds(100, 100, 600, 400);
            D1.setVisible(true);	
            D1.setResizable(false);
             }
              
       
      
    }//Fin del metodo action event menu arriba 
    

	public static void main(String args[]){
		Proyecto jojo = new Proyecto();
		jojo.setBounds(10,10,1000,600); //x, y
		jojo.setVisible(true);
		jojo.setResizable(false);
		
	}//Fin del main
	

	
}//fin de la clase