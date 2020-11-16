import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

fun simple() = flow { // flow builder
    for (i in 1..3) {
        delay(100) // Langer Task
        emit(i) // Senden
    }
}

fun main() = runBlocking<Unit>{

    launch {
        println("Calling simple function...")
        simple().collect { print(it) }

        // Oder

        flowOf(1, 2, 3).collect{ value -> println(value) }
    }

}
