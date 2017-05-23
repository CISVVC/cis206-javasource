import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
    private JLabel output;
    private int count;

    public ClickListener(JLabel output)
    {
        this.output = output;
        this.count = 0;
    }

    public void actionPerformed(ActionEvent event)
    {
        count++;
        //System.out.println("I was clicked " + count + " times");
        this.output.setText("I was clicked " + count + " times");
    }
}
