package net.runelite.client.plugins.specialattackuser;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("specialattackuser")
public interface SpecialAttackUserConfig extends Config
{
	@ConfigItem(
		keyName = "specialPercent",
		name = "Percent",
		description = "The special percent to enable special attack at.",
		position = 1
	)
	default int specialPercent()
	{
		return 100;
	}

	@ConfigItem(
			keyName = "weaponIDs",
			name = "Weapon IDs",
			description = "List of item IDs. Seperated by a comma.",
			position = 2
	)
	default String weaponIDs()
	{
		return "";
	}
}
