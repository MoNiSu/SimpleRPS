import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MakeLabel extends JLabel{
  private static final long serialVersionUID = -6646622787843219766L;
  
  final static int labelWidth = 200;
  final static int labelHeight = 30;
  
  public MakeLabel(String name) {
    super(name);
    
    this.setSize(labelWidth, labelHeight);
    this.setOpaque(true);
    this.setBorder(LineBorder.createBlackLineBorder());
    this.setBackground(Color.white);
    this.setHorizontalAlignment(JLabel.CENTER);
  }
  
  public void setBounds(int widthPosition, int heightPosition) {
    this.setBounds(widthPosition, heightPosition, labelWidth, labelHeight);
  }
}
