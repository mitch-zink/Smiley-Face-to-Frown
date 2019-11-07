//	Mitch Zink
//	Purpose: This code will display a face that can be toggled between smiling and frowning

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.awt.Color;

public class JSmileFace2 extends JFrame implements ActionListener {

// Initializes JButton and JPanel

JButton change = new JButton("Turn that frown upside down!");

JPanel panel = new JPanel();

int i = 0;


public JSmileFace2() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

add(panel); 

panel.setLayout(new FlowLayout());

// Sets the color to yellow
panel.setBackground(Color.YELLOW);

panel.add(change); // adds button

change.addActionListener(this); // allows button to receive user input

}

public void paint(Graphics draw1) {

super.paint(draw1);

Graphics2D draw = (Graphics2D) draw1;

draw.drawOval(50, 170, 70, 70); // face

draw.fillOval(73, 185, 3, 5); // left eye

draw.fillOval(93, 185, 3, 5); // right eye

// Frowns = Odd #

if (i % 2 == 0) {

draw.drawArc(48, 200, 75, 75, 30, 120); // frown

}

// Smiles = Even #

else {

draw.drawArc(48, 150, 75, 75, 210, 120); // smile

}

}

// Button press = action event

public void actionPerformed(ActionEvent arg0) {

i++; 

repaint(); // This will call the paint method again

}

public static void main(String[] args) {

// This creates the window

JSmileFace2 window = new JSmileFace2();

window.setVisible(true);

window.setSize(300, 300);

}

}

