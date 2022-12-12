package domain.datasource.baggage

import domain.model.baggage.pack.BaggagePackage

interface BaggagePackageDataSource {
    fun getBagggagePacks(): Map<Int, BaggagePackage>
}