package com.pixelpizza.bot.listeners.guild;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class GuildJoinListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof GuildJoinEvent)) return;
        GuildJoinEvent event = (GuildJoinEvent) genericEvent;
    }
}
