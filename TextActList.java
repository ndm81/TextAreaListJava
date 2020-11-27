import java.awt.*;
import java.awt.event.*;
class TextActList extends Frame implements ActionListener{
	TextField t1,t2,t3;
	Button b1,b2;
	TextActList(){
		t1=new TextField();
		t1.setBounds(80,100,80,30);
		t2=new TextField();
		t2.setBounds(80,150,80,30);
		t3=new TextField();
		t3.setBounds(80,200,80,30);
	    t3.setEditable(true);
	    b1=new Button("+");
		b1.setBounds(80,250,80,30);
		b2=new Button("-");
		b2.setBounds(80,300,80,30);
		b1.addActionListener(this);
        b2.addActionListener(this);
	    add(t1);add(t2);add(t3);add(b1);add(b2);
	    setSize(400,400);
	    setLayout(null);
	    setVisible(true);
	}
	  public void actionPerformed(ActionEvent e)  {
	   	String s1=t1.getText();
	   	String s2=t2.getText();
	   	int a=Integer.parseInt(s1);
	   	int b=Integer.parseInt(s2);
	   	int c=0;
	   	if(e.getSource()==b1){
	   		c=a+b;
	   	}else if(e.getSource()==b2){
	   	        c=a-b;

	   	   }

	   	   String result=String.valueOf(c);
	   	   t3.setText(result);

	   }
	   public static void main(String[] args) {
	   	new TextActList();
	   }
	}