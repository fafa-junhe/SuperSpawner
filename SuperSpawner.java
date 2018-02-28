package com.github.fafa;

import org.bukkit.plugins.java.JavaPlugin;

public class SuperSpawner extends JavaPlugins{
    public void onEnable(){
        getLogger().info("[SuperSpawner]插件加载完成")
    }
    public void onDisable(){
        getLogger().info("[SuperSpawner]插件卸载完成")
    }
}
     
