import battlerpg.tools.pluginbuilder.BuilderPluginLoader;
import battlerpg.tools.pluginbuilder.Main;

import java.io.IOException;

public class ExamplePluginTest {
    public static void main(String[] args) throws IOException {
        BuilderPluginLoader.load("com.example.exampleplugin.ExamplePlugin");
        Main.main(args);
    }
}
