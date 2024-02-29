package com.example.proyectopmdm_din.cardtemplateforandroidstudio

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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

/**
 * This composable was generated from the UI Package 'card_template_for_android_studio'.
 * Generated code; do not edit directly
 */
@Composable
fun CardTemplateForAndroidStudio(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            CardBackgroundCardBorder {
                Rectangle15(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Rectangle7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        CharacterDescriptionTitle(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            Rectangle11(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            DESCRIPTION(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        CharacterDescription(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            CardDescription(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            DescriptionTxt(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        CardHeader(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            RarityIconRarityIconBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                RarityIconBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                RarityIcon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            CharacterNameCharacterNameBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                CharacterNameBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CharacterName(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            VideogameIconBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                VideogameBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                VideogameIcon(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        CardImageCardImageBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            CardImageBorder(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CardImage(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 328, heightDp = 552)
@Composable
private fun CardTemplateForAndroidStudioPreview() {
    MaterialTheme {
        RelayContainer {
            CardTemplateForAndroidStudio(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle15(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_rectangle_15),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_rectangle_7),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 8.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardBackgroundCardBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 24.0,
        content = content,
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(552.0.dp)
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
fun Rectangle11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_rectangle_11),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DESCRIPTION(modifier: Modifier = Modifier) {
    RelayText(
        content = "DESCRIPCIÓN",
        fontSize = 15.0.sp,
        fontFamily = inter,
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
fun CharacterDescriptionTitle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 32.0.dp,
                top = 240.0.dp,
                end = 32.0.dp,
                bottom = 280.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardDescription(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_card_description),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DescriptionTxt(modifier: Modifier = Modifier) {
    RelayText(
        content = "Víctor Sullivan (alias Sully) es un veterano cazatesoros, conocido por su labia y su ingenio. Sully conoció a Drake cuando este no era más que un joven recién salido del orfanato, convirtiéndose así en una figura paterna para él y operando juntos en sus aventuras.\n",
        fontSize = 15.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 17.0.dp,
                end = 16.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CharacterDescription(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 32.0.dp,
                top = 288.0.dp,
                end = 32.0.dp,
                bottom = 40.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun RarityIconBorder(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_rarity_icon_border),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun RarityIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.card_template_for_android_studio_rarity_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.0.dp,
                top = 7.0.dp,
                end = 3.0.dp,
                bottom = 7.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun RarityIconRarityIconBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 256.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CharacterNameBorder(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_character_name_border),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CharacterName(modifier: Modifier = Modifier) {
    RelayText(
        content = "Personaje videojuego",
        fontFamily = inter,
        height = 1.2102272851126534.em,
        fontWeight = FontWeight(900.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 24.0.dp,
                top = 0.0.dp,
                end = 24.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun CharacterNameCharacterNameBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 19.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 48.0.dp,
                top = 7.0.dp,
                end = 48.0.dp,
                bottom = 7.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VideogameBorder(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_videogame_border),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VideogameIcon(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.card_template_for_android_studio_videogame_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.0.dp,
                top = 6.0.dp,
                end = 8.0.dp,
                bottom = 8.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VideogameIconBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 256.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardHeader(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 18.0.dp,
                end = 16.0.dp,
                bottom = 496.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardImageBorder(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.card_template_for_android_studio_card_image_border),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardImage(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.card_template_for_android_studio_card_image),
        radius = 9.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(paddingValues = PaddingValues(all = 8.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CardImageCardImageBorder(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 9.0,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 56.0.dp,
                top = 72.0.dp,
                end = 56.0.dp,
                bottom = 328.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
