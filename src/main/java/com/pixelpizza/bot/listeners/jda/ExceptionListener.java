package com.pixelpizza.bot.listeners.jda;

import net.dv8tion.jda.api.events.ExceptionEvent;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class ExceptionListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof ExceptionEvent)) return;
        ExceptionEvent event = (ExceptionEvent) genericEvent;
        System.out.println(event.getJDA().getSelfUser().getName() + " encountered an error");
        System.out.println(event.getCause().getMessage());
    }
}
