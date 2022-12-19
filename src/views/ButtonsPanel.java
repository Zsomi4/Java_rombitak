/*
* File: ButtonsPanel.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel
* Group: Szoft_II_N
* Date: 2022-12-19
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/
package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel 
{
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonsPanel() 
    {
        calcButton = new JButton("Számít");
        aboutButton = new JButton("Névjegy");
        addComponents();
    }

    public void addComponents() 
    {
        add(calcButton);
        add(aboutButton);
    }
    
}