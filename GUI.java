
/**
 * This is a class which contain array list and stores Academic and Non-Academic Course
 * @author (Bikal Dhimal)
 * @Date (11 Sep, 2021)
 * Copyright Issue : Bikal Dhimal
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI {
    private JFrame frame;
    private JLabel lblName, lblAddress, lblQualification, lblPhone, lblEmail, lblExperience, lblYear, lblMonth,
            lblPlatform, lblDOB, lblGender;
    private JTextField txtName, txtAddress, txtPhone, txtEmail, txtExperiences, txtYear;
    private JComboBox comQualification, comPlatform;
    private JRadioButton maleRBtn, femaleRBtn;
    private JButton btnSubmit;

    public void myGUI() {

        frame = new JFrame("JOB APPLICATION");
        frame.getContentPane().setBackground(new Color(10, 45, 50));

        lblName = new JLabel("Name");
        lblName.setBounds(60, 30, 105, 30);
        lblName.setForeground(Color.WHITE);
        frame.add(lblName);

        lblAddress = new JLabel("Address");
        lblAddress.setBounds(60, 80, 150, 30);
        lblAddress.setForeground(Color.WHITE);
        frame.add(lblAddress);

        lblQualification = new JLabel("Qualification");
        lblQualification.setBounds(60, 130, 150, 30);
        lblQualification.setForeground(Color.WHITE);
        frame.add(lblQualification);

        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(60, 180, 150, 30);
        lblPhone.setForeground(Color.WHITE);
        frame.add(lblPhone);

        lblEmail = new JLabel("Email");
        lblEmail.setBounds(60, 230, 150, 30);
        lblEmail.setForeground(Color.WHITE);
        frame.add(lblEmail);

        lblExperience = new JLabel("Experience");
        lblExperience.setBounds(60, 280, 150, 30);
        lblExperience.setForeground(Color.WHITE);
        frame.add(lblExperience);

        lblYear = new JLabel("Year");
        lblYear.setBounds(260, 280, 150, 30);
        lblYear.setForeground(Color.WHITE);
        frame.add(lblYear);

        lblMonth = new JLabel("Month");
        lblMonth.setBounds(440, 280, 150, 30);
        lblMonth.setForeground(Color.WHITE);
        frame.add(lblMonth);

        lblPlatform = new JLabel("Platform");
        lblPlatform.setBounds(60, 330, 150, 30);
        lblPlatform.setForeground(Color.WHITE);
        frame.add(lblPlatform);

        lblDOB = new JLabel("DOB");
        lblDOB.setBounds(60, 380, 150, 30);
        lblDOB.setForeground(Color.WHITE);
        frame.add(lblDOB);

        lblGender = new JLabel("Gender");
        lblGender.setBounds(60, 430, 150, 30);
        lblGender.setForeground(Color.WHITE);
        frame.add(lblGender);

        txtName = new JTextField();
        txtName.setBounds(150, 30, 200, 30);
        txtName.setForeground(Color.BLACK);
        frame.add(txtName);

        txtAddress = new JTextField();
        txtAddress.setBounds(150, 80, 200, 30);
        txtAddress.setForeground(Color.BLACK);
        frame.add(txtAddress);

        String[] qualification = { "SLC", "Bachelor", "Masters", "Phd" };
        comQualification = new JComboBox(qualification);
        comQualification.setBounds(150, 130, 200, 30);
        comQualification.setForeground(Color.BLACK);
        frame.add(comQualification);

        txtPhone = new JTextField();
        txtPhone.setBounds(150, 180, 200, 30);
        txtPhone.setForeground(Color.BLACK);
        frame.add(txtPhone);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 230, 200, 30);
        txtEmail.setForeground(Color.BLACK);
        frame.add(txtEmail);

        txtExperiences = new JTextField();
        txtExperiences.setBounds(150, 280, 100, 30);
        txtExperiences.setForeground(Color.BLACK);
        frame.add(txtExperiences);

        txtYear = new JTextField();
        txtYear.setBounds(330, 280, 100, 30);
        txtYear.setForeground(Color.BLACK);
        frame.add(txtYear);

        String[] platform = { "Select one", "BIT", "BBA" };
        comPlatform = new JComboBox(platform);
        comPlatform.setBounds(150, 330, 200, 30);
        comPlatform.setForeground(Color.BLACK);
        frame.add(comPlatform);

        String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        comPlatform = new JComboBox(month);
        comPlatform.setBounds(150, 380, 80, 30);
        comPlatform.setForeground(Color.BLACK);
        frame.add(comPlatform);

        String[] date = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32" };
        comPlatform = new JComboBox(date);
        comPlatform.setBounds(250, 380, 80, 30);
        comPlatform.setForeground(Color.BLACK);
        frame.add(comPlatform);

        String[] year = { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" };
        comPlatform = new JComboBox(year);
        comPlatform.setBounds(350, 380, 90, 30);
        comPlatform.setForeground(Color.BLACK);
        frame.add(comPlatform);

        maleRBtn = new JRadioButton("Male");
        femaleRBtn = new JRadioButton("Female");
        maleRBtn.setBounds(150, 430, 100, 30);
        femaleRBtn.setBounds(210, 430, 100, 30);
        maleRBtn.setForeground(Color.WHITE);
        maleRBtn.setBackground(Color.WHITE);
        femaleRBtn.setForeground(Color.WHITE);
        femaleRBtn.setBackground(Color.WHITE);
        ButtonGroup bg = new ButtonGroup();
        bg.add(maleRBtn);
        bg.add(femaleRBtn);
        frame.add(maleRBtn);
        frame.add(femaleRBtn);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(0, 470, 520, 34);
        btnSubmit.setForeground(Color.BLACK);
        btnSubmit.setBackground(new Color(196, 238, 255));
        btnSubmit.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSubmit.setOpaque(true);
        frame.add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent display) {
                JOptionPane.showMessageDialog(frame, "Your form has been submitted", "Status", 1);
            }
        });

        frame.setLayout(null);
        frame.setSize(500, 530);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui1 = new GUI();
        gui1.myGUI();
    }

}