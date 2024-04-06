package uz.gita.dictionary_app.utils.extensions.extentions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import uz.gita.dictionary_app.R


fun FragmentActivity.addFragment(fm: Fragment) {
    supportFragmentManager
        .beginTransaction()
        .add(R.id.drawer_layout, fm)
        .commit()
}