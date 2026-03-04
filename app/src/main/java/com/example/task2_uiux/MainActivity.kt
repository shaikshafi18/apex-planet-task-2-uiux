package com.example.task2_uiux

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailField = findViewById<EditText>(R.id.emailField)
        val passwordField = findViewById<EditText>(R.id.passwordField)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {

            val email = emailField.text.toString().trim()
            val password = passwordField.text.toString().trim()

            // Validation
            if (email.isEmpty()) {
                emailField.error = "Email required"
                emailField.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                passwordField.error = "Password required"
                passwordField.requestFocus()
                return@setOnClickListener
            }

            // API call
            val api = RetrofitClient.instance

            api.getPosts().enqueue(object : Callback<List<Post>> {

                override fun onResponse(
                    call: Call<List<Post>>,
                    response: Response<List<Post>>
                ) {

                    if (response.isSuccessful) {

                        val posts = response.body()

                        Toast.makeText(
                            this@MainActivity,
                            "Posts fetched: ${posts?.size}",
                            Toast.LENGTH_LONG
                        ).show()

                        // Navigate to Home Screen
                        val intent = Intent(this@MainActivity, HomeActivity::class.java)
                        startActivity(intent)
                        finish()
                    }
                }

                override fun onFailure(
                    call: Call<List<Post>>,
                    t: Throwable
                ) {

                    Toast.makeText(
                        this@MainActivity,
                        "Error: ${t.message}",
                        Toast.LENGTH_LONG
                    ).show()
                }

            })

        }
    }
}