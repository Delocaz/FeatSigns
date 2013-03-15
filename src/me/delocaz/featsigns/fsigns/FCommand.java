package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class FCommand implements FSign {
    @Override
    public void onActivate(Player p, Sign s) {
        String cmd = s.getLines()[1]+s.getLines()[2]+s.getLines()[3];
        p.performCommand(cmd);
    }

    @Override
    public String getName() {
        return "FCommand";
    }
    
}
