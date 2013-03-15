package me.delocaz.featsigns;

import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public interface FSign {

    void onActivate(Player p, Sign s);

    String getName();
}
