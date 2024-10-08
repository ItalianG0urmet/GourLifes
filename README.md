
---

### Glife Plugin

![Banner](https://images-ext-2.discordapp.net/external/K_Vj-_8FzSL7B57Ycey0crHLgwftXVdKUHPVUceQ26c/https/i.postimg.cc/yxBjZCXB/Glifebanner-dsgvgd.jpg?format=webp&width=2560&height=1180)

**Description:**

This Spigot plugin enhances gameplay by introducing a life system. Each player starts with three lives, loses one upon death, and gains one when killing another player. The plugin includes customizable placeholders and configurations.

**Note:** When a player's life count reaches zero, they lose all their items.

**Features:**

- **Revelation:** Reveals the position of all players approximately every 30 minutes. This feature can be disabled via the configuration.

  ![Revelation](https://i.postimg.cc/SNcc1bzf/Screenshot-2024-03-13-alle-00-15-36.png)

**Commands:**

1. `/life check <player>` - View a player's lives.
2. `/life give <player>` - Give a life to a player.
3. `/life reset <player>` - Reset a player's stats.
4. `/life set <player> <number>` - Set a player's lives.

**Configurations:**

```yaml
# Settings
revelation: true
timer_revelation: 80 #in seconds
Join-messages: true
leave-messages: true
death-message: true
final-message: true
life-number: 3

# Messages
prefix: "&7[&FServerName&7]&8 » "
no-player: "&cPlayer not found"
reset-life: "&e%player% is back in the game"
no-permission: "&cYou don't have the required permissions"
check-lifes: "&c%player% has %lifes% lives"
your-lifes: "&bYou have %lifes% lives"
give-life: "&bYou have donated 1 life"
receive-life: "&bYou have received 1 life from %player%"
not-enough-lifes: "&cYou don't have enough lives"
cant-find-player: "&cPlayer not found"
cant-send-to-yourself: "&cYou can't do that to yourself"
revelation_message: "%player% is at (%position_x%, %position_y%, %position_z%, %world%)"
title_revelation: "&cRevelation"
subtitle_revelation: "&c"
death: "&e%player% has died and now has &c❤ %lifes% lives"
final-death: "&e%player% has died permanently"
join: "&e%player% has joined the server!"
leave: "&c%player% has left the server"
gained-life: "&bYou have gained 1 life"
set-life: "&bNew life count: %new_life%"

# Help
help-commands: "&c\n Usage: \n give: /life give <player> \n check: /life check <player>"
```

**Placeholders:**

- Life Placeholder: `%glife_life%`
- Revelation Timer: `%glife_revelation%`

**Permissions:**

- `glife.set`
- `glife.reload`
- `glife.reset`

---

