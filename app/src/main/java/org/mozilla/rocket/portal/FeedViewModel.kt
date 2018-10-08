package org.mozilla.rocket.portal

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.res.AssetManager
import com.fasterxml.jackson.databind.ObjectMapper
import org.mozilla.rocket.portal.indiatimes.Item

internal class FeedViewModel : ViewModel() {

    private val collectionData = MutableLiveData<List<Item>>()

    val feedData: MutableLiveData<List<Item>>
        get() {
            return collectionData
        }

    suspend fun loadFeedData(assets: AssetManager) {
        val objectMapper = ObjectMapper()
        val sample = assets.open("portal/sample2.json")
        val feedData = objectMapper.readValue<org.mozilla.rocket.portal.indiatimes.FeedData>(sample, org.mozilla.rocket.portal.indiatimes.FeedData::class.java)
        val rows = feedData?.items

        collectionData.value = rows
    }

}

