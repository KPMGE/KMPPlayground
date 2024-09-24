package org.kpmge.kmpplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform