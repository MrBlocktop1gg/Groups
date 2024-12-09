package mrblock.prefixgroup.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal = true)
public enum Group {
  PLAYER("","", "", 1),
  VIP("V", "VIP", "", 2),
  GOLD("G", "GOLD", "", 3),
  PREMIUM("P", "PREMIUM", "", 4),
  MVP("MVP", "MVP", "", 5),
  HELPER("H", "HELPER", "", 6),
  MODER("M", "MODERATOR", "", 7),
  CURATOR("Cur", "CURATOR", "", 8),
  DEV("Dev", "Developer", "", 10),
  ADMIN("ADM", "ADMIN", "", 12),
  OWNER("OWN", "OWNER", "", 15);

  String name;
  String prefix;
  String color;
  int priority;

}
