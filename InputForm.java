package Day1;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InputForm extends Frame implements ActionListener{
	TextField name=new TextField(30);
	TextField number=new TextField(30);
	TextField department=new TextField(30);
	TextField email=new TextField(30);
	public InputForm() {
		setTitle("DETAILS COLLECTION");
		setSize(450,420);
		setVisible(true);
		 
		Button button;
		setLayout(null); 
		Label label1;
		Label l1= new Label("LOGIN FORM :");
		add(l1);
		l1.setBounds(200, 30, 100, 50);
		//  ****
		Label l2= new Label("NAME :");
		add(l2);
		l2.setBounds(50, 90, 100, 50);
		
		add(name);
		name.setBounds(150, 90, 160, 40);
		//   ****
		Label l3= new Label("NUMBER :");
		add(l3);
		l3.setBounds(50, 145, 100, 50);
		add(number);
		number.setBounds(150, 150, 160, 40);
		//   ****
		Label l4= new Label("DEPARTMENT :");
		add(l4);
		l4.setBounds(50, 200, 100, 50);
		add(department);
		department.setBounds(150, 200, 160, 40);
		//  ****
		Label l5=new Label("EMAIL :");
		add(l5);
		l5.setBounds(50, 260, 60, 40);
		add(email);
		email.setBounds(150, 260, 260, 40);
		
		 Checkbox checkbox1 = new Checkbox("  I am not a robot "); 
	     checkbox1.setBounds(175, 300, 500, 50);
	     add(checkbox1);
		
		Button b=new Button("SUBMIT");
		add(b);
		b.setBounds(170, 350, 100, 30);
		b.addActionListener(this);
		
		//window closing
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		//frame
		
	}
		public void actionPerformed(ActionEvent e) {
		  
			System.out.println("Name:    - "+name.getText());
			System.out.println("Number:  - "+number.getText());
			System.out.println("department:  - "+department.getText());
			System.out.println("email:  - "+email.getText());
		  
		}
		

	public static void main(String[] args) {
		InputForm IF =new InputForm();
		
	}
}