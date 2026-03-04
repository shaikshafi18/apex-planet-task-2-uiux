package com.example.task2_uiux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val api = RetrofitClient.instance

        api.getPosts().enqueue(object : Callback<List<Post>> {

            override fun onResponse(
                call: Call<List<Post>>,
                response: Response<List<Post>>
            ) {

                if (response.isSuccessful) {

                    val posts = response.body() ?: emptyList()

                    val adapter = PostAdapter(posts)
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

            }

        })
    }
}