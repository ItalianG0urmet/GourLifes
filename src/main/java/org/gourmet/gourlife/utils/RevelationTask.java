package org.gourmet.gourlife.utils;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.gourmet.gourlife.GourLife;

import java.io.File;

public class RevelationTask extends BukkitRunnable {

    @Getter private static int time = GourLife.getInstance().getTimer();
    private FileConfiguration config = GourLife.getInstance().getConfig();

    @Override
    public void run() {
        if (time <= 0) {

            for(Player p : Bukkit.getOnlinePlayers()){
                String messages = config.getString("rivelation_message");
                messages = messages.replace("%player%", p.getName());
                messages = messages.replace("%position_x%", "" + p.getLocation().getBlockX());
                messages = messages.replace("%position_y%", "" + p.getLocation().getBlockY());
                messages = messages.replace("%position_z%", "" + p.getLocation().getBlockZ());
                messages = messages.replace("%world%", "" + p.getLocation().getWorld().getName());

                Utils.sendMessageAll(config.getString("prefix") + messages);
                Utils.sendTitleAllEX(Utils.color(config.getString("title_rivelation")), Utils.color(config.getString("subtitle_rivelation")), 10, 70, 20, true);
            }
            time = config.getInt("timer_revelation");

        }
        if(time >= 0){
            time--;
        }
    }
}
