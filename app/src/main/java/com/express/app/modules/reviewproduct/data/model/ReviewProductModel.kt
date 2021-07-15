package com.express.app.modules.reviewproduct.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGriffinRod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_griffin_rod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtAirMaxAreAlw1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDecember1020: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
