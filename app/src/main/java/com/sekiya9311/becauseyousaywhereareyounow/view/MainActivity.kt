package com.sekiya9311.becauseyousaywhereareyounow.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.sekiya9311.becauseyousaywhereareyounow.R
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragmentFactory = object : FragmentFactory() {
                override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
                    if (className == DestSettingFragment::class.java.name) {
                        return DestSettingFragment()
                    }
                    return super.instantiate(classLoader, className)
                }
            }

            val destSettingFragment = fragmentFactory
                .instantiate(classLoader, DestSettingFragment::class.java.name)
            supportFragmentManager
                .beginTransaction()
                .add(R.id.viewer, destSettingFragment)
                .commit()
        }
    }
}
