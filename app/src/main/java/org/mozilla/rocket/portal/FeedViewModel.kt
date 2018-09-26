package org.mozilla.rocket.portal

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.res.AssetManager
import com.fasterxml.jackson.databind.ObjectMapper

internal class FeedViewModel : ViewModel() {

    private val collectionData = MutableLiveData<List<Row>>()

    val feedData: MutableLiveData<List<Row>>
        get() {
            return collectionData
        }

    suspend fun loadFeedData(assets: AssetManager) {
        val objectMapper = ObjectMapper()
        val sample = assets.open("portal/sample.json")
        val feedData = objectMapper.readValue<FeedData>(sample, FeedData::class.java)
        val rows = feedData?.data?.rows

        collectionData.value = rows
    }

}

