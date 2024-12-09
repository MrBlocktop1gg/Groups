package mrblock.prefixgroup.group;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface IGroup {
  String getPrefix();
  String getColor();
  int getPriority();
  void addGroup(Player player, String prefix);
}
