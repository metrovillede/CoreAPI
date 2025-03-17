package de.metroville.coreapi;

import org.bukkit.plugin.java.JavaPlugin;

public class CoreAPI {
    private static CorePlugin corePluginInstance;
    private static JavaPlugin javaPluginInstance;

    public static void setCorePluginInstance(CorePlugin corePlugin) {
        corePluginInstance = corePlugin;
    }

    public static void setJavaPluginInstance(JavaPlugin javaPlugin) {
        javaPluginInstance = javaPlugin;
    }

    public static CorePlugin getCorePluginInstance() {
        if (corePluginInstance == null) {
            throw new IllegalStateException("The CorePlugin is not registered!");
        }
        return corePluginInstance;
    }

    public static JavaPlugin getJavaPluginInstance() {
        if (javaPluginInstance == null) {
            throw new IllegalStateException("The JavaPlugin is not registered!");
        }
        return javaPluginInstance;
    }

    public static void registerModule(CoreModule module) {
        getCorePluginInstance().registerModule(module);
    }
}
