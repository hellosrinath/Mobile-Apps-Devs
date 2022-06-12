package com.sriidea.udemyandroidlearning

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class Compressing(context: Context, params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        return try {
            for (i in 0..3000) {
                Log.i(TAG, "Compressing $i")
            }

            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }

    companion object {
        private const val TAG = "UploadWorker"
        const val KEY_WORKER = "key_worker"
    }
}