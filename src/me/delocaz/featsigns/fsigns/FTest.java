package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class FTest implements FSign {
    @Override
    public void onActivate(Player p, Sign s) {
        p.sendMessage("Hi!");
    }
    @Override
    public String getName() {
        return "FTest";
    }
}
