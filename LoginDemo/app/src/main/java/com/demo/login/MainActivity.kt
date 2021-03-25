package com.demo.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

   private lateinit var tabLayout:TabLayout
   private lateinit var viewPager: ViewPager2
   private lateinit var floatbut:FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tapLayout);
        viewPager = findViewById(R.id.viewpager);
        floatbut = findViewById(R.id.googleActionButton);


       /* tabLayout.addTab(tabLayout.newTab().setText("Login"))
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL*/
        val adapter = ViewPageAdapter()
        //viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Login"
                else -> tab.text = "SignUp"
            }
        }.attach() //this replaces the tabLayout.setupWithViewPager() from ViewPager API*/




    }

}

