import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Grafico extends JFrame{
    private JPanel contentPane;
    private JTextField textfiel1,textfiel2,textfiel3;
    private boolean ban=false;
   
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run(){
	    try{
		Grafico frame = new Grafico();
		frame.setVisible(true);
	         }catch(Exception e){
		 e.printStackTrace();
		 }
	    }
	    
	});
    }
    public Grafico(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,800,600);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5,5,5,5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblCarrera = new JLabel("ISC:");
   lblCarrera.setBounds(46,39,61,14);
    //contentPane.add(lblCarrera);
    
    JLabel lblCarrera2 = new JLabel("IGE:");
    lblCarrera2.setBounds(46,69,61,14);
    contentPane.add(lblCarrera2);
    
    JLabel lblCarrera3 = new JLabel("IND:");
   lblCarrera3.setBounds(46,103,61,14);
    contentPane.add(lblCarrera3);

    JLabel lblCarrera4 = new JLabel("Hola");
   lblCarrera4.setBounds(46,103,61,14);
    contentPane.add(lblCarrera3);

    JLabel lblCarrera5 = new JLabel(":)");
   lblCarrera5.setBounds(46,103,61,14);
    contentPane.add(lblCarrera3);

    JLabel lblCarrera6 = new JLabel("D;");
   lblCarrera6.setBounds(46,103,61,14);
    contentPane.add(lblCarrera3);
    
    textfiel1 = new JTextField();
    textfiel1.setBounds(117,36,86,20);
    String texto = textfiel1.getText();
    contentPane.add(textfiel1);
    textfiel1.setColumns(15);
    
    textfiel2 = new JTextField();
    textfiel2.setBounds(117,66,86,20);
    contentPane.add(textfiel2);
    textfiel2.setColumns(15);
    
    textfiel3 = new JTextField();
    textfiel3.setBounds(117,97,86,20);
    contentPane.add(textfiel3);
    textfiel3.setColumns(15);
    
    JButton btnGraficar = new JButton("Graficar");
        btnGraficar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ban=true;
                repaint();
            }
        });
        btnGraficar.setBounds(45, 138, 107, 37);
        contentPane.add(btnGraficar);    
}
    public void paint(Graphics g){
	super.paint(g);
	if(ban == true){
	    String s1=textfiel1.getText();
            String s2=textfiel2.getText();
            String s3=textfiel3.getText();
            int v1=Integer.parseInt(s1);
            int v2=Integer.parseInt(s2);
            int v3=Integer.parseInt(s3);
            int suma=v1+v2+v3;
            int grados1=v1*360/suma;
            int grados2=v2*360/suma;
            int grados3=v3*360/suma;
	    g.setColor(new Color(255,0,0));
            g.fillArc(50,250,200,200,0,grados1);
            g.fillRect(370,250,20,20);
            g.drawString("ISC", 400, 270);            

            g.setColor(new Color(0,128,0));
            g.fillArc(50,250,200,200,grados1,grados2);
            g.fillRect(370,280,20,20);
            g.drawString("IGE", 400, 300);            

            g.setColor(new Color(0,0,255));
            g.fillArc(50,250,200,200,grados1+grados2,grados3);
            g.fillRect(370,310,20,20);
            g.drawString("IND", 400, 330);
	}
    }
    }
