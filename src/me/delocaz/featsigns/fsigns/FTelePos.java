package me.delocaz.featsigns.fsigns;

import me.delocaz.featsigns.FSign;
import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

public class FTelePos implements FSign {

    @Override
    public void onActivate(Player p, Sign s) {
        String[] coords = s.getLines()[1].split(",");
        if (coords.length > 3) {
            Location l;
            try {
                l = new Location(s.getWorld(), Double.parseDouble(coords[0]), Double.parseDouble(coords[1]), Double.parseDouble(coords[2]));
            } catch (NumberFormatException e) {
                return;
            }
            p.teleport(l);
        }
    }

    @Override
    public String getName() {
        return "FTelePos";
    }
}
