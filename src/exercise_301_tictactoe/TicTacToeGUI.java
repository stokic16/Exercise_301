

package exercise_301_tictactoe;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Kilian Stöckler
 */
public class TicTacToeGUI extends JFrame{

    public TicTacToeGUI() throws HeadlessException {
    
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));
        TicTacToeBL bl = new TicTacToeBL();
        
        JButton[][] buttons = new JButton[3][3];
        for (int i = 0; i < buttons.length; i++) {
            JButton[] rows = buttons[i];
            for (int j = 0; j < rows.length; j++) {
                JButton button = new JButton("~");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        new TicTacToeGUI().setVisible(true);
    }

}
