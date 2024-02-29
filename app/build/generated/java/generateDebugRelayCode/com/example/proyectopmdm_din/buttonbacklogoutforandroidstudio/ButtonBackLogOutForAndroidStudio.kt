package com.example.proyectopmdm_din.buttonbacklogoutforandroidstudio

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'button_back_log_out_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonBackLogOutForAndroidStudio(
    modifier: Modifier = Modifier,
    buttonLogOut: () -> Unit = {},
    buttonBack: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ButtonLogOut {
            Rectangle22(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Group2(
                buttonLogOut = buttonLogOut,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                Rectangle24(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Logout1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    Vector(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -1.0.dp,
                                y = -1.0.dp
                            )
                        ).rowWeight(1.0f).columnWeight(1.0f)
                    )
                }
            }
        }
        ButtonBack {
            Rectangle23(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Group1(
                buttonBack = buttonBack,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                Rectangle25(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Back1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 358, heightDp = 46)
@Composable
private fun ButtonBackLogOutForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            ButtonBackLogOutForAndroidStudio(
                buttonLogOut = {},
                buttonBack = {},
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_back_log_out_for_android_studio_rectangle_22),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_back_log_out_for_android_studio_rectangle_24),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_back_log_out_for_android_studio_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.0.dp,
                top = 5.3333740234375.dp,
                end = 6.000001907348633.dp,
                bottom = 5.333292007446289.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Logout1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.0.dp,
                top = 0.0.dp,
                end = 14.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group2(
    buttonLogOut: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 55.0.dp,
                top = 7.0.dp,
                end = 59.0.dp,
                bottom = 7.0.dp
            )
        ).tappable(onTap = buttonLogOut).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ButtonLogOut(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(178.0.dp).requiredHeight(46.0.dp)
    )
}

@Composable
fun Rectangle23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_back_log_out_for_android_studio_rectangle_23),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_back_log_out_for_android_studio_rectangle_25),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Back1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.button_back_log_out_for_android_studio_back_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 4.0.dp,
                end = 16.0.dp,
                bottom = 4.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Group1(
    buttonBack: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 60.0.dp,
                top = 7.0.dp,
                end = 55.0.dp,
                bottom = 7.0.dp
            )
        ).tappable(onTap = buttonBack).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ButtonBack(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(179.0.dp).requiredHeight(46.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 1.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}
