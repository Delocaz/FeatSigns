package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class FClearMobs implements FSign {

    @Override
    public void onActivate(Player p, Sign s) {
        for (LivingEntity e : s.getWorld().getLivingEntities()) {
            e.remove();
        }
    }

    @Override
    public String getName() {
        return "FClearMobs";
    }
}
