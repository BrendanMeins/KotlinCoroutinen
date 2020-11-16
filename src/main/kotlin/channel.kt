import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking<Unit> {
    var channel = Channel<Int>()

    launch {
        for (x in 1..5) channel.send(x)
    }
    launch {
        repeat(5){ println(channel.receive())}
    }


}