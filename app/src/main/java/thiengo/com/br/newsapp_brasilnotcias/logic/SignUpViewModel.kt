package thiengo.com.br.newsapp_brasilnotcias.logic

import android.arch.lifecycle.ViewModel
import thiengo.com.br.newsapp_brasilnotcias.domain.User

/**
 * Created by viniciusthiengo on 15/10/17.
 */
class SignUpViewModel: ViewModel() {

    val user: User

    init {
        user = User()
    }

    fun updateUserPersonalData(imagePath: String, name: String, profession: String){
        user.imagePath = imagePath
        user.name = name
        user.profession = profession
    }

    fun updateUserAccessData(email: String, password: String){
        user.email = email
        user.password = password
    }

    fun updateUserTermsData( status: Boolean ){
        user.statusTerms = status
    }
}