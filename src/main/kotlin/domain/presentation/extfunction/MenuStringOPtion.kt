package domain.presentation.extfunction

import domain.model.Flight

fun String.isNotBlankOrEmpty(): Boolean {
    return this.isNotBlank() || this.isNotEmpty()
}

fun String.isNumber(): Boolean {
    return this.all { it.isDigit() }
}

fun String.isMenuOptionValid(flightsMap: Map<Int, Flight>): Boolean {
    return if (isNotBlankOrEmpty()) {
        return isNumber() && flightsMap.containsKey(toInt())
    } else false
}