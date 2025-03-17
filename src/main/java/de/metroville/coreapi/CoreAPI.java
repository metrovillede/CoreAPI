package de.metroville.coreapi;

public class CoreAPI {
    private static CorePlugin instance;

    public static void setInstance(CorePlugin core) {
        instance = core;
    }

    public static CorePlugin getInstance() {
        if (instance == null) {
            throw new IllegalStateException("The CorePlugin is not registered!");
        }
        return instance;
    }

    public static void registerModule(CoreModule module) {
        getInstance().registerModule(module);
    }


}