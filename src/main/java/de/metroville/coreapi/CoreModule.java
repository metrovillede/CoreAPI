package de.metroville.coreapi;

public abstract class CoreModule {

    private final Description moduleDescription;

    public CoreModule() {
        // Holt sich die Klasse des Moduls
        final Class<? extends CoreModule> clazz = getClass();

        // Überprüft, ob die @Description Annotation vorhanden ist
        if (!clazz.isAnnotationPresent(Description.class)) {
            throw new IllegalArgumentException("Description annotation is missing in module '" + clazz.getSimpleName() + "'");
        }

        // Holt sich die Annotation
        this.moduleDescription = clazz.getAnnotation(Description.class);
    }

    public String getModuleName() {
        return moduleDescription.name();
    }

    public String getModuleVersion() {
        return moduleDescription.version();
    }

    public String getModuleAuthors() {
        return moduleDescription.authors();
    }

    public void onEnable() {
        // Standard-Logik für das Aktivieren des Moduls
    }

    public void onDisable() {
        // Standard-Logik für das Deaktivieren des Moduls
    }

    public void onCleanup() {
        // Standard-Logik für das Aufräumen des Moduls
    }
}
