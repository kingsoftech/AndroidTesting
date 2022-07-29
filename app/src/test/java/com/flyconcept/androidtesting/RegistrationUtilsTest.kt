package com.flyconcept.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest{
    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtils.validateRegistrationInput("",
        "pass",
        "pass")

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtils.validateRegistrationInput("Phip",
            "pass22",
            "pass22")

        assertThat(result).isTrue()
    }
    @Test
    fun `username already exist return false`(){
        val result = RegistrationUtils.validateRegistrationInput("Carl",
            "pass",
            "pass")

        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtils.validateRegistrationInput("abdullahi",
            "",
            "")

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtils.validateRegistrationInput("",
            "pass",
            "pass112")

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`(){
        val result = RegistrationUtils.validateRegistrationInput("soft",
            "password2",
            "password2")

        assertThat(result).isFalse()
    }
}