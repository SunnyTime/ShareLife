package com.du.sharelife

import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigator
import androidx.navigation.findNavController
import androidx.navigation.navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.alibaba.android.arouter.launcher.ARouter
import com.du.library.key.RouterKey
import com.du.log.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.to_home)

        button.setOnClickListener {
            ARouter.getInstance().build(RouterKey.HOME_ACTIVITY).navigation()
            Logger.t("MainActivity---->").e("Click")
        }
    }
}
