package Entities;

public class Campaign{
    private String name;
    private String campaignDescription;

    public Campaign(String name, String campaignDescription) {
        this.name = name;
        this.campaignDescription = campaignDescription;
    }

    public void discount(Game game, double discountPercentage) //makes discount on selected game.
    {
        game.setPrice(game.getPrice() - (discountPercentage/100 * game.getPrice()));
    }

    public void twoForOneDeal(Game game, Game game2) //if player buys two games, second game is free.
    {
        game2.setPrice(0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }


}
