package club.gvheaton.pisspoor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ClubHouse extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (label.equalsIgnoreCase("fuckyou"))
        {
            if (sender instanceof Player)
            {
                Player player = (Player)sender;
                player.sendMessage("Congrats!!! YOU found the *secret* command!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            else
            {
                sender.sendMessage("You cant use this command from console dumbass.");
            }

            return true;
        }

        return false;
    }
}
