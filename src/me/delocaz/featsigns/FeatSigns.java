package me.delocaz.featsigns;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FeatSigns extends JavaPlugin {

    private List<FSign> sgns;

    public static FeatSigns getInstance() {
        return (FeatSigns) Bukkit.getPluginManager().getPlugin("FeatSigns");
    }

    public void onEnable() {
        FSListener fsl = new FSListener();
        Bukkit.getPluginManager().registerEvents(fsl, this);
        sgns = new FSRegistrator().register();
    }

    public List<FSign> getSigns() {
        return sgns;
    }
}