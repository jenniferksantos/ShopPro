package com.jenniferksantos.shoppro.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MSPButton(context: Context, attribute: AttributeSet) : AppCompatButton(context, attribute) {

    // The init block runs every time the class is initiated.
    init {
        // Call the function to apply the font to the components.
        applyFont()
    }
    // Applies a font to a Button.
    private fun applyFont(){

        //This is used 2 get the file from assets folder n set it 2 the title textView
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Bold.ttf")
        setTypeface(typeface)
    }
}