package com.pixelpizza.bot;

import com.pixelpizza.bot.listeners.guild.GuildJoinListener;
import com.pixelpizza.bot.listeners.guild.GuildLeaveListener;
import com.pixelpizza.bot.listeners.guild.GuildMemberJoinListener;
import com.pixelpizza.bot.listeners.guild.GuildMemberRemoveListener;
import com.pixelpizza.bot.listeners.jda.ExceptionListener;
import com.pixelpizza.bot.listeners.jda.ReadyListener;
import com.pixelpizza.bot.listeners.message.MessageReactionAddListener;
import com.pixelpizza.bot.listeners.message.MessageReactionRemoveListener;
import com.pixelpizza.bot.listeners.message.MessageReceivedListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Member;

import java.util.Map;

import javax.security.auth.login.LoginException;

public class Main
{
    public static Map<String, Object> commands = Map.ofEntries();
    public static Map<String, Map<String, Integer>> cooldowns = Map.ofEntries();
    public static Map<String, Member> guildMembers = Map.ofEntries();
    public static Map<String, Boolean> toggles = Map.ofEntries(
        Map.entry("cooldowns", true),
        Map.entry("addExp", true),
        Map.entry("pponlyChecks", true),
        Map.entry("workerApplications", true),
        Map.entry("teacherApplications", true),
        Map.entry("developerApplications", true),
        Map.entry("staffApplications", true),
        Map.entry("cookOwnOrder", false),
        Map.entry("deliverOwnOrder", false)
    );

    public static void main(String[] args) {
        String token;
        try{
            token = Class.forName(Main.class.getPackageName() + ".Constants").getField("TOKEN").get(null).toString();
        } catch (Exception e){
            token = System.getenv("BOT_TOKEN");
        }
        JDABuilder builder = JDABuilder.createDefault(token);
        builder.addEventListeners(
            new ReadyListener(),
            new ExceptionListener(),
            new GuildJoinListener(),
            new GuildLeaveListener(),
            new GuildMemberJoinListener(),
            new GuildMemberRemoveListener(),
            new MessageReactionAddListener(),
            new MessageReactionRemoveListener(),
            new MessageReceivedListener()
        );
        try {
            builder.build();
        } catch (LoginException e){
            e.printStackTrace();
        }
    }
}
