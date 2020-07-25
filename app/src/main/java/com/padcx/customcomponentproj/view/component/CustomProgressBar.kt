package com.padcx.customcomponentproj.view.component

import android.annotation.TargetApi
import android.content.Context
import android.graphics.*
import android.os.Build
import android.util.AttributeSet
import android.view.View
//import com.investorfinder.utils.UiUtils


class CustomProgressBar : View {
    private var max = 100
    private var progress = 0
    private val path = Path()
   // var color = -0xbb371b
    private val color = Color.GREEN
    private var paint: Paint? = null
    private var mPaintProgress: Paint? = null
    private var mRectF: RectF? = null
    private var textPaint: Paint? = null
    private var text = "0%"
    private val textBounds = Rect()
    private var centerY = 0
    private var centerX = 0
    private var swipeAndgle = 0

    constructor(context: Context?) : super(context) {
        initUI()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        initUI()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        initUI()
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initUI()
    }

    private fun initUI() {
        paint = Paint()
        paint!!.isAntiAlias = true
       // paint!!.strokeWidth = UiUtils.dpToPx(context, 1)
        paint!!.style = Paint.Style.STROKE
        paint!!.color = color
        mPaintProgress = Paint()
        mPaintProgress!!.isAntiAlias = true
        mPaintProgress!!.style = Paint.Style.STROKE
        //mPaintProgress!!.strokeWidth = UiUtils.dpToPx(context, 9)
        mPaintProgress!!.color = color
        textPaint = Paint()
        textPaint!!.isAntiAlias = true
        textPaint!!.style = Paint.Style.FILL
        textPaint!!.color = color
        textPaint!!.strokeWidth = 2f
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val viewWidth = MeasureSpec.getSize(widthMeasureSpec)
        val viewHeight = MeasureSpec.getSize(heightMeasureSpec)
       val radius: Int =40
//            (Math.min(viewWidth, viewHeight) - UiUtils.dpToPx(context, 2)) / 2
        path.reset()
        centerX = viewWidth / 2
        centerY = viewHeight / 2
        path.addCircle(
            centerX.toFloat(),
            centerY.toFloat(),
            radius.toFloat(),
            Path.Direction.CW
        )
        var smallCirclRadius: Int =38
            //radius - UiUtils.dpToPx(context, 7)
        path.addCircle(
            centerX.toFloat(),
            centerY.toFloat(),
            smallCirclRadius.toFloat(),
            Path.Direction.CW
        )
        smallCirclRadius += 2
        mRectF = RectF(
            (centerX - smallCirclRadius).toFloat(),
            (centerY - smallCirclRadius).toFloat(),
            (centerX + smallCirclRadius).toFloat(),
            (centerY + smallCirclRadius).toFloat()
        )
        textPaint!!.textSize = radius * 0.5f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawPath(path, paint!!)
        canvas.drawArc(mRectF!!, 270f, swipeAndgle.toFloat(), false, mPaintProgress!!)
        setProgress(68)
        drawTextCentred(canvas)
    }

    fun drawTextCentred(canvas: Canvas) {
        textPaint!!.getTextBounds(text, 0, text.length, textBounds)
        canvas.drawText(
            text,
            centerX - textBounds.exactCenterX(),
            centerY - textBounds.exactCenterY(),
            textPaint!!
        )
    }

    fun setMax(max: Int) {
        this.max = max
    }

    fun setProgress(progress: Int) {
        this.progress = progress
        val percentage = progress * 100 / max
        swipeAndgle = percentage * 360 / 100
        text = "$percentage%"
        invalidate()
    }

//    fun setColor(color: Int) {
//        this.color = color
//    }
}