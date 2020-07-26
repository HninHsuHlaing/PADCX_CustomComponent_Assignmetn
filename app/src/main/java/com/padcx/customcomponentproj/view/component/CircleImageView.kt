package com.padcx.customcomponentproj.view.component

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.withStyledAttributes
//import androidx.core.content.withStyledAttributes
import com.padcx.customcomponentproj.R

class CircleImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var cornerRadius = 0f
    private val path = Path()
    private var borderColor = Color.WHITE
    private var borderWidth = 2.0f

    init {
        context.withStyledAttributes(attrs, R.styleable.CircleImageCorner){
            val attributes = context.obtainStyledAttributes(attrs, R.styleable.CircleImageCorner)
            cornerRadius = getDimension(R.styleable.CircleImageCorner_cornerRadius,0f)
            borderColor = attributes.getColor(R.styleable.CircleImageCorner_cornerColor, Color.WHITE)
            borderWidth = attributes.getDimension(R.styleable.CircleImageCorner_border_width, 0f)
        }
    }
    override fun onDraw(canvas: Canvas) {
       // drawStroke(canvas)
        val rectangle = RectF(3f,2f,width.toFloat()-2,height.toFloat()-2)
        path.addRoundRect(rectangle,cornerRadius,cornerRadius,Path.Direction.CCW)
        drawStroke(canvas)
        canvas.clipPath(path)
        super.onDraw(canvas)
    }
//    private fun drawStroke(canvas: Canvas) {
//        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
//        val radius = width/2f
//
//        /* Border paint */
//        paint.color = borderColor
//        paint.style = Paint.Style.STROKE
//        paint.strokeWidth = 6f
//        canvas.drawCircle(width/2f, width/2f, cornerRadius, paint)
//    }


//    private val borderColor = Color.BLACK
//    private val borderWidth = 20.0f
//
//    constructor(context: Context) : super(context) {}
//
//    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}
//
//    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}
//
//    override fun onDraw(canvas: Canvas) {
//        drawRoundImage(canvas)
//        drawStroke(canvas)
//    }
//
    private fun drawStroke(canvas: Canvas) {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        val radius = (width / 2f)

        /* Border paint */
        paint.color = borderColor
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2f
        canvas.drawCircle(width / 2f, width / 2f, radius - borderWidth / 2f, paint)
    }
//
//    private fun drawRoundImage(canvas: Canvas) {
//        var b: Bitmap = (drawable as BitmapDrawable).bitmap
//        val bitmap = b.copy(Bitmap.Config.ARGB_8888, true)
//
//        /* Scale the bitmap */
//        val scaledBitmap: Bitmap
//        val ratio: Float = bitmap.width.toFloat() / bitmap.height.toFloat()
//        val height: Int = Math.round(width / ratio)
//        scaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false)
//
//        /* Cutting the outer of the circle */
//        val shader: Shader
//        shader = BitmapShader(scaledBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
//
//        val rect = RectF()
//        rect.set(0f, 0f, width.toFloat(), height.toFloat())
//
//        val imagePaint = Paint()
//        imagePaint.isAntiAlias = true
//        imagePaint.shader = shader
//        canvas.drawRoundRect(rect, width.toFloat(), height.toFloat(), imagePaint)
//    }

}