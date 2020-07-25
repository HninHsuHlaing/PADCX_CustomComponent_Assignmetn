package com.padcx.customcomponentproj.view.component

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.withStyledAttributes
import com.padcx.customcomponentproj.R

class ButtonComposite @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {
    private var cornerRadius = 0f
    private val path = Path()
    private val borderColor = Color.WHITE
    private val borderWidth = 0.0f

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageCorner){
            cornerRadius = getDimension(R.styleable.CircleImageCorner_cornerRadius,0f)
        }
    }
    override fun onDraw(canvas: Canvas) {
        // drawStroke(canvas)
        val rectangle = RectF(0f,0f,width.toFloat(),height.toFloat())
        path.addRoundRect(rectangle,cornerRadius,cornerRadius, Path.Direction.CCW)
        canvas.clipPath(path)
        super.onDraw(canvas)
    }
}