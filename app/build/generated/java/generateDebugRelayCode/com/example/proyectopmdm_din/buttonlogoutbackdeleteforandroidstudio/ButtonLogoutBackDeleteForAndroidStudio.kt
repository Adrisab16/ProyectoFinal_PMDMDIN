package com.example.proyectopmdm_din.buttonlogoutbackdeleteforandroidstudio

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'button_logout_back_delete_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonLogoutBackDeleteForAndroidStudio(
    modifier: Modifier = Modifier,
    buttonDeleteLibrary: () -> Unit = {},
    buttonLogOut: () -> Unit = {},
    buttonBack: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ButtonDeleteBiblioteca {
            Rectangle27(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Group3(
                buttonDeleteLibrary = buttonDeleteLibrary,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 40.0.dp,
                        y = 8.0.dp
                    )
                )
            ) {
                Rectangle24(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                BorrarBiblioteca(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        ButtonLogOut {
            Rectangle22(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Group2(
                buttonLogOut = buttonLogOut,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                Rectangle25(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
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
                Rectangle26(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Back1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 358, heightDp = 94)
@Composable
private fun ButtonLogoutBackDeleteForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            ButtonLogoutBackDeleteForAndroidStudio(
                buttonDeleteLibrary = {},
                buttonLogOut = {},
                buttonBack = {},
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle27(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_27),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_24),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BorrarBiblioteca(modifier: Modifier = Modifier) {
    RelayText(
        content = "Borrar Biblioteca",
        fontSize = 20.0.sp,
        fontFamily = arial,
        height = 1.14990234375.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.0.dp,
                top = 3.0.dp,
                end = 4.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Group3(
    buttonDeleteLibrary: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 11.0,
        content = content,
        modifier = modifier.tappable(onTap = buttonDeleteLibrary).requiredWidth(279.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun ButtonDeleteBiblioteca(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun Rectangle22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_22),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_25),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_vector),
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
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_23),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle26(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.button_logout_back_delete_for_android_studio_rectangle_26),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Back1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.button_logout_back_delete_for_android_studio_back_1),
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
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 1.0,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}
