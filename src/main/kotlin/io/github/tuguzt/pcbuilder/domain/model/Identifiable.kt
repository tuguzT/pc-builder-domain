package io.github.tuguzt.pcbuilder.domain.model

/**
 * Represent objects which can be identified by [id].
 */
public interface Identifiable<Id> {
    public val id: Id
}
