package com.example.kmpcounter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform