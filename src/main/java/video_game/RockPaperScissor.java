// RockPaperScissor.java
package video_game;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class RockPaperScissor implements Controller {

    private int win;
    private int loss;
    private int tie;

    public RockPaperScissor() {
        win = 0;
        loss = 0;
        tie = 0;
    }

    public void Score() throws InterruptedException {
        System.out.println("Your score so far are...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        System.out.println("Ties: " + tie);
    }

    @Override
    public void Rules(String player, String computer) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1); // Adding a slight delay for suspense

        if (player.equals(computer)) {
            System.out.println("It's a tie!");
            tie++;
        } else if ((player.equals("Rock") && computer.equals("Scissor"))
                || (player.equals("Paper") && computer.equals("Rock"))
                || (player.equals("Scissor") && computer.equals("Paper"))) {
            System.out.println("You Win!");
            win++;
        } else {
            System.out.println("You Lose! LOSER!");
            loss++;
        }
        System.out.println();
        Score();
    }
}
