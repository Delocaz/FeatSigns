package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class FDay implements FSign {

    @Override
    public void onActivate(Player p, Sign s) {
        s.getWorld().setTime(1000);
    }

    @Override
    public String getName() {
        return "FDay";
    }
}