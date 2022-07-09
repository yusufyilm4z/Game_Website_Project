import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Programme {
    public static void main(String[] args) {
        //creating objects.
        Player player1 = new Player("John", "Doe", "12345678901","2000","slasher");
        Player player2 = new Player("Adam", "Smith", "12345678902","1997","youngBoomer");
        Game game1 = new Game("Call of Duty", 129);
        Game game2 = new Game("Counter Strike", 249);
        Game game3 = new Game("Fifa", 159);
        Campaign campaign1 = new Campaign("discount", "50% discount on Call of Duty");
        Campaign campaign2 = new Campaign("TwoForOneDeal", "Two for one deal on Counter Strike and Fifa");

        //testing some functions of objects.
        PlayerManager playerManager = new PlayerManager();
        playerManager.update(player2, "firstName", "Michael");
        System.out.println(player2.getFirstName());

        System.out.println();

        GameManager gameManager = new GameManager();
        gameManager.sellToPlayer(game1, player1);

        System.out.println();

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign1,game1,game2);
        gameManager.sellToPlayer(game1,player2);

        System.out.println();

        campaignManager.addCampaign(campaign2,game1,game3);
        Game[] games = {game1, game3}; //to print games one by one with their own price.
        gameManager.sellCampaignGames(games ,player2);

        System.out.println();

        campaignManager.updateCampaign(campaign1,game1); //it works for one campaign.
        gameManager.sellToPlayer(game1,player2);

        System.out.println();

        campaignManager.deleteCampaign(campaign1);


    }
}
