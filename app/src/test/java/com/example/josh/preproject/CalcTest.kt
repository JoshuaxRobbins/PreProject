package com.example.josh.preproject

import org.junit.Test
import org.mockito.Mock

class CalcTest {




    @Test
    fun testsWork1(){
        var i = Calculation.addNumbers(10,10)
        assert(i == 20)
    }

    @Test
    fun testsWork2(){
        var i = Calculation.addNumbers(9,10)
        assert(i == 20)
    }

    @Test
    fun testsWork3(){
        var i = Calculation.addNumbers(9,10)
        assert(i == 19)
    }
}