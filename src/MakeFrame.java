import javax.swing.JFrame;

public class MakeFrame extends JFrame {
  private static final long serialVersionUID = 4391095135974946002L;
  
  final static int frameWidth = 400;
  final static int frameHeight = 300;

  public MakeFrame(String name) {
    super(name);
    
    this.setSize(frameWidth, frameHeight);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.getContentPane().setLayout(null);
    this.setVisible(true);
  }
}
