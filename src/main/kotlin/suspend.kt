import kotlinx.coroutines.*

suspend fun doSomething(){
    delay(500L)
    println("Did Something")
}

fun main() = runBlocking{
    repeat(10){
        doSomething()
    }
}