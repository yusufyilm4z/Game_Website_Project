package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {
    private Game[] games;


    public void sellToPlayer(Game game, Player player){
        System.out.println(player.getNickName() + " has bought " + game.getName() + " for $" + game.getPrice() + ".");
    }

    public void sellCampaignGames(Game[] games, Player player){
        for (Game game : games){
            if (game.getPrice()==(double)0)
                System.out.println(player.getNickName() + " has bought " + game.getName() + " for free.");
            else
                System.out.println(player.getNickName() + " has bought " + game.getName() + " for $" + game.getPrice() + ".");
        }
    }
}
