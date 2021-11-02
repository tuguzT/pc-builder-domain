package io.github.tuguzt.pcbuilder.domain.model

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import java.util.*

/**
 * Utility function for default NanoID generation.
 *
 * @see NanoIdUtils.randomNanoId
 */
public fun randomNanoId(
    random: Random = NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
    alphabet: CharArray = NanoIdUtils.DEFAULT_ALPHABET,
    size: Int = NanoIdUtils.DEFAULT_SIZE,
): String = NanoIdUtils.randomNanoId(random, alphabet, size)
