package com.demo.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class LoginFragment : Fragment(),View.OnClickListener  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.login_tab_fragment, container, false)
        Toast.makeText(context,"in",Toast.LENGTH_LONG).show()
        Log.i("Hello","Hi")
        val location: Button = rootView.findViewById(R.id.login_button)
        location.setOnClickListener(this)
        return rootView
    }

    override fun onClick(v: View) {
        Toast.makeText(context,"test",Toast.LENGTH_LONG).show()
    }

}

