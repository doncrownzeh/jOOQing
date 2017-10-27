/**
 * This class is generated by jOOQ
 */
package com.crownzeh.db;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.3" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.crownzeh.db.tables.records.PlansRecord, java.lang.Integer> IDENTITY_PLANS = Identities0.IDENTITY_PLANS;
	public static final org.jooq.Identity<com.crownzeh.db.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.crownzeh.db.tables.records.PlansRecord> PLANS_PKEY = UniqueKeys0.PLANS_PKEY;
	public static final org.jooq.UniqueKey<com.crownzeh.db.tables.records.UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<com.crownzeh.db.tables.records.PlansRecord, com.crownzeh.db.tables.records.UsersRecord> PLANS__PLANS_USERID_FKEY = ForeignKeys0.PLANS__PLANS_USERID_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.crownzeh.db.tables.records.PlansRecord, java.lang.Integer> IDENTITY_PLANS = createIdentity(com.crownzeh.db.tables.Plans.PLANS, com.crownzeh.db.tables.Plans.PLANS.ID);
		public static org.jooq.Identity<com.crownzeh.db.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = createIdentity(com.crownzeh.db.tables.Users.USERS, com.crownzeh.db.tables.Users.USERS.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.crownzeh.db.tables.records.PlansRecord> PLANS_PKEY = createUniqueKey(com.crownzeh.db.tables.Plans.PLANS, com.crownzeh.db.tables.Plans.PLANS.ID);
		public static final org.jooq.UniqueKey<com.crownzeh.db.tables.records.UsersRecord> USERS_PKEY = createUniqueKey(com.crownzeh.db.tables.Users.USERS, com.crownzeh.db.tables.Users.USERS.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<com.crownzeh.db.tables.records.PlansRecord, com.crownzeh.db.tables.records.UsersRecord> PLANS__PLANS_USERID_FKEY = createForeignKey(com.crownzeh.db.Keys.USERS_PKEY, com.crownzeh.db.tables.Plans.PLANS, com.crownzeh.db.tables.Plans.PLANS.USERID);
	}
}
