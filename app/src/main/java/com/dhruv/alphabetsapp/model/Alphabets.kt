package com.dhruv.alphabetsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.sql.RowId

data class Alphabets(@StringRes val stringResourceId: Int, @DrawableRes val imgResourceId: Int) {
}