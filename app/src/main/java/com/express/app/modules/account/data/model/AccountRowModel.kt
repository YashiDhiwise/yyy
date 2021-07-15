package com.express.app.modules.account.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class AccountRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
