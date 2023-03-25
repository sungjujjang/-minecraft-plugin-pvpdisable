package com.sungjujjand.pvpdisable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class pvpcommand implements CommandExecutor {

    //if command is /pvp true, pvp is enabled
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("pvp")) {
            if (args.length == 0) {
                sender.sendMessage("true or false를 입력해주세요");
                return true;
            }
            else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("true")) {
                    event.pvp = true;
                    sender.sendMessage("PVP가 활성화 되었습니다");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("false")) {
                    event.pvp = false;
                    sender.sendMessage("PVP가 비활성화 되었습니다");
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
