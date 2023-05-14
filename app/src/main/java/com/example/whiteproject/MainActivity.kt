package com.example.whiteproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.whiteproject.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    lateinit var myToggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val drawerLayout: DrawerLayout = findViewById(R.id.myDrawerLayout)
    val navView: NavigationView = findViewById(R.id.myDrawerView)

    myToggle = ActionBarDrawerToggle(this, drawerLayout, 0, 0 )
    binding.myDrawerLayout.addDrawerListener(myToggle)


     myToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

     navView.setNavigationItemSelectedListener {
    when (it.itemId) {


        R.id.scheduleId -> {
            startActivity(Intent(this, Schedule::class.java))
        }
        R.id.testimonialId -> {
            startActivity(Intent(this, Testimonial::class.java))}
        R.id.productsId -> {
            startActivity(Intent(this, Products::class.java))}
    }
         true
    }
     }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (myToggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}