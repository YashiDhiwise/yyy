package com.express.app.modules.offerscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.express.app.R
import com.express.app.databinding.ActivityOfferScreenBinding
import com.express.app.modules.offerscreen.`data`.model.OfferScreenRowModel
import com.express.app.modules.offerscreen.`data`.viewmodel.OfferScreenVM
import com.express.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OfferScreenActivity : AppCompatActivity() {
  private lateinit var binding: ActivityOfferScreenBinding

  private val viewModel: OfferScreenVM by viewModels<OfferScreenVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OfferScreenRowModel
  ): Unit {
    when(view.id) {
        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_offer_screen)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : OfferScreenRowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.offerScreenVM = viewModel
    binding.image.setOnClickListener {
          val destIntent = SearchActivity.getIntent(this, null)
          startActivity(destIntent)
        }
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
