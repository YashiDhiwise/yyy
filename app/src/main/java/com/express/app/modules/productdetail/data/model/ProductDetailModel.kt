package com.express.app.modules.productdetail.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class ProductDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSeeMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)

)
