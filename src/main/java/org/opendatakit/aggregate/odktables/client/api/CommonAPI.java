package org.opendatakit.aggregate.odktables.client.api;

import java.net.URI;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.opendatakit.aggregate.odktables.client.entity.Permission;
import org.opendatakit.aggregate.odktables.client.entity.User;

/**
 * CommonAPI contains API calls that are common to both SimpleAPI and SynchronizedAPI.
 */
public class CommonAPI
{

    /**
     * Constructs a new instance of CommonAPI, using the anonymous user for API calls. 
     *
     * @param aggregateURI the URI of a running ODK Aggregate instance
     * @throws IOException if there is a problem communicating with the Aggregate server or if it does not exist
     */
    public CommonAPI(URI aggregateURI)
    {
        throw new NotImplementedException();
    }

    /**
     * Constructs a new instance of CommonAPI, using the supplied user identification for API calls.
     *
     * @param aggregateURI the URI of a running ODK Aggregate instance
     * @param userID the ID of the user to use for API calls
     * @throws IOException if there is a problem communicating with the Aggregate server or if it does not exist
     * @throws UserDoesNotExistException if no user with userID exists in Aggregate
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the initial communication to fail
     */
    public CommonAPI(URI aggregateURI, String userID)
    {
        throw new NotImplementedException();
    }

    /**
     * Creates a new user of the odktables API.
     *
     * @param userID a universally unique identifier for the new user. This should be kept private.
     * @param userName the human readable name for the new user.
     * @return the newly created User.
     * @throws UserAlreadyExistsException if a user with userID already exists
     * @throws PermissonDeniedException if the userID used to make the API call does not have write permission on the Users table
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public User createUser(String userID, String userName)
    {
        throw new NotImplementedException();
    }

    /**
     * Retrieves the User with userID.
     *
     * @param userID the unique private identifier of the user
     * @return the User with userID.
     * @throws UserDoesNotExistException if no user with userID exists
     * @throws PermissionDeniedException if the userID used to make the API call does not have read permission on the Users table
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public User getUserByID(String userID)
    {
        throw new NotImplementedException();
    }

    /**
     * Retrieves the User with userUUID.
     *
     * @param userUUID the unique public identifier of the user
     * @return the User with userUUID. Note that trying to retrieve the userID from the returned User will throw an exception.
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws PermissionDeniedException if the userID used to make the API call does not have read permission on the Users table
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public User getUserByUUID(String userUUID)
    {
        throw new NotImplementedException();
    }

    /**
     * Deletes the user with the given userUUID, and all associated permissions. Note that the user with given userUUID must have no links to any tables in Aggregate. A user may delete themselves.
     *
     * @param userUUID the unique public identifier of the user to delete
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws PermissonDeniedException if the userID used to make the call does not have delete permission on the Users table
     * @throws CannotDeleteException if the user still owns one or more tables
     * or is tracking one or more synchronized tables
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public void deleteUser(String userUUID)
    {
        throw new NotImplementedException();
    }

    /**
     * Sets permissions for the given user on the given table.
     *
     * @param userUUID the unique public identifier of the user
     * @param tableUUID the unique identifier of the table
     * @param read true if the user is allowed to read from the table
     * @param write true if the user is allowed to write to the table
     * @param delete true if the user is allowed to delete rows from the table or delete the table
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws TableDoesNotExistException if no table with tableUUID exists
     * @throws PermissonDeniedException if the userID used to make the API call does not have write permission on the Permissions table.
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public void setPermissions(String userUUID, String tableUUID, boolean read, boolean write, boolean delete)
    {
        throw new NotImplementedException();
    }

    /**
     * Sets the permissions for a user to read and write entries in the Permissions table. Note that there is no delete permission--the only way to delete permissions is by deleting a user.
     *
     * @param userUUID the unique public identifier of the user
     * @param read true if the user is allowed to read from the Permissions table
     * @param write true if the user is allowed to write to the Permissions table
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws PermissonDeniedException if the userID used to make the API call does not have write permission on the Permissions table.
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public void setPermissionsPermissions(String userUUID, boolean read, boolean write)
    {
        throw new NotImplementedException();
    }

    /**
     * Sets the permissions for a given user to read, write, and delete entries in the User table
     *
     * @param userUUID the unique public identifier of the user
     * @param read true if the user is allowed to read from the Users table
     * @param create true if the user is allowed to write to the Users table
     * @param delete true if the user is allowed to delete users from the Users table. No user is allowed to delete the Users table itself.
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws PermissonDeniedException if the userID used to make the API call does not have write permission on the Permissions table.
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public void setUsersPermissions(String userUUID, boolean read, boolean write, boolean delete)
    {
        throw new NotImplementedException();
    }

    /**
     * Retrieves all the permissions for a specific user.
     *
     * @param userUUID the unique public identifier of the user
     * @return a list of Permission objects representing all the permissions for the user
     * @throws UserDoesNotExistException if no user with userUUID exists
     * @throws PermissionDeniedException if the userID used to make the API call does not have read permission on the Permissons table.
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public List<Permission> getUserPermissions(String userUUID)
    {
        throw new NotImplementedException();
    }

    /**
     * Retrieves all the permissions for a specific table.
     *
     * @param tableUUID the unique identifier of the table
     * @return a list of Permission objects representing all the permissions for the table
     * @throws TableDoesNotExistException if no table with tableUUID exists
     * @throws PermissionDeniedException if the userID used to make the API call does not have read permission on the Permissons table.
     * @throws AggregateInternalErrorException if Aggregate encounters an
     * internal error that causes the call to fail
     * @throws IOException if there is a problem communicating with the Aggregate server
     */
    public List<Permission> getTablePermissions(String tableUUID)
    {
        throw new NotImplementedException();
    }
}
