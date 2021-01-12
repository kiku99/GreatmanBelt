 package com.example.a2020greatmanbelt.fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivities
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.a2020greatmanbelt.R

class noticementRvAdapter(val context: Context, val noticeList: ArrayList<noticeElements>, val itemClick: (noticeElements) -> Unit) :

    RecyclerView.Adapter<noticementRvAdapter.Holder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_lv_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return noticeList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(noticeList[position], context)
    }

    inner class Holder(itemView: View?, itemClick:(noticeElements)->Unit) : RecyclerView.ViewHolder(itemView!!) {
        val noticeCategory = itemView?.findViewById<TextView>(R.id.category)
        val noticeTitle = itemView?.findViewById<TextView>(R.id.title)

        fun bind (notice :noticeElements, context: Context) {
            /* 나머지 TextView와 String 데이터를 연결한다. */
            noticeCategory?.text = notice.category
            noticeTitle?.text = notice.title

            //itemView.setOnClickListener {itemClick(notice)}
            itemView.setOnClickListener{
                val urlString = "https://www.jbnu.ac.kr/kor/?menuID=139&mode=view&no=${notice.title}"   //나중에 크롤링 하면 해당 url을 따로 멤버로 지정하면 됨
                var internetIntent = Intent(Intent.ACTION_VIEW, Uri.parse(urlString))
                it.context.startActivity(internetIntent)
            }
        }

    }
}