package domain.usecases.baggage

import domain.datasource.baggage.BaggagePackageDataSource
import domain.model.baggage.pack.BaggagePackage

class GetBaggagePackages(
    private val baggagePackageDataSource: BaggagePackageDataSource
) {
    operator fun invoke(): Map<Int, BaggagePackage> {
        return baggagePackageDataSource.getBagggagePacks()
    }
}