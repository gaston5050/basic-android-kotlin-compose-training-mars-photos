package com.example.marsphotos.data

import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {

    suspend fun getMarsPhotos():List<MarsPhoto>
}
class NetwormarsPhotosRepository: MarsPhotoRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        TODO("Not yet implemented")
    }


}