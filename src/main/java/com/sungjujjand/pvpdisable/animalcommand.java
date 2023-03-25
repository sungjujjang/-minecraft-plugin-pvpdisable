package com.sungjujjand.pvpdisable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class animalcommand implements CommandExecutor {

    //if command animalhit is true, animalhit is enabled
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("animalhit")) {
            if (args.length == 0) {
                sender.sendMessage("true or false를 입력해주세요");
                return true;
            }
            else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("true")) {
                    event.animalhit = true;
                    sender.sendMessage("동물을 공격할 수 있습니다");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("false")) {
                    event.animalhit = false;
                    sender.sendMessage("동물을 공격할 수 없습니다");
                    return true;
                }
                else {
                    sender.sendMessage("true or false를 입력해주세요");
                    return true;
                }
            }
            else {
                sender.sendMessage("true or false를 입력해주세요");
                return true;
            }
        }
        return false;
    }

}
