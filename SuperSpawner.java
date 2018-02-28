package com.github.fafa;

import org.bukkit.plugins.java.JavaPlugin;
//服务器加载
public class SuperSpawner extends JavaPlugins{
    public void onLoad(){
        getLogger().info("[SuperSpawner]插件加载完成")
    }
//服务器关闭
    public void onDisable(){
        getLogger().info("[SuperSpawner]插件卸载完成")
    }
}
     
