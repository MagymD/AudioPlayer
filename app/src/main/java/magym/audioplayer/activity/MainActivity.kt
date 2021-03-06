package magym.audioplayer.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import magym.audioplayer.R
import magym.core.common.ActivityProvider
import magym.core.common.extention.isOreoOrMore
import magym.feature.service.AudioService


class MainActivity : BaseActivity(), ActivityProvider {
	
	override var isLoading: Boolean
		get() = progressbar.isVisible
		set(value) {
			progressbar.isVisible = value
		}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		startService()
		
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
	
	private companion object {
		
		private fun Context.startService() {
			val serviceIntent = Intent(this, AudioService::class.java)
			
			if (isOreoOrMore()) {
				startForegroundService(serviceIntent)
			} else {
				startService(serviceIntent)
			}
		}
		
	}
	
}