package com.example.examath


import android.R.attr.label
import android.R.attr.text
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.examath.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){
    private lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Removing status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//-----------------------Navigation Drawer--------------------------------------------------
        setSupportActionBar(binding.toolbar)


        //Action bar toggle creation
        val toggle = ActionBarDrawerToggle(this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.open_nav,
            R.string.close_nav)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        //On Click: copy the email textview
val mail = findViewById<TextView>(R.id.mail)
        mail.setOnClickListener {
            val clipboard: ClipboardManager =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("TextView", mail.getText().toString())
            clipboard.setPrimaryClip(clip)
            val toast: Toast = Toast.makeText(this@MainActivity, R.string.copy_mail, Toast.LENGTH_LONG)
            toast.show()
        }


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController, binding.drawerLayout)
        binding.navView.setupWithNavController(navController)

        binding.navView.setNavigationItemSelectedListener { menuItem ->
            // Закрывает Navigation Drawer после нажатия элемента меню
            binding.drawerLayout.closeDrawers()

            // Определяем соответствующий фрагмент для выбранного элемента меню
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    val navOptions = NavOptions.Builder()
                        .setPopUpTo(R.id.homeFragment, false)
                        .build()
                    navController.navigate(R.id.homeFragment, null, navOptions)
                    true
                }
                R.id.nav_matrices -> {
                    if (navController.currentDestination?.id != R.id.matricesFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.matricesFragment, false)
                            .build()
                        navController.navigate(R.id.matricesFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_slau -> {
                    if (navController.currentDestination?.id != R.id.slauFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.slauFragment, false)
                            .build()
                        navController.navigate(R.id.slauFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_vect    -> {
                    if (navController.currentDestination?.id != R.id.vectFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.vectFragment, false)
                            .build()
                        navController.navigate(R.id.vectFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_lae    -> {
                    if (navController.currentDestination?.id != R.id.laeFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.laeFragment, false)
                            .build()
                        navController.navigate(R.id.laeFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_ag    -> {
                    if (navController.currentDestination?.id != R.id.agFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.agFragment, false)
                            .build()
                        navController.navigate(R.id.agFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_ags    -> {
                    if (navController.currentDestination?.id != R.id.agsFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.agsFragment, false)
                            .build()
                        navController.navigate(R.id.agsFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_func    -> {
                    if (navController.currentDestination?.id != R.id.funcFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.funcFragment, false)
                            .build()
                        navController.navigate(R.id.funcFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_pr    -> {
                    if (navController.currentDestination?.id != R.id.prFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.prFragment, false)
                            .build()
                        navController.navigate(R.id.prFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_prlist    -> {
                    if (navController.currentDestination?.id != R.id.prlistFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.prlistFragment, false)
                            .build()
                        navController.navigate(R.id.prlistFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_in    -> {
                    if (navController.currentDestination?.id != R.id.inFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.inFragment, false)
                            .build()
                        navController.navigate(R.id.inFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_inlist    -> {
                    if (navController.currentDestination?.id != R.id.indefiniteFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.indefiniteFragment, false)
                            .build()
                        navController.navigate(R.id.indefiniteFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_de    -> {
                    if (navController.currentDestination?.id != R.id.definiteFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.definiteFragment, false)
                            .build()
                        navController.navigate(R.id.definiteFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_ap    -> {
                    if (navController.currentDestination?.id != R.id.apFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.apFragment, false)
                            .build()
                        navController.navigate(R.id.apFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_ns    -> {
                    if (navController.currentDestination?.id != R.id.nsFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.nsFragment, false)
                            .build()
                        navController.navigate(R.id.nsFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_fs    -> {
                    if (navController.currentDestination?.id != R.id.fsFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.fsFragment, false)
                            .build()
                        navController.navigate(R.id.fsFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_fmp    -> {
                    if (navController.currentDestination?.id != R.id.fmpFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.fmpFragment, false)
                            .build()
                        navController.navigate(R.id.fmpFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                R.id.nav_du    -> {
                    if (navController.currentDestination?.id != R.id.duFragment) {
                        val navOptions = NavOptions.Builder()
                            .setPopUpTo(R.id.duFragment, false)
                            .build()
                        navController.navigate(R.id.duFragment, null, navOptions)
                        true
                    }
                    else {
                        false
                    }
                }
                else -> false
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    //----------------------------------------------------------------------------------------------
}