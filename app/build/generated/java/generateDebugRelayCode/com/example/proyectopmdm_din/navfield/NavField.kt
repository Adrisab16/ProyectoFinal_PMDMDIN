package com.example.proyectopmdm_din.navfield

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'nav_field'.
 * Generated code; do not edit directly
 */
@Composable
fun NavField(
    modifier: Modifier = Modifier,
    navButtonBiblioteca: () -> Unit = {},
    navButtonInicio: () -> Unit = {},
    navButtonGacha: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        NavButtonBiblioteca(navButtonBiblioteca = navButtonBiblioteca) {
            ButtonBiblioteca(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Biblioteca(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        NavButtonInicio(navButtonInicio = navButtonInicio) {
            ButtonInicio(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Inicio(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        NavButtonGacha(navButtonGacha = navButtonGacha) {
            ButtonGacha(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Gacha(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 360, heightDp = 54)
@Composable
private fun NavFieldPreview() {
    MaterialTheme {
        RelayContainer {
            NavField(
                navButtonBiblioteca = {},
                navButtonInicio = {},
                navButtonGacha = {},
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun ButtonBiblioteca(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.nav_field_button_biblioteca),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Biblioteca(modifier: Modifier = Modifier) {
    RelayText(
        content = "Biblioteca",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0390625.dp,
                top = 7.0.dp,
                end = 8.04473876953125.dp,
                bottom = 7.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun NavButtonBiblioteca(
    navButtonBiblioteca: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = navButtonBiblioteca).requiredWidth(103.57542419433594.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun ButtonInicio(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.nav_field_button_inicio),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Inicio(modifier: Modifier = Modifier) {
    RelayText(
        content = "Inicio",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.03912353515625.dp,
                top = 7.0.dp,
                end = 7.039093017578125.dp,
                bottom = 7.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun NavButtonInicio(
    navButtonInicio: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = navButtonInicio).requiredWidth(150.83798217773438.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun ButtonGacha(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.nav_field_button_gacha),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Gacha(modifier: Modifier = Modifier) {
    RelayText(
        content = "Gacha",
        fontSize = 16.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(600.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.044677734375.dp,
                top = 7.0.dp,
                end = 7.03912353515625.dp,
                bottom = 7.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun NavButtonGacha(
    navButtonGacha: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = navButtonGacha).requiredWidth(103.57542419433594.dp).requiredHeight(54.0.dp)
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
