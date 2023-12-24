package com.dg.funami

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.drawerlayout.widget.DrawerLayout
import com.dg.funami.ui.theme.FunamiTheme
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        // Define os itens do menu
        val menu = NavigationView(this).apply {
            inflateMenu(R.menu.menu_main)
        }

        Log.d("zzz", "vai começar")

        // Adiciona um ouvinte para eventos de clique nos itens do menu
        menu.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_item_1 -> {
                    val fragment = PlayFragment()
                    val fragmentManager = supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.tela, fragment)


                }
                R.id.nav_item_2 -> {

                }
            }
            true
        }

    }

    fun clicouDinossauro(id: Int) {
        Log.d("zzz", "clicou $id")
    }
}