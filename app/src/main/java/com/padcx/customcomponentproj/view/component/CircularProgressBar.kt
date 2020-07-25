//package com.padcx.customcomponentproj.view.component
//
//import android.annotation.TargetApi
//import android.content.Context
//import android.graphics.Paint
//import android.graphics.Path
//import android.graphics.Rect
//import android.graphics.RectF
//import android.os.Build
//import android.util.AttributeSet
//import android.view.View
//import androidx.test.runner.intent.IntentStubberRegistry.reset
//import java.awt.font.ShapeGraphicAttribute.STROKE
//
//
//class CircularProgressBar @JvmOverloads constructor(
//    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
//) : View(context, attrs, defStyleAttr) {
//
//    private var max = 100
//
//    private var progress = 0
//
//    private val path: Path = Path()
//
//   // var color = -0xbb371b
//
//    private var paint: Paint? = null
//
//    private var mPaintProgress: Paint? = null
//
//    private var mRectF: RectF? = null
//
//    private var textPaint: Paint? = null
//
//    private var text = "0%"
//
//    private val textBounds: Rect = Rect()
//
//    private var centerY = 0
//
//    private var centerX = 0
//
//    private var swipeAndgle = 0
//
//
//    fun CustomProgressBar(context: Context?) {
//        super(context)
//        initUI()
//    }
//
//    fun CustomProgressBar(
//        context: Context?,
//        attrs: AttributeSet?
//    ) {
//        super(context, attrs)
//        initUI()
//    }
//
//    fun CustomProgressBar(
//        context: Context?,
//        attrs: AttributeSet?,
//        defStyleAttr: Int
//    ) {
//        super(context, attrs, defStyleAttr)
//        initUI()
//    }
//
//    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//    fun CustomProgressBar(
//        context: Context?,
//        attrs: AttributeSet?,
//        defStyleAttr: Int,
//        defStyleRes: Int
//    ) {
//        super(context, attrs, defStyleAttr, defStyleRes)
//        initUI()
//    }
//
//    private fun initUI() {
//        paint = Paint()
//        paint.setAntiAlias(true)
//        paint.setStrokeWidth(UiUtils.dpToPx(context, 1))
//        paint.setStyle(Paint.Style.STROKE)
//        paint.setColor(color)
//        mPaintProgress = Paint()
//        mPaintProgress.setAntiAlias(true)
//        mPaintProgress.setStyle(Paint.Style.STROKE)
//        mPaintProgress.setStrokeWidth(UiUtils.dpToPx(context, 9))
//        mPaintProgress.setColor(color)
//        textPaint = Paint()
//        textPaint.setAntiAlias(true)
//        textPaint.setStyle(Paint.Style.FILL)
//        textPaint.setColor(color)
//        textPaint.setStrokeWidth(2)
//    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        val viewWidth = MeasureSpec.getSize(widthMeasureSpec)
//        val viewHeight = MeasureSpec.getSize(heightMeasureSpec)
//        val radius: Int =
//            (Math.min(viewWidth, viewHeight) - UiUtils.dpToPx(context, 2)) / 2
//        path.reset()
//        centerX = viewWidth / 2
//        centerY = viewHeight / 2
//        path.addCircle(centerX, centerY, radius, Path.Direction.CW)
//        var smallCirclRadius: Int = radius - UiUtils.dpToPx(context, 7)
//        path.addCircle(centerX, centerY, smallCirclRadius, Path.Direction.CW)
//        smallCirclRadius += UiUtils.dpToPx(context, 4)
//        mRectF = RectF(
//            (centerX - smallCirclRadius).toFloat(),
//            (centerY - smallCirclRadius).toFloat(),
//            (centerX + smallCirclRadius).toFloat(),
//            (centerY + smallCirclRadius).toFloat()
//        )
//        textPaint.setTextSize(radius * 0.5f)
//    }
//
//
//    override fun onDraw(canvas: Canvas) {
//        super.onDraw(canvas)
//        canvas.drawPath(path, paint)
//        canvas.drawArc(mRectF, 270, swipeAndgle, false, mPaintProgress)
//        drawTextCentred(canvas)
//    }
//
//    fun drawTextCentred(canvas: Canvas) {
//        textPaint.getTextBounds(text, 0, text.length, textBounds)
//        canvas.drawText(
//            text,
//            centerX - textBounds.exactCenterX(),
//            centerY - textBounds.exactCenterY(),
//            textPaint
//        )
//    }
//
//    fun setMax(max: Int) {
//        this.max = max
//    }
//
//    fun setProgress(progress: Int) {
//        this.progress = progress
//        val percentage = progress * 100 / max
//        swipeAndgle = percentage * 360 / 100
//        text = "$percentage%"
//        invalidate()
//    }
//
//    fun setColor(color: Int) {
//        this.color = color
//    }
//}