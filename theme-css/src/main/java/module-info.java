module theme.css {
    requires cotuba.plugin;

    provides br.com.unipds.cotuba.plugin.CotubaPluginAfterRender
            with br.com.unipds.theme.PluginThemeCSS;
}