package com.will.flutter_native_web_plugin;


import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterNativeWebPlugin */
public class FlutterNativeWebPlugin {

  public static void registerWith(Registrar registrar) {
    registrar
            .platformViewRegistry()
            .registerViewFactory(
                    "ponnamkarthik/flutterwebview", new FlutterwebviewFactory(registrar));
  }
}
