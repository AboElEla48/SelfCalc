package eg.foureg.selfcalc.prays

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import eg.foureg.selfcalc.data.Pray

class PraysListViewModel : ViewModel() {
    var praysDate : MutableLiveData<Long> = MutableLiveData()
    var praysList : MutableLiveData<List<Pray>> = MutableLiveData()
}