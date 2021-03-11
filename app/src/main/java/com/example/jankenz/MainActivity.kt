

package com.example.jankenz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gu.setOnClickListener { onJankenButtonTapped(it) }
        choki.setOnClickListener { onJankenButtonTapped(it) }
        pa.setOnClickListener { onJankenButtonTapped(it) }
    }

    //ここから
    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this, ResultActivity::class.java)
        // インスタンスの状態を格納
        // MY_HANDキーの名前は任意
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}
