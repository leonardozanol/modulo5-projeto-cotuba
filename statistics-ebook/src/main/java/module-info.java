module statistics.ebook {
    requires cotuba.domain;
    requires cotuba.plugin;

    requires org.jsoup;

    provides br.com.unipds.cotuba.plugin.CotubaPluginAfterGenerate
            with br.com.unipds.statistics.PluginStatistics;
}