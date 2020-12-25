public class Duel {
  public static String Duel(int playerRps, int comRps) {
    switch (playerRps - comRps) {
    case 0:
      return "Draw";
    case 1: case -2:
      return "Win";
    case -1: case 2:
      return "Lose";
    default:
      return (String) null;
    }
  }
}
