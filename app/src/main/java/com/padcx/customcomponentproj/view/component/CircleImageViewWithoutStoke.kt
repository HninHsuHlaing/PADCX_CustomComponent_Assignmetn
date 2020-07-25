package com.padcx.customcomponentproj.view.component

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
import com.padcx.customcomponentproj.R

class CircleImageViewWithoutStoke @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var cornerRadius = 0f
    private val path = Path()
    private val borderColor = Color.BLACK
    private val borderWidth = 2.0f

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageCorner){
            cornerRadius = getDimension(R.styleable.CircleImageCorner_cornerRadius,0f)
        }
    }
    override fun onDraw(canvas: Canvas) {
        // drawStroke(canvas)
        val rectangle = RectF(2f,2f,width.toFloat()-2,height.toFloat()-2)
        path.addRoundRect(rectangle,cornerRadius,cornerRadius, Path.Direction.CCW)
        drawStroke(canvas)
        canvas.clipPath(path)
        super.onDraw(canvas)
    }
    private fun drawStroke(canvas: Canvas) {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        val radius = width / 2f

        /* Border paint */
        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2f
        canvas.drawCircle(width / 2f, width / 2f, radius - borderWidth / 2f, paint)
    }
}