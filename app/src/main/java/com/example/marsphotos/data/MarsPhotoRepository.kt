package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotoRepository {

    suspend fun getMarsPhotos():List<MarsPhoto>
}
class NetworMarsPhotosRepository: MarsPhotoRepository{

    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotos()
    }


}