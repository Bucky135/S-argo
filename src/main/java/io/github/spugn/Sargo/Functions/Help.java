package io.github.spugn.Sargo.Functions;

import io.github.spugn.Sargo.Objects.Images;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.EmbedBuilder;

public class Help
{
    private static IChannel CHANNEL;

    public Help(IChannel channel)
    {
        CHANNEL = channel;

        EmbedBuilder builder = new EmbedBuilder();

        builder.withAuthorName("Help Menu");
        builder.withAuthorIcon(Images.HELP_ICON.getUrl());

        String scoutingHelp = "";
        scoutingHelp += "'**scout**' - View a list of available banners." + "\n";
        scoutingHelp += "'**scout** p[Page Number]' - View a page in the list of available banners." + "\n";
        scoutingHelp += "'**scout** [Banner ID]' - View a banner's information." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [single/s/1]' - Perform a single scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [multi/m/11]' - Perform a multi scout." + "\n";
        scoutingHelp += "'**scout** [Banner ID] [guaranteed/g/rc]' - Perform a record crystal scout.";
        builder.appendField("SCOUT", scoutingHelp, false);

        String shopHelp = "";
        shopHelp += "'**shop**' - View the shop." + "\n";
        shopHelp += "'**shop** [Item ID]' - \"Buy\" a Memory Diamond bundle." + "\n";
        builder.appendField("SHOP", shopHelp, false);

        String profileHelp = "";
        profileHelp += "'**profile**' - View your basic profile." + "\n";
        profileHelp += "'**profile** [info/i] [Banner ID]' - View your collected/missing characters in a banner." + "\n";
        profileHelp += "'**profile** [data/d]' - View your Step/Record Crystal data." + "\n";
        profileHelp += "'**profile** [search/s] [Character Name]' - Search for that character in your collection." + "\n";
        builder.appendField("PROFILE", profileHelp, false);

        String userHelp = "";
        userHelp += "'**user** [name/@name]' - View a user's basic profile." + "\n";
        builder.appendField("USER SEARCH", userHelp, false);

        String resetHelp = "";
        resetHelp += "'**reset**' - Reset your data file." + "\n";
        builder.appendField("DATA RESET", resetHelp, false);

        CHANNEL.sendMessage(builder.build());
    }
}
