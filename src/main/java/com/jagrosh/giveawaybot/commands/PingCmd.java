/*
 * Copyright 2022 John Grosh (john.a.grosh@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jagrosh.giveawaybot.commands;

import com.jagrosh.interactions.command.ApplicationCommand;
import com.jagrosh.interactions.receive.Interaction;
import com.jagrosh.interactions.responses.InteractionResponse;

/**
 *
 * @author John Grosh (john.a.grosh@gmail.com)
 */
public class PingCmd extends GBCommand
{
    public PingCmd(String prefix)
    {
        this.app = new ApplicationCommand.Builder()
                .setType(ApplicationCommand.Type.CHAT_INPUT)
                .setName(prefix + "ping")
                .setDescription("check if the bot is online")
                .build();
    }
    
    @Override
    public InteractionResponse gbExecute(Interaction interaction)
    {
        return respondSuccess("Pong!");
    }
}