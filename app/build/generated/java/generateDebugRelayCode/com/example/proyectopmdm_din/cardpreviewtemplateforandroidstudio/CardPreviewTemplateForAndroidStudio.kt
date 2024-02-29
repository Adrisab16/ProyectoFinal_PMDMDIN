package com.example.proyectopmdm_din.cardpreviewtemplateforandroidstudio

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
 * This composable was generated from the UI Package 'card_preview_template_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun CardPreviewTemplateForAndroidStudio(
    modifier: Modifier = Modifier,
    previewCardButton: () -> Unit = {}
) {
    TopLevel(
        previewCardButton = previewCardButton,
        modifier = modifier
    ) {
        TopLevelSynth {
            CardPreviewBackgroungBorder {
                CardPreviewBackground()
            }
        }
        CardPreviewTitleBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Rectangle18(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            PersonajeName(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        CardPreviewImageBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Rectangle17(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Rectangle19(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 96, heightDp = 136)
@Composable
private fun CardPreviewTemplateForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            CardPreviewTemplateForAndroidStudio(
                previewCardButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun CardPreviewBackground(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_preview_template_for_android_studio_card_preview_background),
        modifier = modifier.requiredWidth(88.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun CardPreviewBackgroungBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 127,
            green = 127,
            blue = 127
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 4.0.dp),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 11.0,
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
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun Rectangle18(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_preview_template_for_android_studio_rectangle_18),
        modifier = modifier.requiredWidth(82.0.dp).requiredHeight(18.0.dp)
    )
}

@Composable
fun PersonajeName(modifier: Modifier = Modifier) {
    RelayText(
        content = "Personaje Name",
        fontSize = 9.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272245619032.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(82.0.dp).requiredHeight(18.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CardPreviewTitleBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 10.0.dp,
                end = 7.0.dp,
                bottom = 108.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle17(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_preview_template_for_android_studio_rectangle_17),
        modifier = modifier.requiredWidth(72.0.dp).requiredHeight(88.0.dp)
    )
}

@Composable
fun Rectangle19(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.card_preview_template_for_android_studio_rectangle_19),
        radius = 5.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(64.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun CardPreviewImageBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.0.dp,
                top = 36.0.dp,
                end = 12.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    previewCardButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = previewCardButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
