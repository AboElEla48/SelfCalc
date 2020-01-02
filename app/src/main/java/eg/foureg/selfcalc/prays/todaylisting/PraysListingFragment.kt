package eg.foureg.selfcalc.prays.todaylisting

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import eg.foureg.selfcalc.R

class PraysListingFragment : Fragment() {

    companion object {
        fun newInstance() = PraysListingFragment()
    }

    private lateinit var viewModel: PraysListingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.prays_listing_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PraysListingViewModel::class.java)

    }

}
