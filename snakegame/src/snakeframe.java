import javax.swing.JFrame;

public class snakeframe extends JFrame{
    snakeframe(){
        //intializiing pannel
        this.add(new panel());
        this.setTitle("Snake Game");
        //ensuring that the size of frame window cannot be changes
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        //setting the frame in the center of the screen
        this.setLocationRelativeTo(null);
    }
}
