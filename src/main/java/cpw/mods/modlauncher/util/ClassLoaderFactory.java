package cpw.mods.modlauncher.util;

import cpw.mods.cl.ModuleClassLoader;

import java.lang.module.Configuration;
import java.util.List;

@FunctionalInterface
public interface ClassLoaderFactory {
    ModuleClassLoader create(Configuration configuration, ClassLoader parentLoader, List<ModuleLayer> parentLayers);
}
