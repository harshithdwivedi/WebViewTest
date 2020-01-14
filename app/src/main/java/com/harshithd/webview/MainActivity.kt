package com.harshithd.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                Log.e("TAG", "loaded")
//                injectJS()
            }
        }
//        webViewParent.settings.javaScriptEnabled = true
        webViewParent.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                Log.e("TAG", "loaded")
//                injectJS()
            }
        }
        webView.loadUrl("https://vdo.ai/apptest")
        webViewParent.loadUrl("https://www.google.com")
    }

//    private fun injectJS() {
//        try {
//            val inputStream = assets.open("main.js")
//            inputStream.bufferedReader().use(BufferedReader::readText)
//        } catch (e: Exception) {
//            null
//        }?.let { webView.loadUrl("javascript:($it)()") }
//    }

}
