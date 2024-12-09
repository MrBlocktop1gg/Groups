package mrblock.prefixgroup.mongoDB;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class PlayerData {
  UUID uuid;
  String prefix;
}
