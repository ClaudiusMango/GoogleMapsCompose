package com.example.composegooglemaps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composegooglemaps.BuildConfig.GOOGLE_MAPS_API_KEY
import com.example.composegooglemaps.ui.theme.ComposeGoogleMapsTheme
import com.example.composegooglemaps.ui.theme.components.GoogleMapsAutoComplete
import com.google.android.libraries.places.api.Places

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Places.initialize(applicationContext, GOOGLE_MAPS_API_KEY)
        setContent {
            ComposeGoogleMapsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    MapComponent{ mapUiSettings,mapProperties,cameraPositionState ->
//                        MapWithMarkers(
//                            markerList = listOf(
//                                GoogleMapMarkerDataClass(
//                                    id = 1,
//                                    latitude = -1.2219,
//                                    longitude = 36.8966,
//                                    title = "ICIPE",
//                                    snippet = "Marker at ICIPE",
//                                )
//                            ),
//                            onMarkerInfoWindowClicked = {},
//                            cameraPosition = cameraPositionState,
//                            mapUiSettings = mapUiSettings,
//                            mapProperties = mapProperties
//                        )
//                        MapSelectLocation(
//                            cameraPositionState = cameraPositionState,
//                            mapUiSettings = mapUiSettings,
//                            mapProperties = mapProperties
//                        )
//                    }
                    GoogleMapsAutoComplete(
                        selectedLocation = {}
                    )
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeGoogleMapsTheme {

    }
}