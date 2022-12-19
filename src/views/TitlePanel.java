package views;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel{
    
    JLabel mainLabel;

    public TitlePanel() {
        mainLabel = new JLabel("Rombus Területének és Kerületének kiszámítása.");  
        add(mainLabel);
    }
    
}
