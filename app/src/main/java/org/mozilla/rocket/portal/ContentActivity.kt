package org.mozilla.rocket.portal

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.fragment_container_portal.*
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.async
import org.mozilla.focus.R
import org.mozilla.focus.locale.LocaleAwareAppCompatActivity

class ContentActivity : LocaleAwareAppCompatActivity() {

    private var feedViewModel: FeedViewModel? = null
    private val feedAdapter: FeedAdapter = FeedAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.fragment_container_portal)

        list.adapter = feedAdapter
        list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        PagerSnapHelper().attachToRecyclerView(list)

        feedViewModel = ViewModelProviders.of(this).get(FeedViewModel::class.java)

        feedViewModel?.feedData?.observe(this, Observer {
            feedAdapter.collectionData.value = it
            feedAdapter.notifyDataSetChanged()
        })


        async(UI) {

            feedViewModel?.loadFeedData(assets)

        }

    }

    override fun applyLocale() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}