package Abstract;

import Entities.Game;
import Entities.Player;

public interface GameService {
    void sellToPlayer(Game game, Player player);
    void sellCampaignGames(Game[] games, Player player);
}
