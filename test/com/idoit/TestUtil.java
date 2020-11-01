package com.idoit;

import org.reflections8.Reflections;
import org.reflections8.scanners.SubTypesScanner;
import org.reflections8.util.ClasspathHelper;
import org.reflections8.util.ConfigurationBuilder;
import org.reflections8.util.FilterBuilder;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    private static final List<ClassLoader> CLASS_LOADERS = new ArrayList<>();

    static {
        CLASS_LOADERS.add(ClasspathHelper.contextClassLoader());
        CLASS_LOADERS.add(ClasspathHelper.staticClassLoader());
    }

    public static Reflections getBaseReflections(String packageName) {
        return new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false))
                .setUrls(ClasspathHelper.forClassLoader(CLASS_LOADERS.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(packageName))));
    }
}
