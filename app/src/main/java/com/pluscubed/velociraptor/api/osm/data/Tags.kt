package com.pluscubed.velociraptor.api.osm.data

import kotlinx.serialization.Serializable

@Serializable
data class Tags(
    val maxspeed: String? = null,
    val name: String? = null,
    val ref: String? = null
)
