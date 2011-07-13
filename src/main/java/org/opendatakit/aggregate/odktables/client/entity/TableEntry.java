package org.opendatakit.aggregate.odktables.client.entity;

/**
 * <p>
 * A TableEntry represents the metadata associated with a table stored in ODK
 * Aggregate. This consists of:
 * <ul>
 * <li>user: the User who owns the table</li>
 * <li>tableID: the client's unique identifier for the table.</li>
 * <li>tableName: the human readable name of the table</li>
 * </ul>
 * </p>
 * 
 * <p>
 * TableEntry is immutable.
 * </p>
 * 
 * @author the.dylan.price@gmail.com
 * 
 */
public class TableEntry
{
    private final User user;
    private final String tableID;
    private final String tableName;

    /**
     * For Gson deserialization.
     */
    @SuppressWarnings("unused")
    private TableEntry()
    {
        this.user = null;
        this.tableID = null;
        this.tableName = null;
    }

    /**
     * Constructs a new TableEntry.
     * 
     * @param user
     *            the user who owns the table
     * @param tableID
     *            the id of the table
     * @param tableName
     *            the human readable name of the table
     */
    public TableEntry(User user, String tableID,
            String tableName)
    {
        this.user = user;
        this.tableID = tableID;
        this.tableName = tableName;
    }
    
    /**
     * @return the user who owns the table
     */
    public User getUser()
    {
        return this.user;
    }

    /**
     * @return the tableID
     */
    public String getTableID()
    {
        return tableID;
    }

    /**
     * @return the tableName
     */
    public String getTableName()
    {
        return tableName;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return String.format("TableEntry [user=%s, tableID=%s, tableName=%s]",
                user, tableID, tableName);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tableID == null) ? 0 : tableID.hashCode());
        result = prime * result
                + ((tableName == null) ? 0 : tableName.hashCode());
        result = prime * result + ((user == null) ? 0 : user.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof TableEntry))
            return false;
        TableEntry other = (TableEntry) obj;
        if (tableID == null)
        {
            if (other.tableID != null)
                return false;
        } else if (!tableID.equals(other.tableID))
            return false;
        if (tableName == null)
        {
            if (other.tableName != null)
                return false;
        } else if (!tableName.equals(other.tableName))
            return false;
        if (user == null)
        {
            if (other.user != null)
                return false;
        } else if (!user.equals(other.user))
            return false;
        return true;
    }
}
