package thiengo.com.br.newsapp_brasilnotcias.fragment

import android.arch.lifecycle.ViewModelProviders
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sign_up_access.*
import kotlinx.android.synthetic.main.fragment_sign_up_personal.*
import thiengo.com.br.newsapp_brasilnotcias.R
import thiengo.com.br.newsapp_brasilnotcias.logic.SignUpViewModel


class SignUpAccessFragment : Fragment() {

    lateinit var signUpViewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        return inflater.inflate(
            R.layout.fragment_sign_up_access,
            container,
            false)
    }

    override fun onStart() {
        super.onStart()

        signUpViewModel = ViewModelProviders.of(activity!!).get(SignUpViewModel::class.java)

        et_email.setText( signUpViewModel.user.email )
        et_password.setText( signUpViewModel.user.password )
    }

    override fun onPause() {
        super.onPause()

        signUpViewModel.updateUserAccessData(
                et_email.text.toString(),
                et_password.text.toString())
    }
}