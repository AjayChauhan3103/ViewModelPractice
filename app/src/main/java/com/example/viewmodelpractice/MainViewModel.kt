package com.example.viewmodelpractice

import android.content.Context

import androidx.lifecycle.ViewModel


 class MainViewModel(): ViewModel() {

    var show : String = ""
     var mainResult : Int =0

     fun result(first:Int, command : String ){

         if(command == "+")
         {
             show = first.toString()
         }
         else if (command == "-")
         {
//             sub(first)
             show  = first.toString()
         }

     }
     fun add(second:Int){

         mainResult = show.toInt() + second

     }


     fun sub(value : Int){

        mainResult = show.toInt() - value

     }



}