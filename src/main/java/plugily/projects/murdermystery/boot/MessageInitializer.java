
package plugily.projects.murdermystery.boot;


import plugily.projects.minigamesbox.classic.handlers.language.Message;
import plugily.projects.minigamesbox.classic.handlers.language.MessageManager;
import plugily.projects.minigamesbox.classic.utils.services.locale.Locale;
import plugily.projects.minigamesbox.classic.utils.services.locale.LocaleRegistry;
import plugily.projects.murdermystery.Main;

import java.util.Arrays;

/**
 * @author Tigerpanzer_02
 * <p>
 * Created at 15.10.2022
 */
public class MessageInitializer {
  private final Main plugin;

  public MessageInitializer(Main plugin) {
    this.plugin = plugin;
    registerLocales();
  }

  public void registerMessages() {
    getMessageManager().registerMessage("", new Message("", ""));
    getMessageManager().registerMessage("SCOREBOARD_ROLES_DETECTIVE", new Message("Scoreboard.Roles.Detective", ""));
    getMessageManager().registerMessage("SCOREBOARD_ROLES_MURDERER", new Message("Scoreboard.Roles.Murderer", ""));
    getMessageManager().registerMessage("SCOREBOARD_ROLES_INNOCENT", new Message("Scoreboard.Roles.Innocent", ""));
    getMessageManager().registerMessage("SCOREBOARD_ROLES_DEAD", new Message("Scoreboard.Roles.Dead", ""));
    getMessageManager().registerMessage("SCOREBOARD_DETECTIVE_ALIVE", new Message("Scoreboard.Detective.Alive", ""));
    getMessageManager().registerMessage("SCOREBOARD_DETECTIVE_BOW_DROPPED", new Message("Scoreboard.Detective.Bow.Dropped", ""));
    getMessageManager().registerMessage("SCOREBOARD_DETECTIVE_BOW_PICKED", new Message("Scoreboard.Detective.Bow.Picked", ""));

    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_MURDERER_STOPPED", new Message("In-Game.Messages.Game-End.Placeholders.Murderer.Stopped", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_MURDERER_KILLED_YOU", new Message("In-Game.Messages.Game-End.Placeholders.Murderer.Killed.You", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_MURDERER_KILLED_ALL", new Message("In-Game.Messages.Game-End.Placeholders.Murderer.Killed.All", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_INNOCENT_KILLED_YOU", new Message("In-Game.Messages.Game-End.Placeholders.Innocent.Killed.You", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_INNOCENT_KILLED_WRONGLY", new Message("In-Game.Messages.Game-End.Placeholders.Innocent.Killed.All", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_GAME_END_PLACEHOLDERS_NOBODY", new Message("In-Game.Messages.Game-End.Placeholders.Nobody", ""));

    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_ROLE_CHANCES_ACTION_BAR", new Message("In-Game.Messages.Arena.Chances.Action-Bar", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_COOLDOWN", new Message("In-Game.Messages.Arena.Cooldown", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_LOCATOR_BOW", new Message("In-Game.Messages.Arena.Locator.Bow", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_LOCATOR_INNOCENT", new Message("In-Game.Messages.Arena.Locator.Innocent", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_LOCATOR_WATCH_OUT", new Message("In-Game.Messages.Arena.Locator.Watch-Out", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_NAME", new Message("In-Game.Messages.Arena.Pass.Name", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_ROLE_MURDERER_NAME", new Message("In-Game.Messages.Arena.Pass.Role.Murderer.Name", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_ROLE_MURDERER_LORE", new Message("In-Game.Messages.Arena.Pass.Role.Murderer.Lore", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_ROLE_DETECTIVE_NAME", new Message("In-Game.Messages.Arena.Pass.Role.Detective.Name", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_ROLE_DETECTIVE_LORE", new Message("In-Game.Messages.Arena.Pass.Role.Detective.Lore", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_FAIL", new Message("In-Game.Messages.Arena.Pass.Fail", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_SUCCESS", new Message("In-Game.Messages.Arena.Pass.Success", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PASS_CHANGE", new Message("In-Game.Messages.Arena.Pass.Change", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_TIME_LEFT", new Message("In-Game.Messages.Arena.Playing.Time-Left", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_ROLE_CHANGE", new Message("In-Game.Messages.Arena.Playing.Role.Change", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_ROLE_MURDERER", new Message("In-Game.Messages.Arena.Playing.Role.Murderer", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_ROLE_DETECTIVE", new Message("In-Game.Messages.Arena.Playing.Role.Detective", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_ROLE_INNOCENT", new Message("In-Game.Messages.Arena.Playing.Role.Innocent", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_BONUS", new Message("In-Game.Messages.Arena.Playing.Score.Bonus", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_GOLD", new Message("In-Game.Messages.Arena.Playing.Score.Gold", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_KILL_PLAYER", new Message("In-Game.Messages.Arena.Playing.Score.Action.Kill.Player", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_KILL_MURDERER", new Message("In-Game.Messages.Arena.Playing.Score.Action.Kill.Murderer", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_KILL_INNOCENT", new Message("In-Game.Messages.Arena.Playing.Score.Action.Kill.Innocent", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_PICKUP_GOLD", new Message("In-Game.Messages.Arena.Playing.Score.Action.Pickup.Gold", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_SURVIVING_TIME", new Message("In-Game.Messages.Arena.Playing.Score.Action.Surviving.Time", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_SURVIVING_END", new Message("In-Game.Messages.Arena.Playing.Score.Action.Surviving.End", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_WIN", new Message("In-Game.Messages.Arena.Playing.Score.Action.Win", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SCORE_ACTION_DETECTIVE", new Message("In-Game.Messages.Arena.Playing.Score.Action.Detective", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SWORD_SOON", new Message("In-Game.Messages.Arena.Playing.Sword.Soon", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_CAULDRON_POTION", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Cauldron.Potion", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_CAULDRON_HOLOGRAM", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Cauldron.Hologram", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_NOT_ENOUGH_GOLD", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Not-Enough-Gold", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_HOLOGRAM", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Hologram", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_CHAT", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Chat", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PAY", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Pay", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_HEARD", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Heard", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_FEELING_BLESSED", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Feeling.Blessed", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_FEELING_CURSED", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Feeling.Cursed", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_GIFTS_DETECTIVE_REVELATION", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Gifts.Detective-Revelation", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_GIFTS_GOLD_RUSH", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Gifts.Gold-Rush", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_GIFTS_SINGLE_COMPENSATION", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Gifts.Single-Compensation", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_GIFTS_BOW", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Gifts.Bow", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_CURSES_SLOWNESS", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Curses.Slowness", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_CURSES_BLINDNESS", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Curses.Blindness", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_CURSES_GOLD", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Curses.Gold", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_SPECIAL_BLOCKS_PRAY_PRAISE_CURSES_DEATH", new Message("In-Game.Messages.Arena.Playing.Special-Blocks.Pray.Praise.Curses.Death", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_BOW_DROPPED", new Message("In-Game.Messages.Arena.Playing.Bow.Dropped", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_BOW_PICKUP", new Message("In-Game.Messages.Arena.Playing.Bow.Pickup", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_BOW_SHOT_GOLD", new Message("In-Game.Messages.Arena.Playing.Bow.Shot.Gold", ""));
    getMessageManager().registerMessage("IN_GAME_MESSAGES_ARENA_PLAYING_BOW_SHOT_TITLE", new Message("In-Game.Messages.Arena.Playing.Bow.Shot.Title", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_CONTRIBUTION_DETECTIVE", new Message("Leaderboard.Statistics.Detective-Contribution", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_CONTRIBUTION_MURDERER", new Message("Leaderboard.Statistics.Murderer-Contribution", ""));

    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_PASS_DETECTIVE", new Message("Leaderboard.Statistics.Detective-Pass", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_PASS_MURDERER", new Message("Leaderboard.Statistics.Murderer-Pass", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_KILLS", new Message("Leaderboard.Statistics.Kills", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_DEATHS", new Message("Leaderboard.Statistics.Deaths", ""));
    getMessageManager().registerMessage("LEADERBOARD_STATISTICS_HIGHEST_SCORE", new Message("Leaderboard.Statistics.Highest-Score", ""));
  }

  private void registerLocales() {
    Arrays.asList(new Locale("Chinese (Traditional)", "简体中文", "zh_HK", "POEditor contributors", Arrays.asList("中文(傳統)", "中國傳統", "chinese_traditional", "zh")),
      new Locale("Chinese (Simplified)", "简体中文", "zh_CN", "POEditor contributors", Arrays.asList("简体中文", "中文", "chinese", "chinese_simplified", "cn")),
      new Locale("Czech", "Český", "cs_CZ", "POEditor contributors", Arrays.asList("czech", "cesky", "český", "cs")),
      new Locale("Dutch", "Nederlands", "nl_NL", "POEditor contributors", Arrays.asList("dutch", "nederlands", "nl")),
      new Locale("English", "English", "en_GB", "Tigerpanzer_02", Arrays.asList("default", "english", "en")),
      new Locale("French", "Français", "fr_FR", "POEditor contributors", Arrays.asList("french", "francais", "français", "fr")),
      new Locale("German", "Deutsch", "de_DE", "Tigerkatze and POEditor contributors", Arrays.asList("deutsch", "german", "de")),
      new Locale("Hungarian", "Magyar", "hu_HU", "POEditor contributors", Arrays.asList("hungarian", "magyar", "hu")),
      new Locale("Indonesian", "Indonesia", "id_ID", "POEditor contributors", Arrays.asList("indonesian", "indonesia", "id")),
      new Locale("Italian", "Italiano", "it_IT", "POEditor contributors", Arrays.asList("italian", "italiano", "it")),
      new Locale("Korean", "한국의", "ko_KR", "POEditor contributors", Arrays.asList("korean", "한국의", "kr")),
      new Locale("Lithuanian", "Lietuviešu", "lt_LT", "POEditor contributors", Arrays.asList("lithuanian", "lietuviešu", "lietuviesu", "lt")),
      new Locale("Polish", "Polski", "pl_PL", "Plajer", Arrays.asList("polish", "polski", "pl")),
      new Locale("Portuguese (BR)", "Português Brasileiro", "pt_BR", "POEditor contributors", Arrays.asList("brazilian", "brasil", "brasileiro", "pt-br", "pt_br")),
      new Locale("Romanian", "Românesc", "ro_RO", "POEditor contributors", Arrays.asList("romanian", "romanesc", "românesc", "ro")),
      new Locale("Russian", "Pусский", "ru_RU", "POEditor contributors", Arrays.asList("russian", "pусский", "pyccknn", "russkiy", "ru")),
      new Locale("Spanish", "Español", "es_ES", "POEditor contributors", Arrays.asList("spanish", "espanol", "español", "es")),
      new Locale("Thai", "Thai", "th_TH", "POEditor contributors", Arrays.asList("thai", "th")),
      new Locale("Turkish", "Türk", "tr_TR", "POEditor contributors", Arrays.asList("turkish", "turk", "türk", "tr")),
      new Locale("Vietnamese", "Việt", "vn_VN", "POEditor contributors",
        Arrays.asList("vietnamese", "viet", "việt", "vn"))).forEach(LocaleRegistry::registerLocale);
  }

  private MessageManager getMessageManager() {
    return plugin.getMessageManager();
  }

}
