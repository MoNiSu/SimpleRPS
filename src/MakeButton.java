import java.util.Random;
import javax.swing.JButton;

public class MakeButton extends JButton {
  private static final long serialVersionUID = 6479844065494508615L;
  
  final static int buttonWidth = 100;
  final static int buttonHeight = 80;

  public MakeButton(String name, MakeLabel userLabel, MakeLabel comLabel, MakeLabel statusLabel) {
    super(name);
    
    this.setSize(buttonWidth, buttonHeight);
    this.addActionListener(event -> {
      int num = 0;
      
      switch (name) {
      case "Rock":
        num = 0;
        break;
      case "Paper":
        num = 1;
        break;
      case "Scissors":
        num = 2;
        break;
      }
      
      Random rand = new Random();
      int comRps = rand.nextInt(3);
      
      userLabel.setText(name);
      switch (comRps) {
      case 0:
        comLabel.setText("Rock");
        break;
      case 1:
        comLabel.setText("Paper");
        break;
      case 2:
        comLabel.setText("Scissors");
        break;
      }
      statusLabel.setText(Duel.Duel(num, comRps));
    });
  }

  public void setBounds(int widthPosition, int heightPosition) {
    this.setBounds(widthPosition, heightPosition, buttonWidth, buttonHeight);
  }
}
