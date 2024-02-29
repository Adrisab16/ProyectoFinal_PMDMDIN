package com.example.proyectopmdm_din.header

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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'header'.
 * Generated code; do not edit directly
 */
@Composable
fun Header(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            HeaderButton()
        }
        HeaderTitle(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 360, heightDp = 80)
@Composable
private fun HeaderPreview() {
    MaterialTheme {
        RelayContainer {
            Header(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun HeaderButton(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_header_button),
        modifier = modifier.requiredWidth(358.0.dp).requiredHeight(78.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 1.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun HeaderTitle(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 148,
                        green = 0,
                        blue = 211
                    )
                )
            ) {
                append("U")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 75,
                        green = 0,
                        blue = 130
                    )
                )
            ) {
                append("l")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 0,
                        blue = 255
                    )
                )
            ) {
                append("t")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 255,
                        blue = 0
                    )
                )
            ) {
                append("i")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 255,
                        blue = 0
                    )
                )
            ) {
                append("m")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 127,
                        blue = 0
                    )
                )
            ) {
                append("a")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 0,
                        blue = 0
                    )
                )
            ) {
                append("t")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 148,
                        green = 0,
                        blue = 211
                    )
                )
            ) {
                append("e")
            }
            append(" ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 75,
                        green = 0,
                        blue = 130
                    )
                )
            ) {
                append("G")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 0,
                        blue = 255
                    )
                )
            ) {
                append("a")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 255,
                        blue = 0
                    )
                )
            ) {
                append("c")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 255,
                        blue = 0
                    )
                )
            ) {
                append("h")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 127,
                        blue = 0
                    )
                )
            ) {
                append("a")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 255,
                        green = 0,
                        blue = 0
                    )
                )
            ) {
                append("p")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 148,
                        green = 0,
                        blue = 211
                    )
                )
            ) {
                append("o")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 75,
                        green = 0,
                        blue = 130
                    )
                )
            ) {
                append("n")
            }
        },
        fontSize = 35.0.sp,
        fontFamily = julee,
        height = 1.177999986921038.em,
        maxLines = -1,
        modifier = modifier.padding(paddingValues = PaddingValues(all = 8.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
