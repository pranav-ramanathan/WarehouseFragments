package com.android.pranav.warehouse1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.pranav.warehouse1.databinding.LoginFragmentBinding

class loginFragment : Fragment() {

    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = LoginFragmentBinding.inflate(inflater)

        binding.otpButton.setOnClickListener { view : View ->
            binding.apply {
                if(phoneInput.text.toString() != ""){
                    view.findNavController().navigate(R.id.action_loginFragment_to_otpFragment)
                }

            }

        }
        return binding.root
    }

}