package com.xtenzq.codeforces

fun a2030() {
    val t = readln().toInt()
    for (j in 0..< t) {
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }

        if (n == 1) {
            println(0)
            continue
        }

        println((a.max() - a.min()) * (n - 1))
    }
}