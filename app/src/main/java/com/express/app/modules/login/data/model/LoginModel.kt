package com.express.app.modules.login.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDonTHaveA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
