import java.io.*;
import java.awt.*;
import java.awt.event.*;

class NotePad extends Frame implements ActionListener
{
  TextArea ta;
  TextField tf;
  Button b;
  
  public static void main(String args[])
  {
	  Frame f = new NotePad();
  }
  
  NotePad()
  {
	  super("Notepad");
	  ta = new TextArea();
	  tf = new TextField(35);
	  b = new Button("Show");
	  
	  Panel p = new Panel();
	  p.add(tf);
	  p.add(b);
	  b.addActionListener(this);
	  add(ta);
	  add("South",p);
	  setSize(800,600);
	  setVisible(true);
	  //tf.request(focus);
	  setVisible(true);
  }  
	  public void actionPerformed(ActionEvent ae)
	  {
		FileInputStream fs = null;
        BufferedReader br = null;
        String s = ae.getActionCommand();
        String str = null;
        
        if(s.equals("Show"))
		{
			try
			{
				fs = new FileInputStream(tf.getText().trim());
				br = new BufferedReader(new InputStreamReader(fs));
				boolean first = true;
				while((str=br.readLine())!=null)
				{
					if(first)
					{
						ta.append(str);
						first=false;
					}
					else
					{
						ta.append("\n"+str);
					}
				}
				ta.setCaretPosition(0);
				ta.requestFocus();
			}
			catch(Exception oe)
			{
				System.out.println(oe);
			}
			finally
			{
				if(fs!=null)
				{
					try{fs.close();}
					catch(Exception oe1){}
				}
			}
		}			
	  }
  }