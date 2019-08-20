package eg.foureg.selfcalc.prays

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import eg.foureg.selfcalc.R

class PraysListAc : AppCompatActivity() {

    lateinit var praysViewModel : PraysListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prays_list)

        praysViewModel = ViewModelProviders.of(this).get(PraysListViewModel::class.java)
    }
}
