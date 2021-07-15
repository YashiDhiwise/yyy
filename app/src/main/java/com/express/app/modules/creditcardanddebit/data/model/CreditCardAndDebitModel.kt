package com.express.app.modules.creditcardanddebit.`data`.model

import com.express.app.R
import com.express.app.appcomponents.di.MyApp
import kotlin.String

public data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtAddCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card)

)
