package geojson


data class FeatureCollection(
        val features      : List<Feature>
) : GeoJsonObject() {
    @Suppress("unused")
    val type : String = FeatureCollection::class.java.simpleName
}
