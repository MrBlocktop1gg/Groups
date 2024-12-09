package mrblock.prefixgroup.group;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

@Getter
public class GroupImpl implements IGroup {
  String prefix;
  String color;
  int priority;

  @Override
  public String getPrefix() {
    return prefix;
  }

  @Override
  public String getColor() {
    return color;
  }

  @Override
  public int getPriority() {
    return priority;
  }

  @Override
  public void addGroup(Player player, String prefix) {
    Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
    Team team = scoreboard.getTeam("Prefixes");
    team.addEntry(player.getName());
    team.setPrefix(prefix);
  }
}
