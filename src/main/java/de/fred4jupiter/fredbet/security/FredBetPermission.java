package de.fred4jupiter.fredbet.security;

/**
 * All available permissions in FredBet application.
 * 
 * @author michael
 *
 */
public interface FredBetPermission {

	// match	
	String PERM_CREATE_MATCH = "PERM_CREATE_MATCH";
    String PERM_EDIT_MATCH = "PERM_EDIT_MATCH";
    String PERM_EDIT_MATCH_RESULT = "PERM_EDIT_MATCH_RESULT";
    String PERM_DELETE_MATCH = "PERM_DELETE_MATCH";
    
    String PERM_PASSWORD_RESET = "PERM_PASSWORD_RESET";

    // users
    String PERM_CREATE_USER = "PERM_CREATE_USER";
    String PERM_EDIT_USER = "PERM_EDIT_USER";
    String PERM_DELETE_USER = "PERM_DELETE_USER";
    String PERM_USER_ADMINISTRATION = "PERM_USER_ADMINISTRATION";
    String PERM_CHANGE_USER_ROLE = "PERM_CHANGE_USER_ROLE";
    
    String PERM_BUILD_INFO = "PERM_BUILD_INFO";
    
    String PERM_ADMINISTRATION = "PERM_ADMINISTRATION";
}
