package com.example.marsphotos

import com.example.marsphotos.network.MarsPhoto
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class MarsNetworkTest {

    @Test
    fun marsPhoto_serialization_isCorrect() {
        // 1. Arrange: Simulamos un pedacito de JSON real que vendría del servidor
        val jsonString = """{"id":"424905", "img_src":"https://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/1000MR0044631300503690E01_DXXX.jpg"}"""

        // 2. Act: Intentamos convertir ese String en un objeto MarsPhoto
        // Esto es lo mismo que intenta hacer Retrofit internamente
        val photo = Json.Default.decodeFromString<MarsPhoto>(jsonString)

        // 3. Assert: Verificamos que los datos se hayan mapeado bien
        assertEquals("424905", photo.id)
        assertEquals("https://mars.jpl.nasa.gov/msl-raw-images/msss/01000/mcam/1000MR0044631300503690E01_DXXX.jpg", photo.imgSrc)
    }
}