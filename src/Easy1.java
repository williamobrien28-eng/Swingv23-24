import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;



    public Easy1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy1 swingControlDemo = new Easy1();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

        //menu at top





        //end menu at top

       // ta = new JTextArea();
       // ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
       // mainFrame.add(mb);  //add menu bar
      //  mainFrame.add(ta);//add typing area
       // mainFrame.setJMenuBar(mb); //set menu bar

        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
       // controlPanel = new JPanel();
      //  controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel

        //mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton Button1 = new JButton("Button 1");
        JButton Button2 = new JButton("Button 2");
        JButton Button3 = new JButton("Button 3");
        JButton Button4 = new JButton("Button 4");
        JButton Button5 = new JButton("Button 5");
        JButton Button6 = new JButton("Button 6");
        JButton Button7 = new JButton("Button 7");
        JButton Button8 = new JButton("Button 8");






        Button1.setActionCommand("Button 1");
        Button2.setActionCommand("Button 2");
        Button3.setActionCommand("Button 3");
        Button4.setActionCommand("Button 4");
        Button5.setActionCommand("Button 5");
        Button6.setActionCommand("Button 6");
        Button7.setActionCommand("Button 7");
        Button8.setActionCommand("Button 8");


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        JLabel centerLabel = new JLabel("label", JLabel.CENTER);
        JButton Button9 = new JButton("button 9");
        JButton Button10 = new JButton("button 10");

        centerPanel.add(centerLabel, BorderLayout.WEST);
        centerPanel.add(Button9, BorderLayout.EAST);
        centerPanel.add(Button10, BorderLayout.SOUTH);

        mainFrame.add(Button1);
        mainFrame.add(Button2);
        mainFrame.add(Button3);

        mainFrame.add(Button4);
        mainFrame.add(centerPanel);
        mainFrame.add(Button5);

        mainFrame.add(Button6);
        mainFrame.add(Button7);
        mainFrame.add(Button8);

        mainFrame.setVisible(true);






        Button1.addActionListener(new ButtonClickListener());
        Button2.addActionListener(new ButtonClickListener());
        Button3.addActionListener(new ButtonClickListener());
        Button4.addActionListener(new ButtonClickListener());
        Button5.addActionListener(new ButtonClickListener());









        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}