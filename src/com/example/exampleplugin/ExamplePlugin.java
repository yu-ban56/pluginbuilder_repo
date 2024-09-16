package com.example.exampleplugin;

import battlerpg.tools.pluginbuilder.*;

public class ExamplePlugin extends PluginBuilderPlugin{
    public static final String PLUGIN_ID = "example";
    @Override
    public void init(String... args) {
        System.out.println(PLUGIN_ID + " started.");
        System.out.println("Arguments: ");
        for (String argument : args) {
            System.out.println(argument);
        }
    }

    @Override
    public String getPluginID() {
        return PLUGIN_ID;
    }

    @Override
    public void destroy() {
        /* do nothing */
    }
}
