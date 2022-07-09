package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService {
    public boolean checkIfRealPerson(Player player) throws Exception {
        if(player.getNationalIdentity().length() == 11){
            return true;
        }
        else{
            throw new Exception("Player " + player.getNickName() + " is not a real person. ");
        }
    }
}
