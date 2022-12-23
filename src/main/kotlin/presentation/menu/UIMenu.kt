package presentation.menu

import domain.presentation.Formatter
import domain.presentation.extfunction.isMenuOptionValid

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