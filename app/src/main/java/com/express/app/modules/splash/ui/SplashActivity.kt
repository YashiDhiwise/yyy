package com.express.app.modules.splash.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.express.app.R
import com.express.app.databinding.ActivitySplashBinding
import com.express.app.modules.login.ui.LoginActivity
import com.express.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashBinding

  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)
    binding.lifecycleOwner = this
    binding.splashVM = viewModel
    binding.image.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"
  }
}
