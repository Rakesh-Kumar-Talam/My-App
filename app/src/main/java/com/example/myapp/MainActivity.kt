package com.example.myapp

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.telephony.SmsManager
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG="MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(TAG, "activity created")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "activity paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "activity destroyed")
    }

    fun Mybutton(view: View) {

        Log.i("MainActivity", "Mybutton: button clicked")
        var dail:Intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:7981036722"))
        startActivity(dail)
    }

    fun Website(view: View) {
        var web:Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
        startActivity(web)
    }

    fun Activity_Example(view: View) {
        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("mykey","refer my app2 - rakesh")
        startActivity(hIntent)
    }

    fun showNotification(view: View) {
        createNotificationChannel()
        val intent = Intent(this, HomeActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)


        var builder = NotificationCompat.Builder(this, "CHANNEL_ID")
            .setSmallIcon(R.drawable.baseline_account_balance_24)
            .setContentTitle("vit title")
            .setContentText("vit text android app dev")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)

        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(123,builder.build())
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is not in the Support Library.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "promotions channel name"
            //getString(R.string.channel_name)
            val descriptionText = "channel description"
            //getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("CHANNEL_ID", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system.
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun sendSms(view: View) {
        Log.i("HomeActivity","current system time in millis"+ SystemClock.elapsedRealtime())
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        var triggerTime = System.currentTimeMillis()+30*60   //set the date and time of your friennds birthday
        //SystemClock.elapsedRealtime() + AlarmManager.INTERVAL_FIFTEEN_MINUTES

        val intent = Intent(this, HomeActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        //alarmManager.canScheduleExactAlarms()
        alarmManager.set(AlarmManager.RTC,triggerTime,pendingIntent)

        //  alarmManager.setRepeating(AlarmManager.RTC,triggerTime,24*60*60*1000,pendingIntent)

    }
}