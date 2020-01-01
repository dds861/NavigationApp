package com.dd.navigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dd.navigationapp.dummy.DummyContent

class MainActivity : AppCompatActivity(), PlayersFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
