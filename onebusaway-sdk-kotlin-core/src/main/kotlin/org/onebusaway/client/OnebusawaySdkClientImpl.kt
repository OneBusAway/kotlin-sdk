// File generated from our OpenAPI spec by Stainless.

package org.onebusaway.client

import org.onebusaway.core.ClientOptions
import org.onebusaway.core.getPackageVersion
import org.onebusaway.services.blocking.AgenciesWithCoverageService
import org.onebusaway.services.blocking.AgenciesWithCoverageServiceImpl
import org.onebusaway.services.blocking.AgencyService
import org.onebusaway.services.blocking.AgencyServiceImpl
import org.onebusaway.services.blocking.ArrivalAndDepartureService
import org.onebusaway.services.blocking.ArrivalAndDepartureServiceImpl
import org.onebusaway.services.blocking.BlockService
import org.onebusaway.services.blocking.BlockServiceImpl
import org.onebusaway.services.blocking.ConfigService
import org.onebusaway.services.blocking.ConfigServiceImpl
import org.onebusaway.services.blocking.CurrentTimeService
import org.onebusaway.services.blocking.CurrentTimeServiceImpl
import org.onebusaway.services.blocking.ReportProblemWithStopService
import org.onebusaway.services.blocking.ReportProblemWithStopServiceImpl
import org.onebusaway.services.blocking.ReportProblemWithTripService
import org.onebusaway.services.blocking.ReportProblemWithTripServiceImpl
import org.onebusaway.services.blocking.RouteIdsForAgencyService
import org.onebusaway.services.blocking.RouteIdsForAgencyServiceImpl
import org.onebusaway.services.blocking.RouteService
import org.onebusaway.services.blocking.RouteServiceImpl
import org.onebusaway.services.blocking.RoutesForAgencyService
import org.onebusaway.services.blocking.RoutesForAgencyServiceImpl
import org.onebusaway.services.blocking.RoutesForLocationService
import org.onebusaway.services.blocking.RoutesForLocationServiceImpl
import org.onebusaway.services.blocking.ScheduleForRouteService
import org.onebusaway.services.blocking.ScheduleForRouteServiceImpl
import org.onebusaway.services.blocking.ScheduleForStopService
import org.onebusaway.services.blocking.ScheduleForStopServiceImpl
import org.onebusaway.services.blocking.SearchForRouteService
import org.onebusaway.services.blocking.SearchForRouteServiceImpl
import org.onebusaway.services.blocking.SearchForStopService
import org.onebusaway.services.blocking.SearchForStopServiceImpl
import org.onebusaway.services.blocking.ShapeService
import org.onebusaway.services.blocking.ShapeServiceImpl
import org.onebusaway.services.blocking.StopIdsForAgencyService
import org.onebusaway.services.blocking.StopIdsForAgencyServiceImpl
import org.onebusaway.services.blocking.StopService
import org.onebusaway.services.blocking.StopServiceImpl
import org.onebusaway.services.blocking.StopsForAgencyService
import org.onebusaway.services.blocking.StopsForAgencyServiceImpl
import org.onebusaway.services.blocking.StopsForLocationService
import org.onebusaway.services.blocking.StopsForLocationServiceImpl
import org.onebusaway.services.blocking.StopsForRouteService
import org.onebusaway.services.blocking.StopsForRouteServiceImpl
import org.onebusaway.services.blocking.TripDetailService
import org.onebusaway.services.blocking.TripDetailServiceImpl
import org.onebusaway.services.blocking.TripForVehicleService
import org.onebusaway.services.blocking.TripForVehicleServiceImpl
import org.onebusaway.services.blocking.TripService
import org.onebusaway.services.blocking.TripServiceImpl
import org.onebusaway.services.blocking.TripsForLocationService
import org.onebusaway.services.blocking.TripsForLocationServiceImpl
import org.onebusaway.services.blocking.TripsForRouteService
import org.onebusaway.services.blocking.TripsForRouteServiceImpl
import org.onebusaway.services.blocking.VehiclesForAgencyService
import org.onebusaway.services.blocking.VehiclesForAgencyServiceImpl

class OnebusawaySdkClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OnebusawaySdkClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OnebusawaySdkClientAsync by lazy {
        OnebusawaySdkClientAsyncImpl(clientOptions)
    }

    private val agenciesWithCoverage: AgenciesWithCoverageService by lazy {
        AgenciesWithCoverageServiceImpl(clientOptionsWithUserAgent)
    }

    private val agency: AgencyService by lazy { AgencyServiceImpl(clientOptionsWithUserAgent) }

    private val vehiclesForAgency: VehiclesForAgencyService by lazy {
        VehiclesForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptionsWithUserAgent) }

    private val currentTime: CurrentTimeService by lazy {
        CurrentTimeServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForLocation: StopsForLocationService by lazy {
        StopsForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForRoute: StopsForRouteService by lazy {
        StopsForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val stopsForAgency: StopsForAgencyService by lazy {
        StopsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val stop: StopService by lazy { StopServiceImpl(clientOptionsWithUserAgent) }

    private val stopIdsForAgency: StopIdsForAgencyService by lazy {
        StopIdsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForStop: ScheduleForStopService by lazy {
        ScheduleForStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val route: RouteService by lazy { RouteServiceImpl(clientOptionsWithUserAgent) }

    private val routeIdsForAgency: RouteIdsForAgencyService by lazy {
        RouteIdsForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val routesForLocation: RoutesForLocationService by lazy {
        RoutesForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val routesForAgency: RoutesForAgencyService by lazy {
        RoutesForAgencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduleForRoute: ScheduleForRouteService by lazy {
        ScheduleForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val arrivalAndDeparture: ArrivalAndDepartureService by lazy {
        ArrivalAndDepartureServiceImpl(clientOptionsWithUserAgent)
    }

    private val trip: TripService by lazy { TripServiceImpl(clientOptionsWithUserAgent) }

    private val tripsForLocation: TripsForLocationService by lazy {
        TripsForLocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripDetails: TripDetailService by lazy {
        TripDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripForVehicle: TripForVehicleService by lazy {
        TripForVehicleServiceImpl(clientOptionsWithUserAgent)
    }

    private val tripsForRoute: TripsForRouteService by lazy {
        TripsForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithStop: ReportProblemWithStopService by lazy {
        ReportProblemWithStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val reportProblemWithTrip: ReportProblemWithTripService by lazy {
        ReportProblemWithTripServiceImpl(clientOptionsWithUserAgent)
    }

    private val searchForStop: SearchForStopService by lazy {
        SearchForStopServiceImpl(clientOptionsWithUserAgent)
    }

    private val searchForRoute: SearchForRouteService by lazy {
        SearchForRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val block: BlockService by lazy { BlockServiceImpl(clientOptionsWithUserAgent) }

    private val shape: ShapeService by lazy { ShapeServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): OnebusawaySdkClientAsync = async

    override fun agenciesWithCoverage(): AgenciesWithCoverageService = agenciesWithCoverage

    override fun agency(): AgencyService = agency

    override fun vehiclesForAgency(): VehiclesForAgencyService = vehiclesForAgency

    override fun config(): ConfigService = config

    override fun currentTime(): CurrentTimeService = currentTime

    override fun stopsForLocation(): StopsForLocationService = stopsForLocation

    override fun stopsForRoute(): StopsForRouteService = stopsForRoute

    override fun stopsForAgency(): StopsForAgencyService = stopsForAgency

    override fun stop(): StopService = stop

    override fun stopIdsForAgency(): StopIdsForAgencyService = stopIdsForAgency

    override fun scheduleForStop(): ScheduleForStopService = scheduleForStop

    override fun route(): RouteService = route

    override fun routeIdsForAgency(): RouteIdsForAgencyService = routeIdsForAgency

    override fun routesForLocation(): RoutesForLocationService = routesForLocation

    override fun routesForAgency(): RoutesForAgencyService = routesForAgency

    override fun scheduleForRoute(): ScheduleForRouteService = scheduleForRoute

    override fun arrivalAndDeparture(): ArrivalAndDepartureService = arrivalAndDeparture

    override fun trip(): TripService = trip

    override fun tripsForLocation(): TripsForLocationService = tripsForLocation

    override fun tripDetails(): TripDetailService = tripDetails

    override fun tripForVehicle(): TripForVehicleService = tripForVehicle

    override fun tripsForRoute(): TripsForRouteService = tripsForRoute

    override fun reportProblemWithStop(): ReportProblemWithStopService = reportProblemWithStop

    override fun reportProblemWithTrip(): ReportProblemWithTripService = reportProblemWithTrip

    override fun searchForStop(): SearchForStopService = searchForStop

    override fun searchForRoute(): SearchForRouteService = searchForRoute

    override fun block(): BlockService = block

    override fun shape(): ShapeService = shape
}
