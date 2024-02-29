package com.example.proyectopmdm_din.signupfield

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.proyectopmdm_din.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'sign_up_field'.
 * Generated code; do not edit directly
 */
@Composable
fun SignUpField(
    modifier: Modifier = Modifier,
    signUpButton: () -> Unit = {},
    linkLogin: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LoginTitle()
        UsernameField {
            Rectangle4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Image1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Usuario(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        PasswordField {
            Rectangle3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            ContraseA(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        DNIField {
            Rectangle5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            DNI(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        AddressField {
            Rectangle6(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            DirecciN(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        AgeField {
            Rectangle7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Edad(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        EmailField {
            Rectangle8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Pngegg5(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Email(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        SignUpButton(signUpButton = signUpButton) {
            Rectangle9(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            SignUp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LinkLogin(linkLogin = linkLogin)
    }
}

@Preview(widthDp = 296, heightDp = 567)
@Composable
private fun SignUpFieldPreview() {
    MaterialTheme {
        RelayContainer {
            SignUpField(
                signUpButton = {},
                linkLogin = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LoginTitle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign Up",
        fontSize = 24.0.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272510528564.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(47.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_4),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.2608642578125.dp,
                top = 8.0.dp,
                end = 205.21739768981934.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Usuario(modifier: Modifier = Modifier) {
    RelayText(
        content = "Usuario",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 39.7608642578125.dp,
                top = 8.0.dp,
                end = 20.521759033203125.dp,
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
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_3),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_pngegg_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.2608642578125.dp,
                top = 8.0.dp,
                end = 205.2173957824707.dp,
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
                start = 41.04345703125.dp,
                top = 8.0.dp,
                end = 20.521759033203125.dp,
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
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_5),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_pngegg_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.6956787109375.dp,
                top = 9.0.dp,
                end = 202.65214729309082.dp,
                bottom = 9.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DNI(modifier: Modifier = Modifier) {
    RelayText(
        content = "DNI",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 41.04345703125.dp,
                top = 8.0.dp,
                end = 20.521759033203125.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun DNIField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_6),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_pngegg_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.2608642578125.dp,
                top = 8.0.dp,
                end = 205.2173957824707.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DirecciN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Dirección",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 39.7608642578125.dp,
                top = 8.0.dp,
                end = 20.521743774414062.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun AddressField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_7),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_pngegg_4),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.2608642578125.dp,
                top = 8.0.dp,
                end = 205.2173957824707.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Edad(modifier: Modifier = Modifier) {
    RelayText(
        content = "Edad",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 39.7608642578125.dp,
                top = 8.0.dp,
                end = 20.521743774414062.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun AgeField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_8),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Pngegg5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sign_up_field_pngegg_5),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 10.2608642578125.dp,
                top = 8.0.dp,
                end = 205.2173957824707.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Email(modifier: Modifier = Modifier) {
    RelayText(
        content = "Email",
        fontSize = 10.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 39.7608642578125.dp,
                top = 8.0.dp,
                end = 20.521743774414062.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun EmailField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(236.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Rectangle9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sign_up_field_rectangle_9),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SignUp(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sign Up",
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
fun SignUpButton(
    signUpButton: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 10.0,
        content = content,
        modifier = modifier.tappable(onTap = signUpButton).requiredWidth(150.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun LinkLogin(
    linkLogin: () -> Unit,
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
                append("You already have an account?")
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
                append("Log In")
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
        modifier = modifier.tappable(onTap = linkLogin).requiredWidth(216.0.dp).requiredHeight(16.0.dp).wrapContentHeight(
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
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 40.0.dp,
            top = 20.0.dp,
            end = 40.0.dp,
            bottom = 20.0.dp
        ),
        itemSpacing = 30.0,
        radius = 32.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
