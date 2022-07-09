package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
    public void register(Player player){
        System.out.println("Player "+ player.getNickName() +" registered to the system.");
    }

    public void update(Player player, String previousInfo, String newInfo){
        switch (previousInfo) {
            case "firstName" -> player.setFirstName(newInfo);
            case "lastName" -> player.setLastName(newInfo);
            case "nickName" -> player.setNickName(newInfo);
        }

        System.out.println("Player "+ player.getNickName() +"'s information updated");

    }
    public void delete(Player player){
        System.out.println("Player "+ player.getNickName() +" deleted from the system.");
    }

}
