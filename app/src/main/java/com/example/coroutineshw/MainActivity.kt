package com.example.coroutineshw


import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.coroutineshw.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.net.HttpURLConnection
import java.net.URL

private lateinit var binding: ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val images = ImageList()
    var count = 0

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** setup viewbinding */
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root

        setContentView(view)

        /** perform network connection in a separate Coroutine
         */
        GlobalScope.launch(Dispatchers.IO) {
            val imageUrl =
                URL(images.image1)

            val httpConnection: HttpURLConnection = imageUrl.openConnection() as HttpURLConnection
            httpConnection.doInput = true
            httpConnection.connect()

            val inputStream = httpConnection.inputStream
            val bitmapImage = BitmapFactory.decodeStream(inputStream)

            launch(Dispatchers.Main){
                binding.ImageView.setImageBitmap(bitmapImage)
                binding.TextDescription.text = images.text1
            }
        }

        binding.TextDescription.setOnClickListener {
            try{
                when (count) {
                    0 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image2)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text2
                            }
                        }
                    }
                    1 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image3)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text3
                            }
                        }
                    }
                    2 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image4)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)
                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text4
                            }
                        }
                    }
                    3 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image5)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text5
                            }
                        }
                    }
                    4 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image6)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text6
                            }
                        }
                    }
                    5 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image7)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text7
                            }
                        }
                    }
                    6 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image8)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text8
                            }
                        }
                    }
                    7 -> {
                        count++
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image9)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text9
                            }
                        }
                    }
                    8 -> {
                        count = 0
                        val job = GlobalScope.launch(Dispatchers.IO) {
                            delay(2000L)
                            val imageUrl = URL(images.image10)

                            val httpConnection = imageUrl.openConnection() as HttpURLConnection
                            httpConnection.doInput = true
                            httpConnection.connect()

                            val inputStream = httpConnection.inputStream
                            val bitmapImage = BitmapFactory.decodeStream(inputStream)

                            launch(Dispatchers.Main) {
                                binding.ImageView.setImageBitmap(bitmapImage)
                                binding.TextDescription.text = images.text10
                            }
                        }
                    }
                }


            } catch (e : Exception){
                binding.TextDescription.text = "An error has occurred!"
            }
        }
    }

}