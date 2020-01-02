package eg.foureg.selfcalc.prays

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import eg.foureg.selfcalc.R
import eg.foureg.selfcalc.prays.todaylisting.PraysListingFragment

class PraysListAc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prays_list)

        // set listing fragment
        supportFragmentManager.beginTransaction().replace(R.id.prays_ac_frg_container, PraysListingFragment.newInstance()).commit()
    }
}
