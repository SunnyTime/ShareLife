package com.du.lifehome.ui

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import butterknife.ButterKnife
import com.alibaba.android.arouter.facade.annotation.Route
import com.du.library.base.BaseActivity
import com.du.library.key.RouterKey
import com.du.lifehome.R
import kotlinx.android.synthetic.main.home_activity_main.*

/**
 * ClassName: HomeActivity
 * Function:
 * Date: 2020-09-02 - 14:49
 * Author 杜时光
 * Version 0.1
 */
@Route(path = RouterKey.HOME_ACTIVITY)
class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)
        ButterKnife.bind(this)
        //val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_community, R.id.navigation_attention,R.id.navigation_user
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)
    }

}