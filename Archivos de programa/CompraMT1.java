import javax.swing.*;//diseño de ventanas
import javax.swing.event.*;//check box y radiobutton
//import jdk.internal.org.jline.terminal.MouseEvent;
import java.awt.event.*;
import java.awt.*;
public class CompraMT1 extends JFrame implements ItemListener, ActionListener, ChangeListener,FocusListener, KeyListener, MouseListener{

    public JLabel total, Ayuda, email, ocupados,libres,pantalla,acum;
    public JComboBox <String> ayud;
    public JRadioButton B, N;
    public ButtonGroup presio;
    public JCheckBox info, recib;

    public JCheckBox A1,A2,A4,A5,A7,A8,A10,A11;
    public JCheckBox B1,B2,B4,B5,B7,B8,B10,B11;

    public JLabel M2,M22,iconoM2; //ASIENTOS IMAGEN
    public JTextArea textareaOtro,textareaC;
    JScrollPane scroll;
    public JTextField mail;
    public JButton Fin,limpiar,reser;

    ////////asientos check para textarea
    public Boolean iA1,iA2,iA4,iA5,iA7,iA8,iA10,iA11;
    public String auxA1="",auxA2="",auxA4="",auxA5="",auxA7="",auxA8="",auxA10="",auxA11="",asientosA="";

    public Boolean iB1,iB2,iB4,iB5,iB7,iB8,iB10,iB11;
    public String auxB1="",auxB2="",auxB4="",auxB5="",auxB7="",auxB8="",auxB10="",auxB11="",asientosB="";

    public String tipo="",aux="",tot,texto;
    public String ulti="";

    public int res=0, tip;
    public Boolean a1=true, a2=true, a3=false,a4=false,a5=false,a6=false,a7=false,a8=false,a9=false,a10=true,a11=true;
    public Boolean b1=true, b2=true, b3=false,b4=false,b5=false,b6=false,b7=false,b8=false,b9=false,b10=true,b11=true;
    
public CompraMT1(){
		setLayout(null);
		setTitle("Finalizar compra de Teatro");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        
        presio = new ButtonGroup();
		B = new JRadioButton("Backstage (500 pesos)");
		B.setBounds(20, 30, 200, 20); //x,y,ancho y alto
        add(B);
        B.setBackground(Color.BLUE);
		N = new JRadioButton("Estandar (300 pesos)");
		N.setBounds(20, 50, 200, 20); //x,y,ancho y alto
        add(N);
        N.setBackground(Color.BLUE);
		presio.add(B);
		presio.add(N);
		B.addChangeListener(this);
		N.addChangeListener(this);

        pantalla = new JLabel("PANTALLA");
        pantalla.setBounds(450,0,400,30);//x,y, ancho y altura
        add(pantalla);

        total = new JLabel("TOTAL->");
		total.setBounds(20, 90, 70, 20);//x,y,ancho y alto
        add(total);

        acum = new JLabel("Esperando");
		acum.setBounds(70, 90, 70, 20);//x,y,ancho y alto
        add(acum);
        
        ayud = new JComboBox <String>();
		ayud.setBounds(20,130,200,20);//x,y,ancho,alto
		add(ayud);
		ayud.addItem("No");
		ayud.addItem("Si (silla de ruedas)");
		ayud.addItem("Si (especifique en otro)");
		ayud.setEditable(true);
		ayud.setSelectedItem("Necesita ayuda?");
		ayud.setEditable(false);
		ayud.addItemListener(this);

        Ayuda = new JLabel("Otro:");
		Ayuda.setBounds(20, 160, 70, 20);//x,y,ancho y alto
		add(Ayuda);

        textareaOtro = new JTextArea();
        textareaOtro.setBounds(20,180,250,40);
        textareaOtro.setEditable(true);
        add(textareaOtro);

        email= new JLabel("Email->");
		email.setBounds(20, 230, 100, 20);//x,y,ancho y alto
        add(email);
        
        mail =new JTextField();
        mail.setBounds(70,230,200,20);//x,y, ancho y altura
        mail.setEditable(true);
        add(mail);
        
        info = new JCheckBox("Enviar recibo");
		info.setBounds(20,270,100,20); //x,y,ancho y alto
        add(info);
        info.setBackground(Color.BLUE);
        
        recib = new JCheckBox("Recibir informacion adicional");
		recib.setBounds(20,290,250,20); //x,y,ancho y alto
        add(recib);
        recib.setBackground(Color.BLUE);

        textareaC = new JTextArea("");
        textareaC.setEditable(false);
        scroll = new JScrollPane(textareaC);
		scroll.setBounds(300,250,350,200);
		add(scroll);
        

        Fin = new JButton("Actualizar");
		Fin.setBounds(20,330,100,30); //x,y,ancho,alto
		add(Fin);
        Fin.addActionListener(this);

        limpiar = new JButton("Limpiar");
		limpiar.setBounds(20,370,100,30); //x,y,ancho,alto
		add(limpiar);
        limpiar.addActionListener(this);

        reser = new JButton("Reservar");
		reser.setBounds(20,410,100,30); //x,y,ancho,alto
		add(reser);
        reser.addActionListener(this);
        ///////////////////////////////////////asientos A/////////////
        A1 = new JCheckBox();
		A1.setBounds(323,90,20,20); //x,y,ancho y alto
        add(A1);

        A2 = new JCheckBox();
		A2.setBounds(350,90,20,20); //x,y,ancho y alto
        add(A2);

        A4 = new JCheckBox();
		A4.setBounds(410,90,20,20); //x,y,ancho y alto
        add(A4);

        A5 = new JCheckBox();
		A5.setBounds(440,90,20,20); //x,y,ancho y alto
        add(A5);

        A7 = new JCheckBox();
		A7.setBounds(500,90,20,20); //x,y,ancho y alto
        add(A7);

        A8 = new JCheckBox();
		A8.setBounds(530,90,20,20); //x,y,ancho y alto
        add(A8);

        A10 = new JCheckBox();
		A10.setBounds(590,90,20,20); //x,y,ancho y alto
        add(A10);

        A11 = new JCheckBox();
		A11.setBounds(620,90,20,20); //x,y,ancho y alto
        add(A11);

        /////////////////////asientos c 
        B1 = new JCheckBox();
		B1.setBounds(323,190,20,20); //x,y,ancho y alto
        add(B1);

        B2 = new JCheckBox();
		B2.setBounds(350,190,20,20); //x,y,ancho y alto
        add(B2);

        B4 = new JCheckBox();
		B4.setBounds(410,190,20,20); //x,y,ancho y alto
        add(B4);

        B5 = new JCheckBox();
		B5.setBounds(440,190,20,20); //x,y,ancho y alto
        add(B5);

        B7 = new JCheckBox();
		B7.setBounds(500,190,20,20); //x,y,ancho y alto
        add(B7);

        B8 = new JCheckBox();
		B8.setBounds(530,190,20,20); //x,y,ancho y alto
        add(B8);

        B10 = new JCheckBox();
		B10.setBounds(590,190,20,20); //x,y,ancho y alto
        add(B10);

        B11 = new JCheckBox();
		B11.setBounds(620,190,20,20); //x,y,ancho y alto
        add(B11);
        
        ImageIcon M2 = new ImageIcon("Asientos.png");
		M22 = new JLabel(M2);
		M22.setBounds(300,30, 350, 200);//x,y, ancho y altura
		Icon iconoM2 = new ImageIcon(M2.getImage().getScaledInstance(M22.getWidth(), M22.getHeight(), Image.SCALE_DEFAULT));
		M22.setIcon(iconoM2);
        add(M22);

        setFocusable(true);
        addKeyListener(this);
        M22.addMouseListener(this);
    }//fin del construcotr

    
    //Tecladito 
    public void focusLost(FocusEvent e){ }
    public void focusGained(FocusEvent e){ }
    public void keyPressed(KeyEvent k){
    //System.out.println(k);
      if(k.getKeyCode()==10){
          JOptionPane.showMessageDialog(null, "Completado con exito"); 
          System.exit(0);
        }
    }
    public void keyReleased(KeyEvent k){}
    public void keyTyped(KeyEvent k){}
    //fin tecladito

    public void mouseEntered(MouseEvent accion5){ Revi();}
    public void mouseExited(MouseEvent accion5){}
    public void mousePressed(MouseEvent accion5){}
    public void mouseReleased(MouseEvent accion5){}
    public void mouseClicked(MouseEvent accion5){ }


public void stateChanged(ChangeEvent accion1){
	
    if((A1.isSelected() == true)){
        iA1=A1.isSelected();
        auxA1= "\nAsiento A1";
    } else { iA1=A1.isSelected();auxA1= ""; }

    if((A2.isSelected() == true)){
        iA2=A2.isSelected();
        auxA2= "\nAsiento A2";
    } else { iA2=A2.isSelected(); auxA2= "";}
    
    if((A4.isSelected() == true)){
        iA4=A4.isSelected();
        auxA4= "\nAsiento A4";
    } else { iA4=A4.isSelected();auxA4= "";}
    
    if((A5.isSelected() == true)){
        iA5=A5.isSelected();
        auxA5= "\nAsiento A5";
    } else { iA5=A5.isSelected();auxA5= "";}

    if((A7.isSelected() == true)){
        iA7=A7.isSelected();
        auxA7= "\nAsiento A7";
    } else { iA7=A7.isSelected();auxA7= "";}

    if((A8.isSelected() == true)){
       iA8=A8.isSelected();
        auxA8= "\nAsiento A8";
    }else { iA8=A8.isSelected();auxA8= "";}
    
    if((A10.isSelected() == true)){
        iA10=A10.isSelected();
        auxA10= "\nAsiento A10";
    } else { iA10=A10.isSelected();auxA10= "";}

    if((A11.isSelected() == true)){
        iA11=A11.isSelected();
        auxA11= "\nAsiento A11";
    } else { iA11=A11.isSelected();auxA11= "";}
    ///////////////////////////////////////////////////////////
    if((B1.isSelected() == true)){
        iB1=B1.isSelected();
        auxB1= "\nAsiento B1";
    } else { iB1=B1.isSelected();auxB1= "";}

    if((B2.isSelected() == true)){
        iB2=B2.isSelected();
        auxB2= "\nAsiento B2";
    } else { iB2=B2.isSelected();auxB2= "";}

    if((B4.isSelected() == true)){
        iB4=B4.isSelected();
        auxB4= "\nAsiento B4";
    } else { iB4=B4.isSelected();auxB4= "";}

    if((B5.isSelected() == true)){
        iB5=B5.isSelected();
        auxB5= "\nAsiento B5";
    } else { iB5=B5.isSelected();auxB5= "";}

    if((B7.isSelected() == true)){
        iB7=B7.isSelected();
        auxB7= "\nAsiento B7";
    } else { iB7=B7.isSelected();auxB7= "";}

    if((B8.isSelected() == true)){
        iB8=B8.isSelected();
        auxB8= "\nAsiento B8";
    } else { iB8=B8.isSelected();auxB8= "";}

    if((B10.isSelected() == true)){
        iB10=B10.isSelected();
        auxB10= "\nAsiento B10";
    } else { iB10=B10.isSelected();auxB10= "";}

    if((B11.isSelected() == true)){
        iB11=B11.isSelected();
        auxB11= "\nAsiento B11";
    } else { iB11=B11.isSelected();auxB11= "";}

    ////////////////////////////////////////////////////////
	if(B.isSelected() == true){
        tipo= "Modalidad:" + B.getText();
        tip=500;
       }
   if(N.isSelected() == true){
       tipo= "Modalidad:"+ N.getText();
       tip=300;
    }

	}//fin del metodo

 public void itemStateChanged(ItemEvent accion){
	    aux = "\n->Necesita ayuda: ";
		aux = aux + ayud.getSelectedItem();
    }//fin del metodo

    //ocupacion  la funcion de reserva 
  public void Checar (Boolean iA1, Boolean iA2, Boolean iA4, Boolean iA5, Boolean iA7, Boolean iA8, Boolean iA10, Boolean iA11){
        res=0;
        if(iA1 == true ){res++; a1=true; asientosA= asientosA + auxA1;}
        if(iA2== true ){ res++; a2=true; asientosA= asientosA + auxA2;}
        if(iA4== true ){ res++; a4=true; asientosA= asientosA + auxA4;}
        if(iA5== true ){ res++; a5=true; asientosA= asientosA + auxA5;}
        if(iA7== true ){ res++;a7=true;  asientosA= asientosA + auxA7;}
        if(iA8== true ){ res++; a8=true; asientosA= asientosA + auxA8;}
        if(iA10== true ){res++;a10=true; asientosA= asientosA + auxA10;}
        if(iA11== true ){res++;a11=true; asientosA= asientosA + auxA11;}

        if(iB1 == true ){res++;  b1=true; asientosB= asientosB + auxB1;}
        if(iB2== true ){ res++;  b2=true; asientosB= asientosB + auxB2;}
        if(iB4== true ){ res++;  b4=true; asientosB= asientosB + auxB4;}
        if(iB5== true ){ res++;  b5=true; asientosB= asientosB + auxB5;}
        if(iB7== true ){ res++;  b7=true; asientosB= asientosB + auxB7;}
        if(iB8== true ){ res++;  b8=true; asientosB= asientosB + auxB8;}
        if(iB10== true ){res++; b10=true; asientosB= asientosB + auxB10;}
        if(iB11== true ){res++; b11=true; asientosB= asientosB + auxB11;}
       // textareaC.setText("");
        tip=tip*res;
        tot= Integer.toString(tip);
        ulti= ulti + "\n-----Compra realizada-----"+ asientosA+asientosB+"\ntotal a pagar:"+tot;
        textareaC.setText(ulti);
        tip=0;
        auxA1="";auxA2="";auxA4="";auxA5="";auxA7="";auxA8="";auxA10="";auxA11="";
        auxB1="";auxB2="";auxB4="";auxB5="";auxB7="";auxB8="";auxB10="";auxB11="";
        asientosA="";asientosB="";ulti="";  
    }

  public void Revi(){  //el de borrar asientos 
        if(a1 == true){ A1.setVisible(false);   auxA1= "";}
        if(a2 == true){ A2.setVisible(false);   auxA2= "";}
        if(a4 == true){ A4.setVisible(false);   auxA4= "";}
        if(a5 == true){ A5.setVisible(false);   auxA5= "";}
        if(a7 == true){ A7.setVisible(false);   auxA7= "";}
        if(a8 == true){ A8.setVisible(false);   auxA8= "";}
        if(a10 ==true){A10.setVisible(false);   auxA10= "";}
        if(a11 ==true){A11.setVisible(false);   auxA11= "";}

        if(b1 == true){ B1.setVisible(false);   auxB1= "";}
        if(b2 == true){ B2.setVisible(false);   auxB2= "";}
        if(b4 == true){ B4.setVisible(false);   auxB4= "";}
        if(b5 == true){ B5.setVisible(false);   auxB5= "";}
        if(b7 == true){ B7.setVisible(false);   auxB7= "";}
        if(b8 == true){ B8.setVisible(false);   auxB8= "";}
        if(b10 ==true){B10.setVisible(false);   auxB10= "";}
        if(b11 ==true){B11.setVisible(false);   auxB11= "";}
    }

 public void actionPerformed(ActionEvent accion2){

    if(accion2.getSource() == Fin){//actualizar
     ulti= tipo + aux + "\n" + textareaOtro.getText() + "\n Correo:"+ mail.getText(); 
     textareaC.setText(ulti);
     JOptionPane.showMessageDialog(null, "Por favor asegurece de haber introducido su email correctamente\n si esta seguro, continue normalmente");
    }

    if(accion2.getSource() == limpiar){ //limpiar 
        textareaC.setText("");
        ulti="";
        asientosA="";
        auxA1="";auxA2="";auxA4="";auxA5="";auxA7="";auxA8="";auxA10="";auxA11="";
        auxB1="";auxB2="";auxB4="";auxB5="";auxB7="";auxB8="";auxB10="";auxB11="";
        asientosB="";
    }

    if(accion2.getSource() == reser){ //reservar 
     JOptionPane.showMessageDialog(null, "Completado con exito y agregado a su cuenta");
     Checar(iA1,iA2,iA4,iA5,iA7,iA8,iA10,iA11);
     
     }

    }//Fin del metodo

    public static void main(String args []){
		CompraMT1 jojo = new CompraMT1();
		jojo.setBounds(400,200,700,500); //x,y,ancho,alto
		jojo.setVisible(true);
		jojo.setResizable(false);
	}//Fin del main
	
	
}//Fin de la clase