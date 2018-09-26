package org.mozilla.rocket.portal

import android.arch.lifecycle.MutableLiveData
import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import org.mozilla.focus.R

class FeedAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val collectionData = MutableLiveData<List<Row>>()

    override fun getItemCount(): Int {
        val item = collectionData.value
        return if (item == null) {
            0
        } else {
            item.size
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rows = collectionData.value
        val feed = rows!![position]
        val feedViewHolder = holder as FeedViewHolder
        val attrContainer = feedViewHolder.attrContainer
        val inflater = LayoutInflater.from(feedViewHolder.itemView.context)

        attrContainer.removeAllViews()

        addView(attrContainer, inflater, "id", feed.id)
        addView(attrContainer, inflater, "language", feed.language)
        addView(attrContainer, inflater, "title", feed.title)
        addView(attrContainer, inflater, "category", feed.category)
        addView(attrContainer, inflater, "subcategory", feed.subcategory)
        addView(attrContainer, inflater, "keywords", feed.keywords)
        addView(attrContainer, inflater, "description", feed.description)
        addView(attrContainer, inflater, "detailUrl", feed.detailUrl)
        addView(attrContainer, inflater, "articleFrom", feed.articleFrom)
        addView(attrContainer, inflater, "publishTime", feed.publishTime.toString())
        addView(attrContainer, inflater, "coverPic", feed.coverPic.joinToString(separator = "\n˛"))
        addView(attrContainer, inflater, "province", feed.province)
        addView(attrContainer, inflater, "city", feed.city)
        addView(attrContainer, inflater, "summary", feed.summary)
        addView(attrContainer, inflater, "additionalProperties", feed.additionalProperties.toString())
    }

    fun addView(container: ViewGroup, layoutInflater: LayoutInflater, title: String, attrValue: String) {
        val attr = layoutInflater.inflate(R.layout.feed_item_attr, container, false)
        attr.findViewById<TextView>(R.id.attr_label).text = title
        attr.findViewById<TextView>(R.id.attr_value).text = attrValue
        container.addView(attr)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.feed_item, parent, false)

        return FeedViewHolder(itemView as FeedView)
    }

    internal class FeedViewHolder(itemView: FeedView) : RecyclerView.ViewHolder(itemView) {

        internal val holder = SparseArray<View>()

        fun <T : View> get(id: Int): T {

            var view: T
            if (holder[id] == null) {
                view = itemView.findViewById(id)
                holder.put(id, view)
            } else {
                @Suppress("UNCHECKED_CAST")
                view = holder[id] as T
            }
            return view
        }

        var attrContainer: LinearLayout = get(R.id.attr_container)


    }

}