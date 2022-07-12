package com.jenniferksantos.shoppro.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MSPTextViewBold (context: Context, attribute: AttributeSet): AppCompatTextView(context,attribute) {
    init {
        // Call the function to apply the font to the components.
        applyFont()
    }
    private fun applyFont(){

        //This is used 2 get the file from assets folder n set it 2 the title textView
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Bold.ttf")
        setTypeface(typeface)

    }
}