package com.anwesh.uiprojects.linkedpartlineshootview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.partlineshootview.PartLineShootView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PartLineShootView.create(this)
    }
}
