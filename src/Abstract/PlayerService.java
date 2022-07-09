package Abstract;

import Entities.Player;

public interface PlayerService {
    public void register(Player player);
    public void update(Player player, String previousInfo, String newInfo);
    public void delete(Player player);

}
