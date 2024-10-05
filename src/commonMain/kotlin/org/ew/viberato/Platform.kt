package org.ew.viberato

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform