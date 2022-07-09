package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
    void addCampaign(Campaign campaign, Game game, Game game2) throws Exception;
}
