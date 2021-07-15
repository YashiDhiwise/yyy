package com.express.app.modules.lailyfafebrinacard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.express.app.R
import com.express.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.express.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

public class LailyfaFebrinaCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLailyfaFebrinaCardBinding

  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_lailyfa_febrina_card)
    binding.lifecycleOwner = this
    binding.lailyfaFebrinaCardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"
  }
}
