package com.example.proyectopmdm_din.descriptionforandroidstudio

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'description_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun DescriptionForAndroidStudio(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        DescriptionBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 8.0.dp
                )
            )
        ) {
            DescTxt(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.682373046875.dp
                    )
                )
            )
            DescriptionBoxSynth {}
        }
        TopLevelSynth {}
    }
}

@Preview(widthDp = 328, heightDp = 571)
@Composable
private fun DescriptionForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            DescriptionForAndroidStudio(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun DescTxt(modifier: Modifier = Modifier) {
    RelayText(
        content = "aasdmsadpomsapodposadmpsamdpsaomdpsaomdpsoamdpoampomaspodmaspomdoasmdpaosmdpasomdpasodmpasomdapsodmapsomdpoa",
        fontSize = 18.0.sp,
        fontFamily = inter,
        height = 1.2102272245619032.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(296.0.dp).requiredHeight(364.0.dp)
    )
}

@Composable
fun DescriptionBoxSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 10.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier.widthIn(312.0.dp, Dp.Infinity).heightIn(554.63525390625.dp, Dp.Infinity).alpha(alpha = 100.0f)
    )
}

@Composable
fun DescriptionBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 192,
            green = 189,
            blue = 189
        ),
        isStructured = false,
        clipToParent = false,
        radius = 6.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 8.0.dp),
        itemSpacing = 10.0,
        radius = 6.0,
        content = content,
        modifier = modifier.widthIn(328.0.dp, Dp.Infinity).heightIn(570.63525390625.dp, Dp.Infinity).alpha(alpha = 100.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 120,
            green = 120,
            blue = 120
        ),
        isStructured = false,
        radius = 6.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
