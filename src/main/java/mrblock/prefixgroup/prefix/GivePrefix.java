package mrblock.prefixgroup.prefix;

import lombok.AllArgsConstructor;
import mrblock.prefixgroup.PrefixGroup;
import mrblock.prefixgroup.group.Group;
import mrblock.prefixgroup.group.GroupImpl;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@AllArgsConstructor
public class GivePrefix implements CommandExecutor {
  GroupImpl groupImpl;

  @Override
  public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
    Player player = ((Player) commandSender).getPlayer();
    Player targetPlayer = Bukkit.getPlayer(args[0]);

    String group = args[1].toLowerCase();

    for (Group group1 : Group.values()) {
      if (!group.equals(group1.getPrefix())) {
        player.sendMessage("Такой группы не существует!");
        return false;
      }
      groupImpl.addGroup(targetPlayer, group1.getName());
      player.sendMessage("Игроку: " + targetPlayer.getName() + " Была успешна выдана группа: " + group1);
      return true;
    }

    return false;
  }
}
