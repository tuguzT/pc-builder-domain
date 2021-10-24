package io.github.tuguzt.pcbuilder.domain.model

/**
 * Represent objects which can be identified by ID.
 */
public interface Identifiable<out T : Any> {
    public val id: T
}
