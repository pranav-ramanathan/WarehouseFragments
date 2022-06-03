package com.android.pranav.warehouse1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.pranav.warehouse1.databinding.LoginFragmentBinding

class loginFragment : Fragment() {

    lateinit var binding: LoginFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate<LoginFragmentBinding>(inflater,
            R.layout.login_fragment,container,false)

//        binding.otpButton.setOnClickListener { view : View ->
//            view.findNavController().navigate(R.id.action_loginFragment_to_otpFragment)
//        }
        return binding.root
    }

}