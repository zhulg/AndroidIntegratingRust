package com.android.integratingrust


/**
 * @ClassName RustGreetings
 * @Description
 * @Author zhulg
 * @Date 2022/10/19 16:10
 * @Version 1.0
 */
class RustGreetings {
    fun sayHello(to: String): String {
        return greeting(to)
    }

    companion object {
        @JvmStatic external fun greeting(pattern: String): String
    }
}