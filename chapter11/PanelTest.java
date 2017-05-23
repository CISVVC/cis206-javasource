import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelTest
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setTitle("Empty Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Hello, World!");
        JPanel panel = new JPanel();
        ClickListener listen = new ClickListener(label);
        button.addActionListener(listen);

        panel.add(button);
        panel.add(label);
        frame.add(panel);


        frame.setVisible(true);
    }
}
