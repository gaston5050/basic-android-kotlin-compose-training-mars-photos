package com.example.marsphotos.fake

import com.example.marsphotos.data.MarsPhotoRepository
import com.example.marsphotos.network.MarsPhoto
import com.example.marsphotos.ui.screens.MarsUiState
import com.example.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals

class FakeNetworkMarsPhotosRepository: MarsPhotoRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}

