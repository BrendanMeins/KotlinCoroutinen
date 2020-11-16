import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    launch {
        delay(200L)
        println("Aufgabe von runBlocking")
    }

    coroutineScope { // Erstellt einen CoroutineScope
        launch {
            delay(500L)
            println("Aufgabe von verschachtelter launch")
        }

        delay(100L)
        println("Aufgabe von coroutineScope")
    }

    println("CoroutineScope Main ist fertig")
}


