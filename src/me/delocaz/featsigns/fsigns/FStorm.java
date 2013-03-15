package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class FStorm implements FSign {

    @Override
    public void onActivate(Player p, Sign s) {
        s.getWorld().setStorm(true);
    }

    @Override
    public String getName() {
        return "FStorm";
    }
}
