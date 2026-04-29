package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import org.junit.Test
import kotlin.test.assertEquals

class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRespository_getMarsPhotos_verfiyPhotoList(){
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
    }
}