package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
    public void addCampaign(Campaign campaign, Game game, Game game2) {
        if (campaign.getName().equals("discount")){
            campaign.discount(game,50);
            System.out.println("Campaign '"+ campaign.getName() + "' has been added.");
        }

        if(campaign.getName().equals("TwoForOneDeal")){
            campaign.twoForOneDeal(game, game2);
            System.out.println("Campaign '"+ campaign.getName() + "' has been added.");
        }
    }


    public void updateCampaign(Campaign campaign, Game game) {
        campaign.discount(game,30);
        System.out.println("Campaign '"+ campaign.getName() + "' has been updated.");
    }

    public void deleteCampaign(Campaign campaign) {
        System.out.println("Campaign '"+ campaign.getName() + "' has been deleted.");
    }
}
