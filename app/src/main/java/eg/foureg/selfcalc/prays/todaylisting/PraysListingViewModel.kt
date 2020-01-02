package eg.foureg.selfcalc.prays.todaylisting

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PraysListingViewModel : ViewModel() {
    var fajrChecked = MutableLiveData<Boolean>()
    var zohrChecked = MutableLiveData<Boolean>()
    var asrChecked = MutableLiveData<Boolean>()
    var maghribChecked = MutableLiveData<Boolean>()
    var ishaChecked = MutableLiveData<Boolean>()

    init {
        fajrChecked.value = false
        zohrChecked.value = false
        asrChecked.value = false
        maghribChecked.value = false
        ishaChecked.value = false
    }
}
