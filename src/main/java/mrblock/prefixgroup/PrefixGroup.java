package mrblock.prefixgroup;

import mrblock.prefixgroup.group.GroupImpl;
import mrblock.prefixgroup.prefix.GivePrefix;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PrefixGroup extends JavaPlugin {
  GroupImpl groupImpl;

  @Override
  public void onEnable() {
    groupImpl = new GroupImpl();

    Bukkit.getServer().getPluginCommand("setPrefix").setExecutor(new GivePrefix(groupImpl));
  }
}
