/**
 * This class is generated by jOOQ
 */
package com.crownzeh.db.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.3" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends org.jooq.impl.TableImpl<com.crownzeh.db.tables.records.UsersRecord> {

	private static final long serialVersionUID = -1052189608;

	/**
	 * The singleton instance of <code>public.users</code>
	 */
	public static final com.crownzeh.db.tables.Users USERS = new com.crownzeh.db.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.crownzeh.db.tables.records.UsersRecord> getRecordType() {
		return com.crownzeh.db.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>public.users.id</code>.
	 */
	public final org.jooq.TableField<com.crownzeh.db.tables.records.UsersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.users.name</code>.
	 */
	public final org.jooq.TableField<com.crownzeh.db.tables.records.UsersRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.users.lastname</code>.
	 */
	public final org.jooq.TableField<com.crownzeh.db.tables.records.UsersRecord, java.lang.String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.users.email</code>.
	 */
	public final org.jooq.TableField<com.crownzeh.db.tables.records.UsersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>public.users.password</code>.
	 */
	public final org.jooq.TableField<com.crownzeh.db.tables.records.UsersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>public.users</code> table reference
	 */
	public Users() {
		this("users", null);
	}

	/**
	 * Create an aliased <code>public.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		this(alias, com.crownzeh.db.tables.Users.USERS);
	}

	private Users(java.lang.String alias, org.jooq.Table<com.crownzeh.db.tables.records.UsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Users(java.lang.String alias, org.jooq.Table<com.crownzeh.db.tables.records.UsersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.crownzeh.db.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.crownzeh.db.tables.records.UsersRecord, java.lang.Integer> getIdentity() {
		return com.crownzeh.db.Keys.IDENTITY_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.crownzeh.db.tables.records.UsersRecord> getPrimaryKey() {
		return com.crownzeh.db.Keys.USERS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.crownzeh.db.tables.records.UsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.crownzeh.db.tables.records.UsersRecord>>asList(com.crownzeh.db.Keys.USERS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.crownzeh.db.tables.Users as(java.lang.String alias) {
		return new com.crownzeh.db.tables.Users(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.crownzeh.db.tables.Users rename(java.lang.String name) {
		return new com.crownzeh.db.tables.Users(name, null);
	}
}
