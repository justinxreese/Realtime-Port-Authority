package rectangledbmi.com.pittsburghrealtimetracker.retrofit.patapi;

import rectangledbmi.com.pittsburghrealtimetracker.world.jsonpojo.PatternResponse;
import rectangledbmi.com.pittsburghrealtimetracker.world.jsonpojo.PredictionResponse;
import rectangledbmi.com.pittsburghrealtimetracker.world.jsonpojo.VehicleResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * This is the general api that sets the retrofit api. You must have the class
 * and the pat_api key before using the api in the gradle.properties file
 *
 * @author Jeremy Jao
 * @since 46
 */
public interface PATAPI {
    /**
     * generates a response for patters
     * @param rt - the route
     */
    @GET("getpatterns?format=json" )
    Observable<PatternResponse> getPatterns(@Query("rt") String rt);

    /**
     * Generates a response to get vehicles
     * @param routes - the routes
     */
    @GET("getvehicles?format=json")
    Observable<VehicleResponse> getVehicles(@Query("rt") String routes);

    /**
     * Generates a response to get the predictions using the stop id
     * @param stpid - the stop id
     */
    @GET("getpredictions?format=json")
    Observable<PredictionResponse> getStopPredictions(@Query("stpid") int stpid);

    /**
     * Generates a response to get the predictions using the stop id
     * @param stpid - the stop id
     * @param rts - the routes
     */
    @GET("getpredictions?format=json")
    Observable<PredictionResponse> getStopPredictions(@Query("stpid") int stpid, @Query("rt") String rts);

    /**
     * Generates a response to get the predictions using the bus id
     * @param vid - the bus id
     */
    @GET("getpredictions?format=json")
    Observable<PredictionResponse> getBusPrediction(@Query("vid") int vid);


}
