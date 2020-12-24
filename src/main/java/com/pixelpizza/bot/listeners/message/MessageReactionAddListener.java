package com.pixelpizza.bot.listeners.message;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class MessageReactionAddListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof MessageReactionAddEvent)) return;
        MessageReactionAddEvent event = (MessageReactionAddEvent) genericEvent;
    }
}
