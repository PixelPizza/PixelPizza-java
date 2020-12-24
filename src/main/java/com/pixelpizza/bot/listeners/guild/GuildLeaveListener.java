package com.pixelpizza.bot.listeners.guild;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class GuildLeaveListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof GuildLeaveEvent)) return;
        GuildLeaveEvent event = (GuildLeaveEvent) genericEvent;
    }
}
