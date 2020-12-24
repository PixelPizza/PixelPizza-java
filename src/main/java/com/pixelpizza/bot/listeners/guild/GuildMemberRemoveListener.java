package com.pixelpizza.bot.listeners.guild;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class GuildMemberRemoveListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof GuildMemberRemoveEvent)) return;
        GuildMemberRemoveEvent event = (GuildMemberRemoveEvent) genericEvent;
    }
}
