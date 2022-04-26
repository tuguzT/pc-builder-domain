package io.github.tuguzt.pcbuilder.domain.interactor

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import kotlin.random.Random
import kotlin.random.asJavaRandom
import kotlin.random.asKotlinRandom

/**
 * Utility function for default NanoID generation.
 *
 * @see NanoIdUtils.randomNanoId
 */
@Suppress("NOTHING_TO_INLINE")
public inline fun randomNanoId(
    random: Random = defaultNumberGenerator,
    alphabet: CharArray = defaultAlphabet,
    size: Int = defaultSize,
): String = NanoIdUtils.randomNanoId(random.asJavaRandom(), alphabet, size)

/**
 * The default random number generator for NanoID used by this module.
 * Creates cryptographically strong NanoId Strings.
 */
public inline val defaultNumberGenerator: Random get() = NanoIdUtils.DEFAULT_NUMBER_GENERATOR.asKotlinRandom()

/**
 * The default alphabet for NanoID used by this module.
 * Creates url-friendly NanoId Strings using 64 unique symbols.
 */
public inline val defaultAlphabet: CharArray get() = NanoIdUtils.DEFAULT_ALPHABET

/**
 * The default size for NanoID used by this module.
 * Creates NanoId Strings with slightly more unique values than UUID v4.
 */
public inline val defaultSize: Int get() = NanoIdUtils.DEFAULT_SIZE
