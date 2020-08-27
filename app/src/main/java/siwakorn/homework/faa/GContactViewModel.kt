package siwakorn.homework.faa

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import siwakorn.homework.faa.database.DatabaseDAO
import siwakorn.homework.faa.databinding.FragmentContactBinding

class GContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}