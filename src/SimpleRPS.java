public class SimpleRPS {
  public static void main(String[] args) {
    final int labelWidthPosition = (int)((MakeFrame.frameWidth - MakeLabel.labelWidth) / 2);
    final int labelHeightPosition = 20;
    final int buttonWidthPosition = (int)((MakeFrame.frameWidth - (MakeButton.buttonWidth * 3) - 14) / 4);
    final int buttonHeightPosition = (int)(MakeFrame.frameHeight / 2);
    
    MakeFrame mainFrame = new MakeFrame("Rock Paper Scissors");
    
    MakeLabel comLabel = new MakeLabel("Computer");
    comLabel.setBounds(labelWidthPosition, labelHeightPosition);
    comLabel.setText("Computer's choose");
    mainFrame.add(comLabel);
    
    MakeLabel userLabel = new MakeLabel("User");
    userLabel.setBounds(labelWidthPosition, labelHeightPosition + MakeLabel.labelHeight + 1);
    userLabel.setText("What will you choose?");
    mainFrame.add(userLabel);
    
    MakeLabel statusLabel = new MakeLabel("Status");
    statusLabel.setBounds(labelWidthPosition, labelHeightPosition + MakeLabel.labelHeight * 2 + 2);
    statusLabel.setText("Win / Lose");
    mainFrame.add(statusLabel);
    
    MakeButton rockButton = new MakeButton("Rock", userLabel, comLabel, statusLabel);
    rockButton.setBounds(buttonWidthPosition, buttonHeightPosition);
    mainFrame.add(rockButton);
    
    MakeButton paperButton = new MakeButton("Paper", userLabel, comLabel, statusLabel);
    paperButton.setBounds(buttonWidthPosition * 2 + MakeButton.buttonWidth, buttonHeightPosition);
    mainFrame.add(paperButton);
    
    MakeButton scissorsButton = new MakeButton("Scissors", userLabel, comLabel, statusLabel);
    scissorsButton.setBounds(buttonWidthPosition * 3 + MakeButton.buttonWidth * 2, buttonHeightPosition);
    mainFrame.add(scissorsButton);
  }
}
