package club.gvheaton.pisspoor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

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

        else if (label.equalsIgnoreCase("sex"))
        {
            if (sender instanceof Player)
            {
                Date data = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
                String strDate = dateFormat.format(data);
                Player player = (Player)sender;
                player.chat("I think alvaro is really hot!!!");
                player.chat("That's why I had sex with him on " + strDate);
            }
            else
            {
                sender.sendMessage("Your not allowed to have sex silly :)");
            }

            return true;
        }

        return false;
    }
}
