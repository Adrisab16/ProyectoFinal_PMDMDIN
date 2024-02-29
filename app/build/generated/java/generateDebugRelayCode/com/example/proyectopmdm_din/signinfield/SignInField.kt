package com.example.proyectopmdm_din.signinfield

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'sign_in_field'.
 * Generated code; do not edit directly
 */
@Composable
fun SignInField(
    modifier: Modifier = Modifier,
    inputUsuario: String = "",
    loginButton: () -> Unit = {},
    linkSignUp: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LoginTitle()
        UsernameField {
            Rectangle4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Image1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Usuario(
                inputUsuario = inputUsuario,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
        PasswordField {
            Rectangle3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            ContraseA(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        RememberMeButton {
            Rectangle6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.25.dp
                    )
                )
            )
            RecuRdame(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 23.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        LoginButton(loginButton = loginButton) {
            Rectangle5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            LogIn(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LinkSignUp(linkSignUp = linkSignUp)
    }
}

@Preview(widthDp = 256, heightDp = 332)
@Composable
private fun SignInFieldPreview() {
    MaterialTheme {
        RelayContainer {
            SignInField(
                loginButton = {},
                linkSignUp = {},
                inputUsuario = "Usuario",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LoginTitle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Log In",
        fontSize = 35.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(65.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_in_field_rectangle_4),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_in_field_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.000015258789062.dp,
                top = 8.0.dp,
                end = 199.99998474121094.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Usuario(
    inputUsuario: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = inputUsuario,
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 38.75.dp,
                top = 8.0.dp,
                end = 19.999984741210938.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun UsernameField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(230.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_in_field_rectangle_3),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_in_field_pngegg_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 9.999984741210938.dp,
                top = 8.0.dp,
                end = 200.00001525878906.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ContraseA(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contraseña",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 38.75.dp,
                top = 8.0.dp,
                end = 20.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun PasswordField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(230.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_in_field_rectangle_6),
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun RecuRdame(modifier: Modifier = Modifier) {
    RelayText(
        content = "Recuérdame",
        fontSize = 10.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(197.906982421875.dp).requiredHeight(16.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun RememberMeButton(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(220.906982421875.dp).requiredHeight(16.25.dp)
    )
}

@Composable
fun Rectangle5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_in_field_rectangle_5),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun LogIn(modifier: Modifier = Modifier) {
    RelayText(
        content = "Log In",
        fontSize = 20.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LoginButton(
    loginButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.tappable(onTap = loginButton).requiredWidth(132.0.dp).requiredHeight(36.5.dp)
    )
}

@Composable
fun LinkSignUp(
    linkSignUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 0,
                        blue = 0
                    ),
                    fontFamily = inter,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("Don’t have account?")
            }
            append(" ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 0,
                        green = 0,
                        blue = 0
                    )
                )
            ) {
                append("Sign Up")
            }
        },
        fontSize = 10.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272033691406.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.tappable(onTap = linkSignUp).requiredWidth(184.0.dp).requiredHeight(16.0.dp).wrapContentHeight(
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
            red = 98,
            green = 98,
            blue = 98
        ),
        padding = PaddingValues(
            start = 13.0.dp,
            top = 12.0.dp,
            end = 13.0.dp,
            bottom = 12.0.dp
        ),
        itemSpacing = 22.0,
        radius = 28.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
