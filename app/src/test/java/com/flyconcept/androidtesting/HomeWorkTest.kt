package com.flyconcept.androidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeWorkTest{
    @Test
    fun `when n == 0 return 0`(){
        val fib = HomeWork.fib(0)
        assertThat(fib).isEqualTo(0)
    }
    @Test
    fun `when n ==1 return 1`(){
        val fib = HomeWork.fib(1)
        assertThat(fib).isEqualTo(1)
    }
    @Test
    fun `when n == 4 return 3`(){
        val fib = HomeWork.fib(4)
        assertThat(fib).isEqualTo(3)
    }
    @Test
    fun `check if it has 1 bracket return false`(){
        val isBracketAllBracesClosed = HomeWork.checkBraces("a+b)")
        assertThat(isBracketAllBracesClosed).isFalse()
    }
    @Test
   fun `check if braces are even`(){
       val isBracesAllBracesClosed = HomeWork.checkBraces("(a+b)")
       assertThat(isBracesAllBracesClosed).isTrue()
   }
}