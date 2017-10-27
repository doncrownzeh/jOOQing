package com.crownzeh.app.mail;
import java.sql.Connection;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.TableLike;
import org.jooq.impl.DSL;
import com.crownzeh.db.Tables;

public class MailComposer {
	
	DSLContext create;
	
	public MailComposer(Connection connection){
		this.create = DSL.using(connection, SQLDialect.POSTGRES_9_3);
        
	}

	public void printUsers(){
		
	create.select().from(Tables.USERS);
	Result<Record> result = create.select().from(Tables.USERS).fetch();
	for(Record r : result){
	    String firstName = r.getValue(Tables.USERS.NAME);
	    String lastName = r.getValue(Tables.USERS.LASTNAME);
	    String eMail = r.getValue(Tables.USERS.EMAIL);
	    System.out.println(firstName + " " + lastName + " " + eMail);
	}
		
	}

	
	
	}
	
