package com.example.a2020greatmanbelt.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a2020greatmanbelt.R

class noticement : AppCompatActivity() {
    var noticements = arrayListOf<noticeElements>(
        noticeElements("Red belt", "[레드벨트 필수]~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Blue belt", "[블루벨트~~~"),
        noticeElements("Common", "토익~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Red belt", "[레드벨트 필수]~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Blue belt", "[블루벨트~~~"),
        noticeElements("Common", "토익~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~"),
        noticeElements("Unknown", "~~~")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val temp = findViewById<RecyclerView>(R.id.mRecyclerView)

        val mAdapter = noticementRvAdapter(this, noticements)
        { noticeElements ->
            Toast.makeText(this, "${noticeElements.title} " +
                    "이 버튼을 누르면 다음 사이트로 이동합니다:https://www.jbnu.ac.kr/kor/?menuID=139&mode=view&no=?????", Toast.LENGTH_SHORT).show()
        }


        temp.adapter = mAdapter


        val lm = LinearLayoutManager(this)
        temp.layoutManager = lm
        temp.setHasFixedSize(true)
    }
}
//https://blog.yena.io/studynote/2017/12/06/Android-Kotlin-RecyclerView1.html