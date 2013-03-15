package me.delocaz.featsigns;

import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FSListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getClickedBlock().getType() == Material.SIGN_POST || e.getClickedBlock().getType() == Material.WALL_SIGN) {
                Sign s = (Sign) e.getClickedBlock().getState();
                for (FSign fs : FeatSigns.getInstance().getSigns()) {
                    if (('[' + fs.getName() + ']').equalsIgnoreCase(s.getLines()[0])) {
                        if (e.getPlayer().hasPermission("featsigns.sign." + fs.getName().toLowerCase())) {
                            fs.onActivate(e.getPlayer(), s);
                        }
                    }
                }
            }
        }
    }
}
