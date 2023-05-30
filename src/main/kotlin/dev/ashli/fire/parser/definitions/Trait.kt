package dev.ashli.fire.parser.definitions

import dev.ashli.fire.parser.TopLevel
import dev.ashli.fire.parser.annotations.Annotation
import dev.ashli.fire.resources.ResourceLocation

/**
 * Represents a Fire trait.
 */
class Trait(location: ResourceLocation, annotations: List<Annotation>) :
    TopLevel(location, annotations) {
}