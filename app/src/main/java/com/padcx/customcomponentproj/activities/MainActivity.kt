package com.padcx.customcomponentproj.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcx.customcomponentproj.R
import com.padcx.customcomponentproj.adapters.TaskListAdapter
import com.padcx.customcomponentproj.data.vos.PeopleEntity
import com.padcx.customcomponentproj.mvp.presenter.MainPresenter
import com.padcx.customcomponentproj.mvp.presenter.MainPresenterImpl
import com.padcx.customcomponentproj.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity(),MainView {


    private lateinit var mAdapter: TaskListAdapter
    private lateinit var mPresenter :MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = MainPresenterImpl()

       // progressBar()
        spinner()
        setUpRecycler()
        mPresenter.onUiReady(this)

        buttonClick()

       // val date = resource.getStringArray

    }

    private fun buttonClick() {
        imgfirpeople.setOnClickListener {

            startActivity(ProfileActivity.newIntent(this))
        }
        imgsecondPeople.setOnClickListener {
            startActivity(ProfileActivity.newIntent(this))
        }
        imgthirdpeople.setOnClickListener {
            startActivity(ProfileActivity.newIntent(this))
        }
        imgaddpeople.setOnClickListener {
           startActivity(CreateTaskActivity.newIntent(this))
        }
    }

    private fun setUpRecycler() {
        mAdapter = TaskListAdapter(mPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rctask.layoutManager = linearLayoutManager
        rctask.adapter = mAdapter
    }

    private fun spinner() {
        val spinner: Spinner = findViewById(R.id.spinnerDate)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.Date,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    private fun progressBar() {
//        new Thread(new Runnable() {
//            public void run() {
//                final int presentage=0;
//                while (mProgressStatus < 63) {
//                    mProgressStatus += 1;
//                    // Update the progress bar
//                    mHandler.post(new Runnable() {
//                        public void run() {
//                            progBar.setProgress(mProgressStatus);
//                            text.setText(""+mProgressStatus+"%");
//
//                        }
//                    });
//                    try {
//
//
//
//                        Thread.sleep(50);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
 //   }
    }

    override fun displayPeopleList(list: List<PeopleEntity>) {
        mAdapter.setNewData(list.toMutableList())
    }

    override fun navigateToProfileScreen() {
        startActivity(ProfileActivity.newIntent(this))
    }

    override fun navigateToCreateTask() {
        startActivity(CreateTaskActivity.newIntent(this))
    }
}
