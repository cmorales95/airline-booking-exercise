package domain.usecases.baggage.types.format

import domain.model.baggage.type.BaggageType
import domain.presentation.Formatter

class BaggageTypesConsoleFormat : Formatter<BaggageType> {
    override fun format(t: BaggageType): String {
        return """
            ${t.icon} ${t.quantity} ${t.title}
        """.trimIndent()
    }
}