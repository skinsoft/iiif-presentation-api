package de.digitalcollections.iiif.presentation.business.api;

/**
 * Service responsible for deciding if object (identified by identifier) is accessible.
 */
public interface PresentationSecurityService {

  boolean isAccessAllowed(String identifier);

}
