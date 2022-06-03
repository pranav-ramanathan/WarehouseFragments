package com.android.pranav.warehouse1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.android.pranav.warehouse1.databinding.OtpFragmentBinding

class otpFragment: Fragment() {
    lateinit var binding: OtpFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = OtpFragmentBinding.inflate(inflater)

        binding.confirmPhoneOtp.setOnClickListener {
            binding.apply {
                if (otpInput.text.toString() !== ""){
                    Toast.makeText(requireContext(), "Hello welcome", Toast.LENGTH_LONG).show()
                }
            }

        }


        return binding.root
    }
}
