package presentation.menu

import presentation.utils.Formatter
import presentation.extfunction.isMenuOptionValid

interface UIMenu<T> {
    fun showMenu(
        mapObjects: Map<Int, T>,
        formatter: Formatter<T>
    ): T? {
        var option = ""
        do {
            mapObjects.forEach { (t, u) ->
                print("$t. ")
                println(formatter.format(u))
            }

            println("""*** select number option ***""")
            option = readLine().orEmpty()
        } while (!option.isMenuOptionValid(mapObjects))

        return mapObjects[option.toInt()]
    }
}