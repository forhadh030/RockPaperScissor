package video_game;

import java.util.Scanner;

public interface Controller {
    public void Rules(String player, String computer) throws InterruptedException;
    void Score() throws InterruptedException;
}
