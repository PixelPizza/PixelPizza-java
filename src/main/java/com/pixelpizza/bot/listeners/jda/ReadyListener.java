package com.pixelpizza.bot.listeners.jda;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

import com.pixelpizza.bot.Main;
import com.pixelpizza.bot.data.Config;

import org.jetbrains.annotations.NotNull;

public class ReadyListener implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent genericEvent) {
        if(!(genericEvent instanceof ReadyEvent)) return;
        ReadyEvent event = (ReadyEvent) genericEvent;
        Guild guild = event.getJDA().getGuildById(Config.BOTGUILD);
        for(Member member : guild.getMembers()){
            Main.guildMembers.put(member.getId(), member);
        }
        System.out.println(event.getJDA().getSelfUser().getName() + " is ready");
    }
}
