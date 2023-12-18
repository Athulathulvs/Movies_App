package com.athulvs987.movies_app.model.movies_list

data class ModelMovieList(
    val `data`: List<Data>,
    val metadata: Metadata
) {
    data class Data(
        val country: String,
        val genres: List<String>,
        val id: Int,
        val images: List<String>,
        val imdb_rating: String,
        val poster: String,
        val title: String,
        val year: String
    )

    data class Metadata(
        val current_page: String,
        val page_count: Int,
        val per_page: Int,
        val total_count: Int
    )
}