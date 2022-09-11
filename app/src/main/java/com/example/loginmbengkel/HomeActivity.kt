package com.example.loginmbengkel

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.homeContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setupActionBarWithNavController(bottomNavigationView)
//        changeFragment(FragmentMahasiswa())
    }

    fun changeFragment(fragment: Fragment?) {
        if (fragment != null) {
            getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment, fragment)
                .commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = MenuInflater(this)
//        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == R.id.menu_mahasiswa){
//            changeFragment(FragmentMahasiswa())
//        } else if (item.itemId == R.id.menu_dosen){
//            changeFragment(FragmentDosen())
//        } else {
//            val builder: AlertDialog.Builder = AlertDialog.Builder(this@HomeActivity)
//            builder.setMessage("Are you sure want to exit?")
//                .setPositiveButton("Yes", object : DialogInterface.OnClickListener {
//                    override fun onClick(dialogInterface: DialogInterface, i: Int) {
//
//                        finishAndRemoveTask()
//                    }
//                })
//                .show()
//        }
        return super.onOptionsItemSelected(item)
    }
}
