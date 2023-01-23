package alain.ooppatterns.builder;

/**
 *
 * @author alain
 */
public class Test {
    public static void main(String[] args) {
           FootballPlayer player = new FootballPlayer.FootballPlayerBuilder("Alain", 50, 20).setKickingStrength(90).build();
           System.out.print(player.getName());
    }
}
