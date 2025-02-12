import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {

    println("Main program starts : ${Thread.currentThread().name}")
    thread {
        println("background thread program starts : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("background thread program ends : ${Thread.currentThread().name}")
    }
    println("Main program ends : ${Thread.currentThread().name}")
}
