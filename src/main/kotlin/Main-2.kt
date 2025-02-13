import kotlinx.coroutines.*


fun main() {

    println("Main program starts : ${Thread.currentThread().name}")
    GlobalScope.launch { // thread : T1
        println("coroutines program starts : ${Thread.currentThread().name}") // thread : T1
        delay(1000) // coroutine is suspended but thread : T1 is free (not blocked)
        println("coroutines thread program ends : ${Thread.currentThread().name}") // Either T1 or some other thread
    }
    runBlocking {  // creates a coroutine that blacks the current main thread
        delay(2000) // wait for coroutine to finish (practically not a right way to wait)
    }
    println("Main program ends : ${Thread.currentThread().name}")
}
