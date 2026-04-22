package com.example.marsphotos.data

import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {

    suspend fun getMarsPhotos():List<MarsPhoto>
}