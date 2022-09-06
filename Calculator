import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{
public int i,u=0;
public float v11,v22,R1,aux,total;
public String fi,aux1;
public JButton botonSum, botonRes, botonM, botonD,i1,i2,i3,i4,i5,i6,i7,i8,i9,i0,CE,igual;
public JTextField Monitor;

//constructor 
  public Calculadora(){   
	setLayout(null);
	setTitle("Calculadora_3000_19310408");
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	Monitor =new JTextField();
	Monitor.setBounds(0,10,200,30);//x,y, ancho y altura
	add(Monitor);
	
	botonSum = new JButton ("+");
	botonSum.setBounds(150,110,50,30);//x,y, ancho y altura  
	add(botonSum);
	
	botonRes = new JButton ("-");
	botonRes.setBounds(200,50,50,30);//x,y, ancho y altura
	add(botonRes);

	botonM = new JButton ("*");
	botonM.setBounds(200,80,50,30);//x,y, ancho y altura
	add(botonM);

	botonD = new JButton ("/");
	botonD.setBounds(200,110,50,30);//x,y, ancho y altura
	add(botonD);
///////////////////////////////////////////////numeros 123
	i1 = new JButton ("1");
	i1.setBounds(0,50,50,30);//x,y, ancho y altura
	add(i1);
	i2 = new JButton ("2");
	i2.setBounds(0,80,50,30);//x,y, ancho y altura
	add(i2);
	i3= new JButton ("3");
	i3.setBounds(0,110,50,30);//x,y, ancho y altura
	add(i3);
////////////////////////////////////456
	i4= new JButton ("4");
	i4.setBounds(50,50,50,30);//x,y, ancho y altura
	add(i4);
	i5 = new JButton ("5");
	i5.setBounds(50,80,50,30);//x,y, ancho y altura
	add(i5);
	i6= new JButton ("6");
	i6.setBounds(50,110,50,30);//x,y, ancho y altura
	add(i6);
////////////////////////////////////789
	i7 = new JButton ("7");
	i7.setBounds(100,50,50,30);//x,y, ancho y altura
	add(i7);
	i8 = new JButton ("8");
	i8.setBounds(100,80,50,30);//x,y, ancho y altura
	add(i8);
	i9 = new JButton ("9");
	i9.setBounds(100,110,50,30);//x,y, ancho y altura
	add(i9);
/////////////////////////////////0 ce e =
	i0 = new JButton ("0");
	i0.setBounds(150,50,50,30);//x,y, ancho y altura
	add(i0);
	CE = new JButton ("CE");
	CE.setBounds(150,80,50,30);//x,y, ancho y altura
	add(CE);
	igual = new JButton ("=");
	igual.setBounds(200,10,50,30);//x,y, ancho y altura
	add(igual);
/////////////////////////////////
	botonSum.addActionListener(this);
	botonRes.addActionListener(this);
	botonM.addActionListener(this);
	botonD.addActionListener(this);
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	i4.addActionListener(this);
	i5.addActionListener(this);
	i6.addActionListener(this);
	i7.addActionListener(this);
	i8.addActionListener(this);
	i9.addActionListener(this);
	i0.addActionListener(this);
	CE.addActionListener(this);
	igual.addActionListener(this);
	

  }// fin del constructor 

  public void actionPerformed(ActionEvent accion){  //inicio accion
	
	if(accion.getSource()==i1){
	  if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+1;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	
	}

	if(accion.getSource()==i2){
	if(u==0){Monitor.setText("0");}
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+2;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}


	if(accion.getSource()==i3){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+3;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i4){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+4;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i5){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+5;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i6){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+6;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i7){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+7;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i8){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+8;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i9){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+9;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==i0){
	if(u==0){Monitor.setText("0");}
		
		aux=Float.parseFloat(Monitor.getText());
		aux=(aux*10);
		total=aux+0;
		aux1=Float.toString(total);
		Monitor.setText(aux1);
		u++;
	}

	if(accion.getSource()==botonSum){
	 v11=Float.parseFloat(Monitor.getText());
	 i=1;
	 u=0;
	 Monitor.setText("");
	}


	if(accion.getSource()==botonRes){
	 v11=Float.parseFloat(Monitor.getText());
	 i=2;
	u=0;
	 Monitor.setText("");
	}
	
	if(accion.getSource()==botonM){
	 v11=Float.parseFloat(Monitor.getText());
	 i=3;
	u=0;
	 Monitor.setText("");
	}

	if(accion.getSource()==botonD){
	 v11=Float.parseFloat(Monitor.getText());
	 i=4;
	u=0;
	 Monitor.setText("");	
	}

	if(accion.getSource()==CE){
	Monitor.setText("");
	u=0;
	}

	if(accion.getSource()==igual){
	v22=Float.parseFloat(Monitor.getText());
	u=0;
	
	 	if(i==1){
               R1=v11+v22;
	       fi= Float.toString(R1);
	       Monitor.setText(fi);}

          	if(i==2){
                R1=v11-v22;
	        fi= Float.toString(R1);
	        Monitor.setText(fi);}
              
                
            	if(i==3){
                R1=v11*v22;
	        fi= Float.toString(R1);
	        Monitor.setText(fi);}
               
                if(i==4){
		if(v11==0||v22==0){Monitor.setText("Benito Juarez..Digo Math Error");}
		else{
                R1=v11/v22;
	        fi= Float.toString(R1);
	        Monitor.setText(fi);} }
                
	
	}
	

  }// fin accion 


public static void main(String args[]){

Calculadora Mi = new Calculadora();
Mi.setBounds(200,200,300,200);//x,y, ancho y altura
Mi.setVisible(true);


}//fin main 

}//Fin clase 
