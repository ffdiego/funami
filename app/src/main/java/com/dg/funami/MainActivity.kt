package com.dg.funami

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.dg.funami.models.RadioStation
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private var radioStation: RadioStation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val navigationView: NavigationView = findViewById(R.id.nav_view)

        // Adiciona um ouvinte para eventos de clique nos itens do menu
        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_item_1 -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.tela, PlayFragment())
                        .commit()
                    toggleDrawer()
                }
                R.id.nav_item_2 -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.tela, ManagerFragment())
                        .commit()
                    toggleDrawer()
                }
            }
            true
        }
    }

    fun toggleDrawer(view: View? = null) {
        val drawerLayout = findViewById<DrawerLayout>(R.id.mainDrawerLayout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    fun tocaMusica(view: View? = null) {
        if(view != null) {
            val radioStation = RadioStation(view.context)
            radioStation.play()        }
    }
}