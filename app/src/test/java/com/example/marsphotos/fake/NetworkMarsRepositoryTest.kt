package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import org.junit.Test
import kotlin.test.assertEquals
import kotlinx.coroutines.test.runTest


class NetworkMarsRepositoryTest {

    @Test
    fun networkMarsPhotosRespository_getMarsPhotos_verfiyPhotoList(): Unit =
        runTest {
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
    }
