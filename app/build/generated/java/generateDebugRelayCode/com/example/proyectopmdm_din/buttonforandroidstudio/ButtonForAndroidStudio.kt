package com.example.proyectopmdm_din.buttonforandroidstudio

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'button_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonForAndroidStudio(
    modifier: Modifier = Modifier,
    buttonTxt: String = "",
    defaultButton: () -> Unit = {}
) {
    TopLevel(
        defaultButton = defaultButton,
        modifier = modifier
    ) {
        TopLevelSynth {
            ButtonBackground()
        }
        ButtonTxt(
            buttonTxt = buttonTxt,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 216, heightDp = 56)
@Composable
private fun ButtonForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            ButtonForAndroidStudio(
                defaultButton = {},
                buttonTxt = "Lore ipsum",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ButtonBackground(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_for_android_studio_button_background),
        modifier = modifier.requiredWidth(208.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 10.0,
        radius = 10.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun ButtonTxt(
    buttonTxt: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = buttonTxt,
        fontSize = 20.0.sp,
        fontFamily = arial,
        height = 1.14990234375.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(paddingValues = PaddingValues(all = 8.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    defaultButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        radius = 10.0,
        content = content,
        modifier = modifier.tappable(onTap = defaultButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
