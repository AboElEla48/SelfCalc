package eg.foureg.selfcalc.prays.todaylisting

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckedTextView
import eg.foureg.selfcalc.R
import kotlinx.android.synthetic.main.prays_listing_fragment.*

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

        initViews()
    }

    private fun initViews() {

        viewModel.fajrChecked.observe(this, Observer { checked ->
            setCheckVal(prays_listing_frg_fajr_checkbox, checked!!)
        })

        prays_listing_frg_fajr_checkbox.setOnClickListener {
            viewModel.fajrChecked.value = !viewModel.fajrChecked.value!!
            setCheckVal(prays_listing_frg_fajr_checkbox, viewModel.fajrChecked.value!!)
        }




        viewModel.zohrChecked.observe(this, Observer { checked ->
            setCheckVal(prays_listing_frg_zohr_checkbox, checked!!)
        })

        prays_listing_frg_zohr_checkbox.setOnClickListener {
            viewModel.zohrChecked.value = !viewModel.zohrChecked.value!!
            setCheckVal(prays_listing_frg_zohr_checkbox, viewModel.zohrChecked.value!!)
        }



        viewModel.asrChecked.observe(this, Observer { checked ->
            setCheckVal(prays_listing_frg_asr_checkbox, checked!!)
        })

        prays_listing_frg_asr_checkbox.setOnClickListener {
            viewModel.asrChecked.value  = !viewModel.asrChecked.value!!
            setCheckVal(prays_listing_frg_asr_checkbox, viewModel.asrChecked.value!!)
        }



        viewModel.maghribChecked.observe(this, Observer { checked ->
            setCheckVal(prays_listing_frg_maghrib_checkbox, checked!!)
        })

        prays_listing_frg_maghrib_checkbox.setOnClickListener {
            viewModel.maghribChecked.value = !viewModel.maghribChecked.value!!
            setCheckVal(prays_listing_frg_maghrib_checkbox, viewModel.maghribChecked.value!!)
        }



        viewModel.ishaChecked.observe(this, Observer { checked ->
            setCheckVal(prays_listing_frg_isha_checkbox, checked!!)
        })

        prays_listing_frg_isha_checkbox.setOnClickListener {
            viewModel.ishaChecked.value = !viewModel.ishaChecked.value!!
            setCheckVal(prays_listing_frg_isha_checkbox, viewModel.ishaChecked.value!!)
        }
    }


    private fun setCheckVal(view: CheckedTextView, checked: Boolean) {
        // set view as checked according to given boolean value
        view.isChecked = checked

        // set check drawable according to check status
        view.checkMarkDrawable = if (checked)
            resources.getDrawable(R.drawable.checked, null)
        else
            resources.getDrawable(R.drawable.unchecked, null)
    }

}
