package Sendemail;
import FIRST.FIRST;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.util.Properties;


public abstract class Sendemail extends Component implements MenuListener {
    JFrame frm;
    JPanel pnl;
    JMenu m1, m2, m3, m4;
    JMenuBar mbr;
    JPanel p1, p2, p3, p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    JLabel msg,nme,gml,gmlpass,sub,text,to;
    JTextField nme1,gml1,sub1,to1;
    JPasswordField gmlpass1;
    JTextArea text1;
    JButton b1,b2;
    JComboBox box;
    String nmes,gmls,gmlpasss,subs,texts,tos,tm1;
    JTextField timel2;
    public Sendemail() {
        frm = new JFrame();
        pnl = new JPanel();

        ///////////////////////menu/////////////////////////
        mbr = new JMenuBar();

        m1 = new JMenu("HOME");
        m2 = new JMenu("SOON");
        m3 = new JMenu("SOON");
        m4 = new JMenu("SOON");


        ///////////menubr///////////////////////////
        mbr.add(m1);
        mbr.add(m2);
        mbr.add(m3);
        mbr.add(m4);

        /////////////////////////////menu size////////////////////
        m1.setFont(new Font("SIZE", Font.BOLD, 25));
        m2.setFont(new Font("SIZE", Font.BOLD, 25));
        m3.setFont(new Font("SIZE", Font.BOLD, 25));
        m4.setFont(new Font("SIZE", Font.BOLD, 25));

        //////////////////////////menubr////////////////////////
        mbr.setPreferredSize(new Dimension(100, 50));
        mbr.setBackground(Color.red);

        ////////////////////////boder/////////////////////////////
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        p7=new JPanel();
        p8=new JPanel();
        p9=new JPanel();
        p10=new JPanel();
        p11=new JPanel();
        p12=new JPanel();
        p13=new JPanel();

        p1.setBackground(Color.red);
        p2.setBackground(Color.red);
        p3.setBackground(Color.red);
        p4.setBackground(Color.red);
        p5.setBackground(Color.red);

        p6.setBackground(Color.red);
        p7.setBackground(Color.red);

        p8.setBackground(Color.blue);
        p9.setBackground(Color.cyan);
        p10.setBackground(Color.YELLOW);

        p11.setBackground(Color.blue);
        p12.setBackground(Color.cyan);
        p13.setBackground(Color.YELLOW);



        p1.setBounds(0, 0, 1110, 15);
        p2.setBounds(0, 15, 15, 715);
        p3.setBounds(1095, 0, 15, 715);
        p4.setBounds(0, 670, 1110, 15);
        p5.setBounds(0,55,1110,15);

        p6.setBounds(315,55,15,715);
        p7.setBounds(780,55,15,715);


        p8.setBounds(5,55,80,700);
        p9.setBounds(85,55,80,700);
        p10.setBounds(165,55,80,700);

        p13.setBounds(860,55,80,700);
        p12.setBounds(940,55,80,700);
        p11.setBounds(1020,55,80,700);

        pnl.add(p1);
        pnl.add(p2);
        pnl.add(p3);
        pnl.add(p4);
        pnl.add(p5);
        pnl.add(p6);
        pnl.add(p7);
        pnl.add(p8);
        pnl.add(p9);
        pnl.add(p10);
        pnl.add(p11);
        pnl.add(p12);
        pnl.add(p13);

        design();
        datetime();


    }

    public void Sendemaildisplay() {
        frm.setLayout(null);
        pnl.setLayout(null);
        frm.setSize(1124, 768);
        pnl.setSize(1124, 768);
        frm.setResizable(false);
        pnl.setBackground(Color.green);
        frm.setJMenuBar(mbr);
        frm.add(pnl);
        m1.addMenuListener(this);
        frm.setVisible(true);
    }
    public void design()
    {
        msg=new JLabel("SEND MASSAGE");
        nme=new JLabel("ENTER YOUR NAME:");
        gml=new JLabel("GOOGLE ACCOUNT EMAIL");
        gmlpass=new JLabel("GOOGLE EMAIL PASSWORD");
        sub=new JLabel("ENTER SUBJECT");
        text=new JLabel("ENTER YOUR PROBLEM");
        to=new JLabel("SEND MESSAGE");

        nme1=new JTextField();
        gml1=new JTextField();
        gmlpass1=new JPasswordField();
        sub1=new JTextField();
        text1=new JTextArea();
        to1=new JTextField();

        String typ[]={"SELECT","CENTRAL","ANY OTHER PERSON"};
        box=new JComboBox(typ);

        b1=new JButton("SEND MESSAGE");
        b2=new JButton("RESET");

        msg.setFont(new Font("size",Font.BOLD,25));

        nme.setFont(new Font("size",Font.BOLD,20));
        gml.setFont(new Font("size",Font.BOLD,20));
        gmlpass.setFont(new Font("size",Font.BOLD,20));
        sub.setFont(new Font("size",Font.BOLD,20));
        text.setFont(new Font("size",Font.BOLD,20));
        to.setFont(new Font("size",Font.BOLD,20));

        nme1.setFont(new Font("size",Font.BOLD,20));
        gml1.setFont(new Font("size",Font.BOLD,20));
        gmlpass1.setFont(new Font("size",Font.BOLD,20));
        sub1.setFont(new Font("size",Font.BOLD,20));
        text1.setFont(new Font("size",Font.BOLD,20));
        to1.setFont(new Font("size",Font.BOLD,20));

        box.setFont(new Font("size",Font.BOLD,20));

        b1.setFont(new Font("size",Font.BOLD,20));
        b2.setFont(new Font("size",Font.BOLD,20));

        msg.setForeground(Color.red);

        msg.setBounds(470,15,300,40);
        box.setBounds(330,75,450,35);
        nme.setBounds(330,115,300,30);
        nme1.setBounds(330,150,450,35);
        gml.setBounds(330,190,300,30);
        gml1.setBounds(330,225,450,35);
        gmlpass.setBounds(330,265,300,30);
        gmlpass1.setBounds(330,300,450,35);
        sub.setBounds(330,340,300,30);
        sub1.setBounds(330,375,450,35);
        to.setBounds(330,415,300,30);
        to1.setBounds(330,450,450,35);
       text.setBounds(330,490,300,30);
        text1.setBounds(330,525,450,80);
        b1.setBounds(330,620,210,40);
        b2.setBounds(570,620,210,40);




        pnl.add(msg);
        pnl.add(box);
        pnl.add(gml);
        pnl.add(nme);
        pnl.add(nme1);
        pnl.add(gml1);
        pnl.add(gmlpass);
        pnl.add(gmlpass1);
        pnl.add(sub);
        pnl.add(sub1);
        pnl.add(text);
        pnl.add(text1);
        pnl.add(b1);
        pnl.add(b2);
        pnl.add(to);
        pnl.add(to1);
        ////////////////////////////////////////////////clor/////////////////////
        nme.setForeground(Color.blue);//,nme,gml,gmlpass,sub,text,to;
        nme1.setBackground(Color.red);
        nme1.setForeground(Color.blue);

        gml.setForeground(Color.blue);
        gml1.setBackground(Color.red);
        gml1.setForeground(Color.blue);

        box.setBackground(Color.red);
        box.setForeground(Color.blue);

        gmlpass.setForeground(Color.blue);
        gmlpass1.setBackground(Color.red);
        gmlpass1.setForeground(Color.blue);

        text.setForeground(Color.blue);
        text1.setBackground(Color.orange);
        text1.setForeground(Color.blue);

        to.setForeground(Color.blue);
        to1.setBackground(Color.red);
        to1.setForeground(Color.blue);

        gml.setForeground(Color.blue);
        gml1.setBackground(Color.red);
        gml1.setForeground(Color.blue);

        sub.setForeground(Color.blue);
        sub1.setBackground(Color.red);
        sub1.setForeground(Color.blue);

        b1.setForeground(Color.blue);
        b1.setBackground(Color.red);
        b2.setForeground(Color.blue);
        b2.setBackground(Color.red);






        /////////////////////////////////////////////////set-condition//////////////////////////////////////////
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String se=""+box.getSelectedItem();
                to1.setText("");
                if(se.equals("CENTRAL"))
                {
                    to1.setText("kumarrupesh28239@gmail.com");
                    to1.setEditable(false);
                }
                else if(se.equals("ANY OTHER PERSON"))
                {
                    to1.setText("");
                    to1.setEditable(true);
                }
                else
                {
                    to1.setText("");
                    to1.setEditable(false);
                }
            }
        });

        //////////////////////////////////button -action///////////////////////////////////////
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myeml();
            }
        });

    }

    ///////////////////////////////////datetime/////////////////////////////
    public void datetime()
    {


        timel2= new JTextField();
        timel2.setForeground(Color.blue);
        timel2.setBackground(Color.yellow);
        timel2.setFont(new Font("size",Font.BOLD,20));
        timel2.setEditable(false);
        timel2.setBounds(770,15,300,40);
        pnl.add(timel2);
        Timer mer=new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timel2.setText(DateFormat.getDateTimeInstance().format((new java.util.Date())));
                tm1=timel2.getText();
            }
        });
        mer.setRepeats(true);
        mer.setCoalesce(true);
        mer.setInitialDelay(0);
        mer.start();

    }

    ////////////////////////////////////////////////email-send /////////////////////////////////////
    public void myeml()
    {
        nmes=nme1.getText();
        gmlpasss= String.valueOf(gmlpass1.getPassword());
        gmls=gml1.getText();
        subs=sub1.getText();
        tos=to1.getText();
        texts=text1.getText();

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(gmls,gmlpasss);
                    }
                });

        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(tos));
            message.setSubject(subs.toUpperCase());
            message.setText("NAME:"+nmes.toUpperCase()+"= "+texts.toUpperCase());
            //send message
            Transport.send(message);
            JOptionPane.showMessageDialog(this,"MASSAGE SEND","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception px)
        {
            JOptionPane.showMessageDialog(this,"YOUR EMAIL AND PASSWORD NOT MATCH","UNSUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this,"AND YOUR INTERNET CONNECTION CHECK","UNSUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
        }


    }

    public void menuSelected(MenuEvent nect) {
        if (nect.getSource() == m1) {
            FIRST ST = new FIRST();
            ST.FIRSTDISPLAY();
            frm.setVisible(false);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}