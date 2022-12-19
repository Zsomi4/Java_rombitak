package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainView extends JFrame {

    TitlePanel titlePanel;
    public AsitePanel asitePanel;
    public AlphaPanel alphaPanel;
    public AreaPanel areaPanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;

    public MainView() {

    }

    public void initWindow() {
        setIconImage(new ImageIcon("logo.png").getImage());
        setTitle("Rombitak");
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        addComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void addComponents() {
        
    }
    
}
