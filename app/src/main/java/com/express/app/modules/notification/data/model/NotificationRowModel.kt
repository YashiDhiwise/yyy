package com.express.app.modules.notification.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)

)
